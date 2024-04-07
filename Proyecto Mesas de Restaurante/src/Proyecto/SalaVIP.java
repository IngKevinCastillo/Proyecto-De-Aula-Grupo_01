/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Fabian Hinojosa
 */
public class SalaVIP extends Reserva{
    private String codigo;
    
    public SalaVIP(){
        super();
        this.codigo = "#Vacio";
    }

    public SalaVIP(String codigo, String nombre, int cedula, LocalDate fechaDeReservacion, LocalTime horaDeReservacion, int cantidadClientes) {
        super(nombre, cedula, fechaDeReservacion, horaDeReservacion, cantidadClientes);
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
