/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;

import java.util.ArrayList;

/**
 *
 * @author Fabian Hinojosa
 */
public class Informe{
    private ArrayList<Reserva> reservasNormales;
    private ArrayList<SalaVIP> reservasVIP;
    
    public Informe(){
        this.reservasVIP = new ArrayList();
        this.reservasNormales = new ArrayList();
    }

    public Informe(ArrayList<Reserva> reservasNormales, ArrayList<SalaVIP> reservasVIP) {
        this.reservasNormales = reservasNormales;
        this.reservasVIP = reservasVIP;
    }

    public void generarInformeMesas() {
        System.out.println("\n\n...Generando Informe...");
        
        for (Reserva reserva : reservasNormales) {
            for (Mesa mesa : reserva.getNumeroMesa()) {
                System.out.println("Mesa: " + mesa.getNumero() +
                        ", Nombre: " + reserva.getNombre() +
                        ", Cedula: " + reserva.getCedula() +
                        ", Fecha: " + reserva.getFechaDeReservacion() +
                        ", Hora: " + reserva.getHoraDeReservacion());
            }
        }

        for (SalaVIP reservaVIP : reservasVIP) {
            for (Mesa mesa : reservaVIP.getNumeroMesa()) {
                System.out.println("Mesa: " + mesa.getNumero() +
                        ", Nombre: " + reservaVIP.getNombre() +
                        ", Cedula: " + reservaVIP.getCedula() +
                        ", Fecha: " + reservaVIP.getFechaDeReservacion() +
                        ", Hora: " + reservaVIP.getHoraDeReservacion());
            }
        }
    }
}
