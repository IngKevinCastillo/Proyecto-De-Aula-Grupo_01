/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Fabian Hinojosa
 */
public class Mesa {
    private int numeroMesa;
    private int numeroDeAsientos;
    private boolean estado;
    private Sala ubicacionSala;

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

    public boolean definirEstado() {
        return estado;
    }
    
    public Sala getUbicacionSala() {
        return ubicacionSala;
    }

    public void setUbicacionSala(Sala ubicacionSala) {
        this.ubicacionSala = ubicacionSala;
    }
}