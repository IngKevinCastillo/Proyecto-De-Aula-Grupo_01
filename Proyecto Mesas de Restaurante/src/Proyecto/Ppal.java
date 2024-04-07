/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Proyecto;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

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
        Mesa mesa4 = new Mesa(4, 2);
        
        ArrayList<Reserva> reservasNormales = new ArrayList();
        ArrayList<SalaVIP> reservasVIP = new ArrayList();
        
        Reserva R1 = new Reserva("Juan", 1234567890, LocalDate.now(), LocalTime.now(), 4);
        Reserva R2 = new Reserva("Kevin", 1065423471, LocalDate.now(), LocalTime.now(), 2);
        Reserva R3 = new Reserva("Keider", 1123952094, LocalDate.now(), LocalTime.now(), 6);
        
        R1.ocuparMesa(mesa1);
        R2.ocuparMesa(mesa3);
        R3.ocuparMesa(mesa2);
        
        reservasNormales.add(R1);
        reservasNormales.add(R2);
        reservasNormales.add(R3);
        
        System.out.println("------------------------------------------------------");
        
        R2.reservarMesa(R2, mesa4);
        
        System.out.println("------------------------------------------------------");
        
        R2.desocuparMesa(mesa4);
        
        R2.reservarMesa(R2, mesa4);
        
        System.out.println("------------------------------------------------------");
        
        Mesa mesaVIP1 = new Mesa(10, 2);
        Mesa mesaVIP2 = new Mesa(11, 4);
        Mesa mesaVIP3 = new Mesa(12, 6);
        Mesa mesaVIP4 = new Mesa(13, 8);
        
        SalaVIP R4 = new SalaVIP("HJK54C", "Sebástian", 1265492484, LocalDate.now(), LocalTime.now(), 2);
        SalaVIP R5 = new SalaVIP("HVK24C", "Pepito", 1234783467, LocalDate.now(), LocalTime.now(), 6);
        
        reservasVIP.add(R4);
        reservasVIP.add(R5);
        
        R4.ocuparMesa(mesaVIP1);
        
        Informe info = new Informe(reservasNormales, reservasVIP);
        info.generarInformeMesas();
    }
}