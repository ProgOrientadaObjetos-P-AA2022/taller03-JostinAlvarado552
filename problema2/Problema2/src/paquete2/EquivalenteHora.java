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
    private double horas2;
    private double minutos2;
    private double segundos2;
    private double dias2;

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
        dias = horas / 24 ;
    }

    // public void establecerValorFactura(){
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
    public void establecerhoras2(double d) {
        horas2 = d;
    }
    public void establecerminutos2() {
        minutos2 = horas2 * 60;
    }

    public void establecersegundos2() {
        segundos2 = horas2 * 3600;
    }

    public void establecerdias2() {
        dias2 = horas2 / 24 ;
    }

    // public void establecerValorFactura(){
    public double obtenerhoras2() {
        return horas2;
    }

    public double obtenerminutos2() {
        return minutos2;
    }

    public double obtenersegundos2() {
        return segundos2;
    }

    public double obtenerdias2() {
        return dias2;}
}
