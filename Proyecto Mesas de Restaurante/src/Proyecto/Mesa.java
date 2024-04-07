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
public class Mesa {
    private int numeroMesa;
    private int numeroDeAsientos;
    private boolean estado;
    private Reserva reserva;

    public Mesa(int numeroMesa, int numeroDeAsientos) {
        this.numeroMesa = numeroMesa;
        this.numeroDeAsientos = numeroDeAsientos;
    }

    public int getNumero() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public int getNumeroDeAsientos() {
        return numeroDeAsientos;
    }

    public void setNumeroDeAsientos(int numeroDeAsientos) {
        this.numeroDeAsientos = numeroDeAsientos;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public boolean definirEstado() {
        return estado;
    }
}