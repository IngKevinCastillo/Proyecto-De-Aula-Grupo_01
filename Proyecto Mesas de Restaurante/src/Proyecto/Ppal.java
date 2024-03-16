/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Proyecto;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Fabian Hinojosa
 */
public class Ppal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mesa mesa1 = new Mesa(1, 4);
        Mesa mesa2 = new Mesa(2, 6);
        Mesa mesa3 = new Mesa(3, 2);
        
        Reserva reserva = new Reserva("Juan", 4, LocalDate.now(), LocalTime.now());
        
        reserva.agregarMesa(mesa1);
        reserva.agregarMesa(mesa2);
        reserva.agregarMesa(mesa3);
        
        reserva.ocuparMesa(mesa1);
        reserva.reservarMesa(reserva, mesa2);
        reserva.reservarMesa(reserva, mesa1);
    }
}