/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuarios;

import Informe.Informe;
import java.util.ArrayList;

/**
 *
 * @author Fabian Hinojosa
 */
public class Gerente extends Persona{
    private String contrasenia;
    private Informe informe;
    private ArrayList<Recepcionista> empleados;

    public Gerente() {
        this.empleados = new ArrayList<>();
    }

    public Gerente(String contrasenia, String nombre, String apellido, int cedula) {
        super(nombre, apellido, cedula);
        this.contrasenia = contrasenia;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
    public Informe getInforme() {
        return informe;
    }

    public void setInforme(Informe informe) {
        this.informe = informe;
    }

    public ArrayList<Recepcionista> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Recepcionista> empleados) {
        this.empleados = empleados;
    }
    
    public void añadirEmpleado(Recepcionista empleado) {
    empleados.add(empleado);
    }

    
    public void eliminarEmpleado(Recepcionista a){
        empleados.remove(a);
    }
    
    public boolean darAcceso(Recepcionista a) {
        return true;
    }

    public boolean quitarAcceso(Recepcionista a) {
        return true;
    }
    
    public void generarInforme() {
        if (informe != null) {
            informe.generarInformeMesas();
        } else {
            System.out.println("Informe no disponible.");
        }
    }
}
