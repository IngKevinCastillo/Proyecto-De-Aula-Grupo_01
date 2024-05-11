/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import entidades.Gerente;
import entidades.Recepcionista;
import entidades.Sala;

/**
 *
 * @author Fabian Hinojosa
 */
public class Datos implements ListaDatoNegocio{

    @Override
    public String listMesas(Sala sala) {
        return "Lista de Mesas:\t" + sala.toString();
    }

    @Override
    public String listReserva(Recepcionista recepcionista) {
        return "Lista de Reservas:\t" + recepcionista.datosReserva();
    }
}
