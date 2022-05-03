/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Locale;
import paquete2.EquivalenteHora;

/**
 *
 * @author reroes
 */
public class Ejecutor2 {

    public static void main(String[] args) {
        EquivalenteHora e = new EquivalenteHora();
        EquivalenteHora f = new EquivalenteHora();
        String cadena = "";
        double horas = 10;
        double horas2 = 30;
        e.establecerhoras(horas);
        e.establecerminutos();
        e.establecersegundos();
        e.establecerdias();

        f.establecerhoras(horas2);
        f.establecerminutos();
        f.establecersegundos();
        f.establecerdias();
        cadena = String.format("Equivalencias\n\nHoras: %s\n"
                + "Minutos:: %.2f\nSegundos: %.2f\n"
                + "Dias: %.2f\n\n",
                e.obtenerhoras(),
                e.obtenerminutos(),
                e.obtenersegundos(),
                e.obtenerdias());

        cadena = String.format("%sEquivalencias 2\n\nHoras: %s\n"
                + "Minutos:: %.2f\nSegundos: %.2f\n"
                + "Dias: %.2f\n", cadena,
                f.obtenerhoras(),
                f.obtenerminutos(),
                f.obtenersegundos(),
                f.obtenerdias());
        
        System.out.printf("%s", cadena);
    }
}
