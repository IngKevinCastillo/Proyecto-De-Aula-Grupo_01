package entidades;

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
    private ArrayList<Mesa> mesaReservar;
    private boolean estadoReserva;

    public Reserva(){
        super();
        this.mesaReservar = new ArrayList<>();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Mesa> getMesaReservar() {
        return mesaReservar;
    }

    public void setMesaReservar(ArrayList<Mesa> mesaReservar) {
        this.mesaReservar = mesaReservar;
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
    
    public boolean isEstadoReserva() {
        return estadoReserva;
    }

    public void setEstadoReserva(boolean estadoReserva) {
        this.estadoReserva = estadoReserva;
    }
    
    public void ocuparMesa(Cliente cliente, Mesa mesa) {
        if (mesa.definirEstado() == true) {
            System.out.println("La mesa " + mesa.getNumero() + " está ocupada.");
        } else {
            mesa.setEstado(true);
            this.mesaReservar.add(mesa);
            this.fechaDeReserva = LocalDate.now();
            this.HoraDeReserva = LocalTime.now();
            System.out.println("La mesa " + mesa.getNumero() + " ha sido ocupada.");
        }
    }
 
    public void reservarMesa(Cliente cliente, Mesa mesa, LocalDate fecha, LocalTime hora) {
        if (mesa.definirEstado() == true) {
            System.out.println("La mesa " + mesa.getNumero() + " está ocupada, no se puede reservar.");
        } else {
            mesa.setEstado(true);
            setEstadoReserva(true);
            this.mesaReservar.add(mesa);
            this.fechaDeReserva = fecha;
            this.HoraDeReserva = hora;
            System.out.println("Mesa " + mesa.getNumero() + " reservada.");
        }
    }
    
    public void eliminarReserva(Mesa mesa){
        if(mesa.definirEstado() == false){
            if(estadoReserva == false){
                System.out.println("La mesa " + mesa.getNumero() + " no está reservada ni ocupada.");
            }
        }else{
            mesa.setEstado(false);
            setEstadoReserva(false);
            this.mesaReservar.remove(mesa);
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
        int numero = 0;
        for(Mesa mesa : mesaReservar){
            numero = mesa.getNumero();
        }
        return "Cliente: " + this.cliente 
                + ", fecha De Reservacion: " + this.fechaDeReserva 
                + ", hora De Reservacion: " + this.HoraDeReserva 
                + ", Mesa: " + numero;
    }
}