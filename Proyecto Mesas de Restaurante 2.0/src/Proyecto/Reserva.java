package Proyecto;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;


/**
 *
 * @author Fabian Hinojosa
 */
public class Reserva{
    private Cliente cliente;
    private LocalDate fechaDeReserva;
    private LocalTime HoraDeReserva;
    private ArrayList<Mesa> numeroMesa;

    public Reserva(){
        super();
        this.numeroMesa = new ArrayList<>();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Mesa> getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(ArrayList<Mesa> numeroMesa) {
        this.numeroMesa = numeroMesa;
    }
    
    public LocalDate getFechaDeReserva() {
        return fechaDeReserva;
    }

    public void setFechaDeReserva(LocalDate fechaDeReserva) {
        this.fechaDeReserva = fechaDeReserva;
    }

    public LocalTime getHoraDeReserva() {
        return HoraDeReserva;
    }

    public void setHoraDeReserva(LocalTime HoraDeReserva) {
        this.HoraDeReserva = HoraDeReserva;
    }
    
    public void ocuparMesa(Mesa mesa) {
        if (mesa.definirEstado() == true) {
            System.out.println("La mesa " + mesa.getNumero() + " está ocupada.");
        } else {
            mesa.setEstado(true);
            this.numeroMesa.add(mesa);
            System.out.println("La mesa " + mesa.getNumero() + " ha sido ocupada.");
        }
    }
 
    public void reservarMesa(Mesa mesa) {
        if (mesa.definirEstado() == true) {
            System.out.println("La mesa " + mesa.getNumero() + " está ocupada, no se puede reservar.");
        } else {
            mesa.setEstado(true);
            this.numeroMesa.add(mesa);
            System.out.println("Mesa " + mesa.getNumero() + " reservada.");
        }
    }
    
    public void eliminarReserva(Mesa mesa){
        if(mesa.definirEstado() == false){
            System.out.println("La mesa " + mesa.getNumero() + " no está reservada ni ocupada.");
        }else{
            mesa.setEstado(false);
            this.numeroMesa.remove(mesa);
            System.out.println("La mesa " + mesa.getNumero() + " ahora esta disponible.");
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

    @Override
    public String toString() {
        return "Cliente: " + this.cliente + ", fecha De Reservacion: " + this.fechaDeReserva 
                + ", hora De Reservacion: " + this.HoraDeReserva 
                + ", Mesa: " + this.numeroMesa;
    }
    
}