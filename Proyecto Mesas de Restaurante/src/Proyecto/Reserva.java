package Proyecto;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Fabian Hinojosa
 */
public class Reserva {
    private String nombre;
    private int cantidadDeClientes;
    private LocalDate fechaDeReservacion;
    private LocalTime horaDeReservacion;
    private ArrayList<Mesa> numeroMesa;

    public Reserva() {
        this.numeroMesa = new ArrayList<>();
    }

    public Reserva(String nombre, int cantidadDeClientes, LocalDate fechaDeReservacion, LocalTime horaDeReservacion) {
        this();
        this.nombre = nombre;
        this.cantidadDeClientes = cantidadDeClientes;
        this.fechaDeReservacion = fechaDeReservacion;
        this.horaDeReservacion = horaDeReservacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadDeClientes() {
        return cantidadDeClientes;
    }

    public void setCantidadDeClientes(int cantidadDeClientes) {
        this.cantidadDeClientes = cantidadDeClientes;
    }

    public LocalDate getFechaDeReservacion() {
        return fechaDeReservacion;
    }

    public void setFechaDeReservacion(LocalDate fechaDeReservacion) {
        this.fechaDeReservacion = fechaDeReservacion;
    }

    public LocalTime getHoraDeReservacion() {
        return horaDeReservacion;
    }

    public void setHoraDeReservacion(LocalTime horaDeReservacion) {
        this.horaDeReservacion = horaDeReservacion;
    }

    public ArrayList<Mesa> getMesa() {
        return numeroMesa;
    }

    public void setMesa(ArrayList<Mesa> numeroMesa) {
        this.numeroMesa = numeroMesa;
    }
    
    public void agregarMesa(Mesa mesa) {
        numeroMesa.add(mesa);
    }

    public void ocuparMesa(Mesa mesa) {
        if (mesa.definirEstado()) {
            JOptionPane.showMessageDialog(null, "La mesa " + mesa.getNumero() + " está ocupada.");
        } else {
            mesa.setEstado(true);
            JOptionPane.showMessageDialog(null, "La mesa " + mesa.getNumero() + " ha sido ocupada.");
        }
    }
    
    public void reservarMesa(Reserva reserva, Mesa mesa) {
        if (!mesa.definirEstado()) {
            JOptionPane.showMessageDialog(null, "La mesa " + mesa.getNumero() + " está ocupada, no se puede reservar.");
        } else {
            mesa.setEstado(false);
            reserva.agregarMesa(mesa);
            JOptionPane.showMessageDialog(null, "Mesa " + mesa.getNumero() + " reservada para " + reserva.getNombre());
        }
    }
}
