/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import paquete2.terreno;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        terreno t = new terreno();
        terreno t2 = new terreno();
        String cadena = "";
        double costoterreno = 0;
        double ancho = 10.00;
        double largo = 10.00;
        double ancho2 = 12.00;
        double largo2 = 12.00;
        double area = 0;
        double valormetrocuadrado = 10.00;
        double valormetrocuadrado2 = 12.00;

        t.establecerancho(ancho);
        t.establecerlargo(largo);
        t.establecervalormetrocuadrado(valormetrocuadrado);
        t.establecerarea();
        t.establecercostoterreno();
        t2.establecerancho(ancho2);
        t2.establecerlargo(largo2);
        t2.establecervalormetrocuadrado(valormetrocuadrado2);
        t2.establecerarea();
        t2.establecercostoterreno();

        cadena = String.format("Costo del terreno1\nAncho: %s\n"
                + "Largo: %.2f\nArea: %.2f\n"
                + "Valor del metro cuadrado: %.2f\nCosto del terreno: %.2f\n\n",
                t.obtenerancho(),
                t.obtenerlargo(), t.obtenerarea(),
                t.obtenervalormetrocuadrado(), t.obtenercostoterreno());

        cadena = String.format("%sCosto del terreno2\nAncho: %s\n"
                + "Largo: %.2f\nArea: %.2f\n"
                + "Valor del metro cuadrado: %.2f\nCosto del terreno: %.2f\n",
                cadena,
                t2.obtenerancho(),
                t2.obtenerlargo(), t2.obtenerarea(),
                t2.obtenervalormetrocuadrado(), t2.obtenercostoterreno());
        System.out.printf("%s", cadena);
    }
}
