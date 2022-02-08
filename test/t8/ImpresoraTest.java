package t8;

import org.junit.AfterClass;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Nicolas Esteban Borquez 55124290Y
 */
public class ImpresoraTest {

    static Impresora impresora1;
    static Impresora impresora2;

    @BeforeClass
    public static void inicializacion() {

        System.out.println("Creados 2 objetos Impresora");
        impresora1 = new Impresora(500);
        impresora2 = new Impresora(200);

        //Cantidad de páginas que se imprimirán
        int paginasImprimir = 20;

        //Llamada al método que imprimirá 20 páginas
        impresora1.imprime(paginasImprimir);
        impresora2.imprime(paginasImprimir);
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("[  PRUEBAS FINALIZADAS  ]");
    }

    @Test
    public void testImpresora() {
        System.out.println("Probando constructor 'Impresora'");

        Impresora test1 = new Impresora(360);
        assertEquals(360, test1.getCapacidadToner());

        Impresora test2 = new Impresora(-250);
        assertEquals(100, test2.getCapacidadToner());
    }

    @Test
    public void testImprime() {
        System.out.println("Probando método 'imprime'");

        //Impresora1 creada con una capacidad de 500, debería tener ahora 480
        assertEquals(480, impresora1.getCantidadToner());

        //Impresora2 creada con una capacidad de 200, debería tener ahora 180
        assertEquals(180, impresora2.getCantidadToner());
    }

    @Test
    public void testEstadoToner() {
        System.out.println("Probando método 'estadoToner'");

        // Test de la impresora1
        double esperado1 = 0.96;
        double actual1 = impresora1.estadoToner();
        double margenPermitido1 = 0.01;
        assertEquals(esperado1, actual1, margenPermitido1);

        // Test de la impresora2
        double esperado2 = 0.9;
        double actual2 = impresora2.estadoToner();
        double margenPermitido2 = 0.01;
        assertEquals(esperado2, actual2, margenPermitido2);
    }
}
