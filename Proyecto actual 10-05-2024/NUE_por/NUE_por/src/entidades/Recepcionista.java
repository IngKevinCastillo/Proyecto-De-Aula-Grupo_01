/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.time.*;
import java.util.*;

/**
 *
 * @author Fabian Hinojosa
 */
public class Recepcionista extends Usuario {
    private ArrayList<Reserva> listaReservas;

    public Recepcionista() {
        listaReservas = new ArrayList<>();
        permisos = new Permisos();
    }

    public Recepcionista(String usuario, String contraseña, String nombre, String apellido, long cedula) {
        super(usuario, contraseña, nombre, apellido, cedula);
        
        if (permisos == null) {
            permisos = new Permisos();
        }
        
        listaReservas = new ArrayList<>();
        permisos.setEstadoMesas(true);
        permisos.setGestionReserv(true);
        permisos.setGestionSalas(false);
        permisos.setGestionUsuario(false);
        permisos.setModificarMesas(false);
    }

    public ArrayList<Reserva> getListaReservas() {
        return listaReservas;
    }

    public void setListaReservas(ArrayList<Reserva> listaReservas) {
        this.listaReservas = listaReservas;
    }

    public void crearReserva(Cliente cliente, Mesa mesa, LocalDate fecha, LocalTime hora) {
        if(this.permisos.isGestionReserv()==false){
            System.out.println(" Sin acesso al sistema");
        }else{
            Reserva reserva = new Reserva();
            reserva.setCliente(cliente);
            reserva.reservarMesa(cliente, mesa, fecha, hora);
            listaReservas.add(reserva);
        }
    }

    public void quitarReserva(Mesa mesa) {
        if(this.permisos.isGestionReserv()==false){
            System.out.println(" Sin acesso al sistema");
        }else{
        for (Reserva reserva : listaReservas) {
                if (reserva.getMesaReservar().contains(mesa)) {
                    listaReservas.remove(reserva);
                    reserva.eliminarReserva(mesa);
                    return;
                }
            }
        }
    }

    public void ocuparMesaAhora(Cliente cliente, Mesa mesa) {
        if(permisos.isEstadoMesas()==false){
            System.out.println(" Sin acesso al sistema");
        }else{
            Reserva reserva = new Reserva();
            reserva.setCliente(cliente);
            reserva.ocuparMesa(cliente, mesa);
            listaReservas.add(reserva);
        }
    }

    public void desocuparMesaAhora(Mesa mesa) {
        if(permisos.isEstadoMesas()==false){
            
            System.out.println(" Sin acesso al sistema");
        }else{
            for (Reserva reserva : listaReservas) {
                if (reserva.getMesaReservar().contains(mesa)) {
                    listaReservas.remove(reserva);
                    reserva.desocuparMesa(mesa);
                    break;
                }
            }
        }
    }
    
    public String datosReserva() {
        StringBuilder builder = new StringBuilder("Reservas: \n");
        for (Reserva reserva : listaReservas) {
            builder.append(reserva.toString()).append("\n");
        }
        return builder.toString();
    }
    
}