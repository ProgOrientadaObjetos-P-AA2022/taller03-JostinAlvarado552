/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import paquete2.EquivalenteHora;

/**
 *
 * @author reroes
 */
public class Ejecutor2 {

    public static void main(String[] args) {
        EquivalenteHora e = new EquivalenteHora();
        double horas = 10;
        double horas2 = 30;
        e.establecerhoras(horas);
        e.establecerminutos();
        e.establecersegundos();
        e.establecerdias();
        e.establecerhoras2(horas2);
        e.establecerminutos2();
        e.establecersegundos2();
        e.establecerdias2();
        System.out.printf("Equivalencias\n\nHoras: %s\n"
                + "Minutos:: %.2f\nSegundos: %.2f\n"
                + "Dias: %.2f\n\n",
                e.obtenerhoras(),
                e.obtenerminutos(), e.obtenersegundos(),
                e.obtenerdias());
        
        System.out.printf("Equivalencias 2\n\nHoras: %s\n"
                + "Minutos:: %.2f\nSegundos: %.2f\n"
                + "Dias: %.2f\n",
                e.obtenerhoras2(),
                e.obtenerminutos2(), e.obtenersegundos2(),
                e.obtenerdias2());
    }
}
