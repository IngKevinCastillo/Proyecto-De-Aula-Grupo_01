/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructura;

import Usuarios.Recepcionista;
import Estructura.Mesa;
import java.util.*;

/**
 *
 * @author Fabian Hinojosa
 */
public class Sala {
    private ArrayList<Mesa> mesas;
    private ArrayList<Recepcionista> empleados;

    public Sala(ArrayList<Mesa> mesas, ArrayList<Recepcionista> empleados) {
        this.mesas = mesas;
        this.empleados = empleados;
    }

    public ArrayList<Mesa> getMesas() {
        return mesas;
    }

    public void setMesas(ArrayList<Mesa> mesas) {
        this.mesas = mesas;
    }

    public ArrayList<Recepcionista> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Recepcionista> empleados) {
        this.empleados = empleados;
    }

    @Override
    public String toString() {
        return "Sala: " +
                "\nMesas=" + this.mesas +
                ", \nEmpleados=" + this.empleados;
    }
}