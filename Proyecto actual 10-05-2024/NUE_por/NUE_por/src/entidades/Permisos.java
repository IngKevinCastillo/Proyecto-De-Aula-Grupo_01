/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Fabian Hinojosa
 */
public class Permisos {
    private boolean gestionReserv;
    private boolean gestionUsuario;
    private boolean gestionInforme;
    private boolean estadoMesas;
    private boolean modificarMesas;
    private boolean gestionSalas;

    public boolean isGestionReserv() {
        return gestionReserv;
    }

    public Permisos() {
        this.gestionReserv = false;
        this.gestionUsuario = false;
        this.gestionInforme = false;
        this.estadoMesas = false;
        this.modificarMesas = false;
        this.gestionSalas = false;
    }

    public void setGestionReserv(boolean gestionReserv) {
        this.gestionReserv = gestionReserv;
    }

    

    public boolean isGestionUsuario() {
        return gestionUsuario;
    }

    public void setGestionUsuario(boolean gestionUsuario) {
        this.gestionUsuario = gestionUsuario;
    }

    public boolean isGestionInforme() {
        return gestionInforme;
    }

    public void setGestionInforme(boolean gestionInforme) {
        this.gestionInforme = gestionInforme;
    }

    public boolean isEstadoMesas() {
        return estadoMesas;
    }

    public void setEstadoMesas(boolean estadoMesas) {
        this.estadoMesas = estadoMesas;
    }

    public boolean isModificarMesas() {
        return modificarMesas;
    }

    public void setModificarMesas(boolean modificarMesas) {
        this.modificarMesas = modificarMesas;
    }

    public boolean isGestionSalas() {
        return gestionSalas;
    }

    public void setGestionSalas(boolean gestionSalas) {
        this.gestionSalas = gestionSalas;
    }
}
