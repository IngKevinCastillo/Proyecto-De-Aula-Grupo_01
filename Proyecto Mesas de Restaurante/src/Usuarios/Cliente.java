/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuarios;


/**
 *
 * @author Fabian Hinojosa
 */
public class Cliente extends Persona{
    private long numTelefono;

    public Cliente() {
    }

    public Cliente(long numTelefono, String nombre, String apellido, long cedula) {
        super(nombre, apellido, cedula);
        this.numTelefono = numTelefono;
    }

    public long getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(long numTelefono) {
        this.numTelefono = numTelefono;
    }
}
