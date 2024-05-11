/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package presentacion;

import entidades.*;
/*import entidades.Informe;
import entidades.Mesa;
import entidades.Recepcionista;
import entidades.Sala;
import entidades.Gerente;
import entidades.Persona;
import entidades.Permisos;
import entidades.Reserva;
import entidades.Usuario;
import java.time.LocalDate;*/
import java.time.*;
import java.util.*;

/**
 *
 * @author Fabian Hinojosa
 */
public class Ppal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Menu menu= new Menu();
        int eleccion, Geren=0, Emple = 0;
          
        
       do{
           eleccion=menu.selec();
           switch(eleccion){
               case 1 -> menu.selecGERENTE();
                   
               case 2 -> menu.selecEMPLEADO();
               
               case 3 -> menu.Salir();
           }
       }while(eleccion!=3);
    }
}