/*
 * Módulo: DI.
 * Archivo: Impresora.java
 * Objetivo: Tarea de la Unidad 8.
 * Equipo/Personas: Nicolás Esteban Bórquez - 55124290Y
 */
package t8;

/**
 * Clase Impresora sobre la que se realizarán las pruebas unitarias
 *
 * @author Nicolás Esteban Bórquez
 * @version 1.0
 */
public class Impresora {

    /**
     * Indica la capacidad del tóner en páginas.
     */
    int capacidadToner;

    /**
     * Indica la cantidad de páginas que quedan por imprimir.
     */
    int cantidadToner;

    /**
     * Método que devuelve la capacidad del tóner.
     *
     * @return Capacidad del tóner.
     */
    public int getCapacidadToner() {
        return capacidadToner;
    }

    /**
     * Método que devuelve la cantidad de páginas que quedan por imprimir.
     *
     * @return Cantidad de tóner.
     */
    public int getCantidadToner() {
        return cantidadToner;
    }

    /**
     * Constructor con 1 parámetro.
     *
     * @param cantidadToner Indica la cantidad de tóner con el que se crea la impresora.
     */
    public Impresora(int cantidadToner) {

        if (cantidadToner > 0) {
            this.capacidadToner = cantidadToner;
            this.cantidadToner = this.capacidadToner;
        } else {
            this.capacidadToner = 100;
            this.cantidadToner = this.capacidadToner;
        }

    }

    /**
     * Método que imprime las páginas y actualiza la cantidad de tóner restante.
     *
     * @param paginasImprimir Nº d páginas que se imprimirán y se restarán de la cantidad de tóner.
     */
    public void imprime(int paginasImprimir) {
        cantidadToner -= paginasImprimir;
    }

    /**
     * Método que calcula el estado del tóner en base a su capacidad y la cantidad de hojas que quedan por imprimir.
     *
     * @return porcantaje de tóner restante.
     */
    public double estadoToner() {
        double estadoToner = (double) cantidadToner / (double) capacidadToner;
        return estadoToner;
    }
}
