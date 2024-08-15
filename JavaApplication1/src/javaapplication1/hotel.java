/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class hotel {

    habitaciones[][] pisos;

    hotel() {
        //asigna espacios de la matriz para las habitaciones
        this.pisos = new habitaciones[5][5];
    }

    public void menu() {

        //condicion para repetir la llamada al menu principal y usar varias acciones
        boolean salir = false;

        //menu para que sea repetitivo hasta querer salir
        while (salir == false) {

            //opcion del usuario
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("1) Mostrar habitaciones 2) Modificar habitacion 3) Resumen"));

            //ejecucion de acciones segun el usuario
            if (opcion == 1) {
                mostrarHabitaciones();
            } else if (opcion == 2) {
                modificarHabitacion();
            } else if (opcion == 3) {
                mostrarResumen();
            } else {
                salir = true;
            }
        }

    }

    public void mostrarHabitaciones() {

        //mensaje a imprimir
        String datosHabitacion = "";
        //recorremos la matriz
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                //guardamos la informacion de la habitacion en un mensaje para imprimir todo junto
                datosHabitacion = datosHabitacion + "Piso: " + (i + 1) + "\n"; //mas uno para evitar mostrar 0 al usuario y el salto de linea
                datosHabitacion = datosHabitacion + "Habitacion numero: " + this.pisos[i][j].getNumeroHabitacion() + "\n";
                datosHabitacion = datosHabitacion + "Estado: " + this.pisos[i][j].getEstado() + "\n";
                datosHabitacion = datosHabitacion + "Tipo: " + this.pisos[i][j].getTipo() + "\n";
                datosHabitacion = datosHabitacion + "Precio: " + this.pisos[i][j].getPrecio() + "\n";
                datosHabitacion = datosHabitacion + "=======================================\n";
            }
        }

        JOptionPane.showMessageDialog(null, datosHabitacion);
    }

    public void modificarHabitacion() {
        //guardar la habitacion a buscar
        int numeroHabitacion = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero habitacion que desea modificar"));

        //recordar si encontramos o no la habitacion que buscamos
        boolean habitacionValida = false;

        //recorremos la matriz
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                //buscar la habitacion
                if (this.pisos[i][j].getNumeroHabitacion() == numeroHabitacion) {
                    //recordar que se encontro la habitacion
                    habitacionValida = true;

                    //solicitar nuevos datos de la habitacion
                    System.out.println("Modificando habitacion " + this.pisos[i][j].getNumeroHabitacion());
                    int nuevoNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite el nuevo numero de habitacion: "));
                    String nuevoEstado = JOptionPane.showInputDialog("Digite el nuevo estado: ");
                    String nuevoTipo = JOptionPane.showInputDialog("Digite el nuevo Tipo:");
                    Double nuevoPrecio = Double.parseDouble(JOptionPane.showInputDialog("Digite el nuevo precio: "));

                    //sobrescribe la habitacion
                    this.pisos[i][j].setNumeroHabitacion(nuevoNumero);
                    this.pisos[i][j].setEstado(nuevoEstado);
                    this.pisos[i][j].setTipo(nuevoTipo);
                    this.pisos[i][j].setPrecio(nuevoPrecio);

                    JOptionPane.showMessageDialog(null, "Habitacion cambiada con exito");
                }
            }
        }

        //si no encontramos la habiacion, decirlo en pantalla
        if (habitacionValida == false) {
            JOptionPane.showMessageDialog(null, "La habitacion digitada no existe: " + numeroHabitacion);
        }

    }

    public void mostrarResumen() {

        //contadores de habitaciones
        int habitacionesSucias = 0;
        int habitacionesLibre = 0;
        int habitacionesOcupadas = 0;

        //recorremos la matriz
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                //averiguamos el estado y contamos
                if (this.pisos[i][j].getEstado() == "Libre") {
                    habitacionesLibre = habitacionesLibre + 1;
                } else if (this.pisos[i][j].getEstado() == "Sucia") {
                    habitacionesSucias = habitacionesSucias + 1;
                } else if (this.pisos[i][j].getEstado() == "Ocupada") {
                    habitacionesOcupadas = habitacionesOcupadas + 1;
                }
            }
        }

        //el mensaje para imprimir todo junto
        String mensaje = "";
        mensaje = mensaje + "Hay un total de " + habitacionesLibre + " Habitaciones libres \n";
        mensaje = mensaje + "Hay un total de " + habitacionesSucias + " Habitaciones Sucias \n";
        mensaje = mensaje + "Hay un total de " + habitacionesOcupadas + " Habitaciones Ocupadas \n";
        mensaje = mensaje + "====================================================================\n";

        mensaje = mensaje + "Hay un " + (habitacionesLibre * 100) / 25 + "% de Habitaciones Libres\n"; //tenemos 25 habitaciones
        mensaje = mensaje + "Hay un " + (habitacionesSucias * 100) / 25 + "% de Habitaciones Sucias\n";
        mensaje = mensaje + "Hay un " + (habitacionesOcupadas * 100) / 25 + "% de Habitaciones Ocupadas\n";

        JOptionPane.showMessageDialog(null, mensaje);
    }

    //habitaciones del ejemplo guardadas
    public void llenarHabitaciones() {

        //piso 1
        pisos[0][0] = new habitaciones(101, "Libre", "Simple", 30);
        pisos[0][1] = new habitaciones(102, "Libre", "Doble", 30);
        pisos[0][2] = new habitaciones(103, "Libre", "Simple", 30);

        //piso 2
        pisos[1][0] = new habitaciones(201, "Libre", "Simple", 40);
        pisos[1][1] = new habitaciones(202, "Libre", "Doble", 40);
        pisos[1][2] = new habitaciones(203, "Libre", "Simple", 40);

        //piso 3
        pisos[2][0] = new habitaciones(301, "Sucia", "Doble", 50);
        pisos[2][1] = new habitaciones(302, "Libre", "Doble", 60);
        pisos[2][2] = new habitaciones(303, "Libre", "Simple", 40);

        //piso 4
        pisos[3][0] = new habitaciones(401, "Ocupada", "Simple", 50);
        pisos[3][1] = new habitaciones(402, "Libre", "Doble", 60);
        pisos[3][2] = new habitaciones(403, "Libre", "Simple", 40);

        //piso 5
        pisos[4][0] = new habitaciones(501, "Libre", "Simple", 50);
        pisos[4][1] = new habitaciones(502, "Libre", "Doble", 60);
        pisos[4][2] = new habitaciones(503, "Libre", "Simple", 40);

    }
}
