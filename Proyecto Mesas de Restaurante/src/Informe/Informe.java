/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Informe;

import Usuarios.Recepcionista;
import Estructura.Sala;


/**
 *
 * @author Fabian Hinojosa
 */
public class Informe {
    private Sala sala;

    public Informe() {
    }

    public Informe(Sala sala) {
        this.sala = sala;
    }
    
    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }
    
    public void generarInformeMesas() {
        System.out.println("\n\n...Generando Informe...");
        System.out.println(this.sala);
        for(Recepcionista recepcionista : this.sala.getEmpleados()) {
            System.out.println(recepcionista.datosReserva());
        }
    }
}