/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class EquivalenteHora {

    private double horas;
    private double minutos;
    private double segundos;
    private double dias;

    public void establecerhoras(double c) {
        horas = c;
    }

    public void establecerminutos() {
        minutos = horas * 60;
    }

    public void establecersegundos() {
        segundos = horas * 3600;
    }

    public void establecerdias() {
        dias = horas / 24;
    }

    public double obtenerhoras() {
        return horas;
    }

    public double obtenerminutos() {
        return minutos;
    }

    public double obtenersegundos() {
        return segundos;
    }

    public double obtenerdias() {
        return dias;
    }
}
