/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Aulas Heredia
 */
public class habitaciones {

    //atributos
    private int numeroHabitacion;
    private String estado;
    private String tipo;
    private double precio;

    // constructor 
    habitaciones(int numeroHabitacion, String estado, String tipo, double precio) {
        this.numeroHabitacion = numeroHabitacion;
        this.estado = estado;
        this.tipo = tipo;
        this.precio = precio;

    }

    //gets
    public int getNumeroHabitacion() {
        return this.numeroHabitacion;
    }

    public String getEstado() {
        return this.estado;
    }

    public String getTipo() {
        return this.tipo;
    }

    public Double getPrecio() {
        return this.precio;
    }

    //sets
    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
