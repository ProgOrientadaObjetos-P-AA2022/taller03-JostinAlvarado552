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
        double costoterreno;
        double ancho = 10.00;
        double largo = 10.00;
        double area;
        double valormetrocuadrado = 10.00;

        t.establecerancho(ancho);
        t.establecerlargo(largo);
        t.establecervalormetrocuadrado(valormetrocuadrado);
        t.establecerarea();
        t.establecercostoterreno();

        System.out.printf("Costo del terreno\n\nAncho: %s\n"
                + "Largo:: %.2f\nArea:: %.2f\n"
                + "Valor del metro cuadrado: %.2f\nCosto del terreno: %.2f\n",
                t.obtenerancho(),
                t.obtenerlargo(), t.obtenerarea(),
                t.obtenervalormetrocuadrado(),t.obtenercostoterreno());
    }
}
