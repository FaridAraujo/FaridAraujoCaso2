/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Aulas Heredia
 */
public class JavaApplication1 {

    /**
     * cada habitación ha de tener numero de identificación ha de tener un tipo
     * (ya sea simple, doble, etc...) un precio por noche y un estado que
     * indique si esá libre, ocupado, reservada o si ocupa ser limpiada
     *
     * El sistema será usado por personal de recepción
     *
     * Debe tener precargadas todas las habitaciones, organizadas por piso y
     * numeradas secuencialmente (para ello se puede usar una matriz de menor
     * tamaño que la del ejemplo)
     *
     * El sistema debe de incluir una opción que permita al personal de
     * recepción visualizar el estado de todas las habitaciones del hotel,
     * mostrando su número, tipo, precio por noche y estado actual
     *
     * El sistema debe de permitir la modificación de la información de
     * cualquier habiación, incluyendo su estado, tipo y precio por noche esto
     * con el fin de reflejar los cambios en tiempo real
     *
     * La ganancia actual del hotel, basada en la suma del precio de las
     * habitaciones ocupadas
     */
    public static void main(String[] args) {

        // crear el hotel
        hotel hotel = new hotel();
        // precargar las habitaciones
        hotel.llenarHabitaciones();
        // ejecutar el menu
        hotel.menu();
    }

}
