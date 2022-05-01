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
public class terreno {

    private double costoterreno;
    private double ancho;
    private double largo;
    private double area;
    private double valormetrocuadrado;

    public void establecercostoterreno() {
        costoterreno = area * valormetrocuadrado;
    }

    public void establecerancho(double c) {
        ancho = c;
    }

    public void establecerlargo(double c) {
        largo = c;
    }

    public void establecerarea() {
        area = largo * ancho;
    }

    public void establecervalormetrocuadrado(double c) {
        valormetrocuadrado = c;
    }

    // public void establecerValorFactura(){
    public double obtenercostoterreno() {
        return costoterreno;
    }

    public double obtenerancho() {
        return ancho;
    }

    public double obtenerlargo() {
        return largo;
    }

    public double obtenerarea() {
        return area;
    }

    public double obtenervalormetrocuadrado() {
        return valormetrocuadrado;
    }

}
