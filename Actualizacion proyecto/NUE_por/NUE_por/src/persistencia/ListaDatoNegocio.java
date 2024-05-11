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
public interface ListaDatoNegocio {
    String listMesas(Sala sala);
    String listReserva(Recepcionista recepcionista); 
    //int listSala(Gerente gerente); 
}
    