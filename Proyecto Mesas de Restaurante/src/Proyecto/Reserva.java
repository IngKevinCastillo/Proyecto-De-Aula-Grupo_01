package Proyecto;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author Fabian Hinojosa
 */
public class Reserva{
    private String nombre;
    private int cedula;
    private LocalDate fechaDeReservacion;
    private LocalTime horaDeReservacion;
    private ArrayList<Mesa> numeroMesa;
    private int cantidadClientes;

    public Reserva(){
        super();
        this.nombre = "Pepito";
        this.cedula = 1234567890;
    }

    public Reserva(String nombre, int cedula, LocalDate fechaDeReservacion, LocalTime horaDeReservacion, int cantidadClientes) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.fechaDeReservacion = fechaDeReservacion;
        this.horaDeReservacion = horaDeReservacion;
        this.numeroMesa = new ArrayList<>();
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
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

    public ArrayList<Mesa> getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(ArrayList<Mesa> numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public int getCantidadClientes() {
        return cantidadClientes;
    }

    public void setCantidadClientes(int cantidadClientes) {
        this.cantidadClientes = cantidadClientes;
    }
    
    public void ocuparMesa(Mesa mesa) {
        if (mesa.definirEstado() == true) {
            System.out.println("La mesa " + mesa.getNumero() + " está ocupada.");
        } else {
            mesa.setEstado(true);
            this.numeroMesa.add(mesa); // Agregar la mesa a la lista numeroMesa
            System.out.println("La mesa " + mesa.getNumero() + " ha sido ocupada.");
        }
    }
    
    public void reservarMesa(Reserva reserva,Mesa mesa) {
        if (mesa.definirEstado() == true) {
            System.out.println("La mesa " + mesa.getNumero() + " está ocupada, no se puede reservar.");
        } else {
            reserva.ocuparMesa(mesa);
            System.out.println("Mesa " + mesa.getNumero() + " reservada para " + reserva.getNombre());
        }
    }
    
    public void desocuparMesa(Mesa mesa){
        if(mesa.definirEstado() == false){
            System.out.println("La mesa " + mesa.getNumero() + " está desocupada.");
        }else{
            mesa.setEstado(false);
            System.out.println("La mesa " + mesa.getNumero() + " ha sido desocupada.");
        }
    }
}
