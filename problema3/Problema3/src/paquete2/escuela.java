/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author USUARIO 2021
 */
public class escuela {

    private String nombre;
    private String tipodeinstitucion;
    private int numalumnos;
    private int numdocentes;
    private int numsedes;
    private double gastosporestudiante;
    private double presupuesto;

    public void establecernombre(String c) {
        nombre = c;
    }

    public void establecertipo(String d) {
        tipodeinstitucion = d;
    }

    public void establecernumalumnos(int e) {
        numalumnos = e;
    }

    public void establecernumdocentes(int f) {
        numdocentes = f;
    }

    public void establecernumsedes(int g) {
        numsedes = g;
    }

    public void establecergastosestudiante(double h) {
        gastosporestudiante = h;
    }

    public void establecerpresupuesto(double h) {
        presupuesto = numalumnos * gastosporestudiante;
    }

    public String obtenernombre() {
        return nombre;
    }

    public String obtenertipo() {
        return tipodeinstitucion;
    }

    public int obtenernumalumnos() {
        return numalumnos;
    }

    public int obtenernumdocentes() {
        return numdocentes;
    }

    public int obtenernumsedes() {
        return numsedes;
    }

    public double obtenergastosestudiante() {
        return gastosporestudiante;
    }

    public double obtenerpresupuesto() {
        return presupuesto;
    }

}
