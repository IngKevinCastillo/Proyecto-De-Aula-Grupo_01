/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Proyecto;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author Fabian Hinojosa
 */
public class Ppal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Cliente C1 = new Cliente(3248971670L, "Ronald", "Araujo", 11098735619L);
        Cliente C2 = new Cliente(3126782693L, "Maria", "Ruiz", 77865245);
        Gerente G = new Gerente("abcdefg", "Jhon", "Ruz", 1065754271);
        Recepcionista P1 = new Recepcionista("ABCDEF", "Luis", "Diaz", 36784612);
        
        Mesa mesa1 = new Mesa(1, 4);
        Mesa mesa2 = new Mesa(2, 6);
        Mesa mesa3 = new Mesa(3, 2);
        Mesa mesa4 = new Mesa(4, 8);
        
        P1.crearReserva(C1, mesa1, LocalDate.now(), LocalTime.now());
        P1.crearReserva(C1, mesa4, LocalDate.of(2024, 4, 25), LocalTime.of(10, 50));
        P1.ocuparMesaAhora(C2, mesa3);
        P1.ocuparMesaAhora(C1, mesa2);
        
        //P1.quitarReserva(mesa1);
        //P1.desocuparMesaAhora(mesa2);
        
        ArrayList<Mesa> mesas = new ArrayList<>();
        mesas.add(mesa1);
        mesas.add(mesa2);
        mesas.add(mesa3);
        mesas.add(mesa4);
        
        ArrayList<Recepcionista> empleados = new ArrayList<>();
        empleados.add(P1);
        
        Sala sala = new Sala(mesas, empleados);
        Informe informe = new Informe(sala);
        
        G.setInforme(informe);
        G.generarInforme();
    }
}