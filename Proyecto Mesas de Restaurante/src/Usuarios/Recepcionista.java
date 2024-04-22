/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuarios;

import Estructura.Mesa;
import Estructura.Reserva;
import Usuarios.Persona;
import Usuarios.Cliente;
import java.time.*;
import java.util.*;

/**
 *
 * @author Fabian Hinojosa
 */
public class Recepcionista extends Persona{
    private String contrasenia;
    private ArrayList<Reserva> reservas;

    public Recepcionista() {
        this.reservas = new ArrayList<>();
    }

    public Recepcionista(String contrasenia, String nombre, String apellido, int cedula) {
        super(nombre, apellido, cedula);
        this.contrasenia = contrasenia;
        this.reservas = new ArrayList<>();
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public void crearReserva(Cliente cliente, Mesa mesa, LocalDate fecha, LocalTime hora) {
        Reserva reserva = new Reserva();
        reserva.reservarMesa(mesa);
        reserva.setCliente(cliente);
        reserva.setFechaDeReserva(fecha);
        reserva.setHoraDeReserva(hora);
        reservas.add(reserva);
    }

    public void quitarReserva(Mesa mesa) {
        for (Reserva reserva : reservas) {
            if (reserva.getNumeroMesa().contains(mesa)) {
                reservas.remove(reserva);
                reserva.eliminarReserva(mesa);
                return; //Salir del método una vez que se elimine la reserva
            }
        }
    }

    public void ocuparMesaAhora(Cliente cliente, Mesa mesa) {
        Reserva reserva = new Reserva();
        reserva.ocuparMesa(mesa);
        reserva.setCliente(cliente);
        reserva.setFechaDeReserva(LocalDate.now());
        reserva.setHoraDeReserva(LocalTime.now());
        reservas.add(reserva);
    }

    public void desocuparMesaAhora(Mesa mesa) {
        for (Reserva reserva : reservas) {
            if (reserva.getNumeroMesa().contains(mesa)) {
                reservas.remove(reserva);
                reserva.desocuparMesa(mesa);
                break;
            }
        }
    }

    public String datosReserva() {
        StringBuilder builder = new StringBuilder("Reservas: \n");
        for (Reserva reserva : reservas) {
            builder.append(reserva.toString()).append("\n");
        }
        return builder.toString();
    }
}
