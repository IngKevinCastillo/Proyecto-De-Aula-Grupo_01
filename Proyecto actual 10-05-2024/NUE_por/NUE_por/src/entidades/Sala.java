/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.*;

/**
 *
 * @author Fabian Hinojosa
 */
public class Sala {
    private ArrayList<Mesa> mesas;
    private int codigoSala;

    public Sala( int codigoSala) {
       
        this.codigoSala = codigoSala;
    }

    public int getCodigoSala() {
        return codigoSala;
    }

    public void setCodigoSala(int codigoSala) {
        this.codigoSala = codigoSala;
    }
    
    public ArrayList<Mesa> getMesas() {
        return mesas;
    }

    public void setMesas(ArrayList<Mesa> mesas) {
        this.mesas = mesas;
    }
    
    public Mesa buscarMesa(int mesa){
        if (mesas != null) {
            for (Mesa m : this.mesas) {
                if (m.getNumero() == mesa) {
                    return m;
                }
            }
        }
        return null;
    }

    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Sala: \n");
        for (Mesa mesa : mesas) {
            sb.append("Mesa ").append(mesa.getNumero())
                    .append(": ").append(codigoSala).append("\n");
        }
        return sb.toString();
    }
    
}