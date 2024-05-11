
package presentacion;

import entidades.Cliente;
import entidades.Gerente;
import entidades.Mesa;
import entidades.Recepcionista;
import entidades.Sala;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

/**
 *
 * @author Fabian Hinojosa
 */
public class Menu {
    public Scanner entrada= new Scanner(System.in);
    private final Gerente dueno= new Gerente();
    
    public Menu() {
    }
    
    public int selec(){
        
        int num;
        
        do{
            System.out.println("\n\tBIENVENIDOS AL SISTEMA DE RESERVA DE MESAS DEL RESTAURANTE RANCHO GRANDE");
            System.out.println("\t\t\t\t MENU DE RESTAURANTE");
            System.out.println("\t1.) Gerente");
            System.out.println("\t2.) Empleado");
            System.out.println("\t3.) Salir");
            System.out.print("\nElija una opcion: ");
            num=entrada.nextInt();
            
            switch(num){
                case 1 -> selecGERENTE();
                case 2 -> selecEMPLEADO();
                case 3 -> Salir();
            }
            return num;
            
        }while(num!=3); 
    }
    
    public void Añadir(){
       String contrasenia, nombre, apellido, usuario;
       long cedula;
       System.out.println("Ingrese los datos del empleado: ");
       entrada.nextLine();
       System.out.print(" Usuario: "); usuario = entrada.nextLine();
       System.out.print(" Contraseña: ");contrasenia=entrada.nextLine();
       System.out.print(" Nombre: ");nombre=entrada.nextLine();
       System.out.print(" Apellido: ");apellido=entrada.nextLine();
       System.out.print(" Cedula: ");cedula = entrada.nextLong();
          
       Recepcionista nuevo = new Recepcionista(usuario, contrasenia, nombre, apellido, cedula);
       
       dueno.añadirEmpleado(nuevo);
   }
    
    public void Eliminar(){
       System.out.print(" Cedula: ");
       dueno.eliminarEmpleado(entrada.nextInt());  
   }
    
    public void cambiarContraseña(){
       
       long Cedula;
        
       System.out.print("Ingrese los datos del empleado: \n");
       System.out.print(" Cedula: ");
       Cedula= entrada.nextLong();
       dueno.cambiarContrasenna(Cedula);
   }
    
    public void AdministrarEmple(){
       
      int num;
        
        do{
            System.out.println("\n\tBIENVENIDOS AL SISTEMA DE RESERVA DE MESAS DEL RESTAURANTE RANCHO GRANDE");
            System.out.println("\t\t\t\t MENU ADMINISTRAR EMPLEADO:");
            System.out.println("\t1.) Añadir empleado");
            System.out.println("\t2.) Eliminar empleado");
            System.out.println("\t3.) Cambiar contraseña");
            System.out.println("\t4.) Salir");
            System.out.print("\nElija una opcion: ");
            num=entrada.nextInt();
            
            switch(num){
                
                case 1 -> Añadir();
                    
                case 2 -> Eliminar();
                    
                case 3 -> cambiarContraseña();
            }
            
        }while(num!=4); 
   }
    
    public void AñadirZona(){
       
       int  Numzona;
       
       System.out.print("Numero de la sala: "); Numzona= entrada.nextInt();
       
       dueno.crearSala(Numzona);
   }
   
   public void EliminarZona(){
       
       System.out.print("Numero de la sala: ");
       dueno.eliminarSala(entrada.nextInt());
   }
    
    public void zonas(){
       
       int num;
        
        do{
            System.out.println("\n\tBIENVENIDOS AL SISTEMA DE RESERVA DE MESAS DEL RESTAURANTE RANCHO GRANDE");
            System.out.println("\t\t\t\t MENU DE GESTION DE SALAS:");
            System.out.println("\t1.) Añadir Sala");
            System.out.println("\t2.) Eliminar Sala");
            System.out.println("\t3.) Salir");
            System.out.print("\nElija una opcion: ");
            num=entrada.nextInt();
            
            switch(num){
                
                case 1 -> AñadirZona();
                    
                case 2 -> EliminarZona();
            }
        }while(num!=3);   
   }
    
    public void añadirMesa(){
        
       int numSala;
        
       System.out.print(" Ingrese el numero de la sala:"); numSala= entrada.nextInt();
       if(dueno.buscarsala(numSala) != null){
           dueno.buscarsala(numSala).setMesas(dueno.CrearMesas());
       }else{
           System.out.println("La sala no existe.");
       }
   }
   
   public void EliminarMesa(){
       int numSala, numMesa;
       
       System.out.print(" Ingrese el numero de la sala:"); numSala= entrada.nextInt();
       System.out.print(" Ingrese el numero de la mesa: "); numMesa= entrada.nextInt();
       
       if(dueno.buscarsala(numSala) != null){
           if(dueno.buscarsala(numSala).buscarMesa(numMesa) != null){
               dueno.eliminarMesa(numSala, numMesa);
           }else{
               System.out.println("La mesa no existe.");
           }
       }else{
           System.out.println("La sala no existe.");
       }
   }
    
    public void mesas(){
       
       int num;
        
        do{
            System.out.println("\n\tBIENVENIDOS AL SISTEMA DE RESERVA DE MESAS DEL RESTAURANTE RANCHO GRANDE");
            System.out.println("\t\t\t\t MENU DE GESTION DE MESAS:");
            System.out.println("\t1.) Añadir mesa");
            System.out.println("\t2.) Eliminar mesa");
            System.out.println("\t3.) Salir");
            System.out.print("\nElija una opcion: ");
            num=entrada.nextInt();
            
            switch(num){
                
                case 1 -> añadirMesa();
                    
                case 2 -> EliminarMesa();
            }
        }while(num!=3);
   }
    
    public void Informe(){
        
    }
    
    public int selecGERENTE(){
        
        int num;
        
        do{
            System.out.println("\n\tBIENVENIDOS AL SISTEMA DE RESERVA DE MESAS DEL RESTAURANTE RANCHO GRANDE");
            System.out.println("\t\t\t\t MENU DE GERENTE");
            System.out.println("\t1.) Administrar empleado");
            System.out.println("\t2.) Modificar zonas");
            System.out.println("\t3.) Modificar mesas ");
            System.out.println("\t4.) Informe");
            System.out.println("\t5.) Salir");
            System.out.print("\nElija una opcion: ");
            num=entrada.nextInt();
            
            switch(num){
                
                case 1 -> AdministrarEmple();
                    
                case 2 -> zonas();
                    
                case 3 -> mesas();
                
                case 4 -> Informe();
            }
            return num;
        }while(num!=5); 
    }
    
    public void Reservar(){
       int numeroMesa, numeroSalaConsultar;
       long telefono, cedula;
       String nombre, apellido;
       int dia, mes, anio, hora, minutos;
       
       entrada.nextLine();
       System.out.print("\nDigite el nombre del cliente: "); nombre = entrada.nextLine();
       System.out.print("Digite el apellido del cliente: "); apellido = entrada.nextLine();
       System.out.print("Digite el numero de telefono del cliente: "); telefono = entrada.nextLong();
       System.out.print("Digite la cedula del cliente: "); cedula = entrada.nextLong();
       Cliente cliente = new Cliente(telefono, nombre, apellido, cedula);
       
       System.out.print("Digite la mesa a ocupar: "); numeroMesa = entrada.nextInt();
       System.out.print("Digite la sala a agregar la reserva: "); numeroSalaConsultar = entrada.nextInt();
       System.out.print("\nDigite la fecha y la hora a reservar: ");
       System.out.print("\nDigite la año a reservar: "); anio = entrada.nextInt();
       System.out.print("Digite la mes a reservar: "); mes = entrada.nextInt();
       System.out.print("Digite la dia a reservar: "); dia = entrada.nextInt();
       System.out.print("Digite la hora: "); hora = entrada.nextInt();
       System.out.print("Digite los minutos: "); minutos = entrada.nextInt();
       
       for(Recepcionista g : dueno.getEmpleado()){
            g.crearReserva(cliente, dueno.buscarsala(numeroSalaConsultar).buscarMesa(numeroMesa), LocalDate.of(anio, mes, dia), LocalTime.of(hora, minutos));
            
       }
   }
    
    public void EliminarReserva(){
       int numMesa, numSala;
       System.out.print("Digite la sala a quitar la reserva: "); numSala = entrada.nextInt();
       System.out.print("Digite la mesa a quitar reserva: "); numMesa = entrada.nextInt();
       
       if(dueno.buscarsala(numSala) != null){
           if(dueno.buscarsala(numSala).buscarMesa(numMesa) != null){
               Mesa mes = dueno.buscarsala(numSala).buscarMesa(numMesa);
               for(Recepcionista g : dueno.getEmpleado()){
                    g.quitarReserva(mes);
                }
           }else{
               System.out.println("La mesa no existe.");
           }
       }else{
           System.out.println("La sala no existe.");
       }
   }
    
    public void ocuparMesa(){
       String nombre, apellido;
       int numeroMesa, numeroSala;
       long telefono, cedula;
       
       entrada.nextLine();
       System.out.print("Digite el nombre del cliente: "); nombre = entrada.nextLine();
       System.out.print("Digite el apellido del cliente: "); apellido = entrada.nextLine();
       System.out.print("Digite el numero de telefono del cliente: "); telefono = entrada.nextLong();
       System.out.print("Digite la cedula del cliente: "); cedula = entrada.nextLong();
       Cliente cliente = new Cliente(telefono, nombre, apellido, cedula);
       
       System.out.print("Digite la mesa a ocupar: "); numeroMesa = entrada.nextInt();
       System.out.print("Digite la sala a ocupar la mesa: "); numeroSala = entrada.nextInt();
       
       if(dueno.buscarsala(numeroSala).buscarMesa(numeroMesa) != null){
           Mesa mes = dueno.buscarsala(numeroSala).buscarMesa(numeroMesa);
           for(Recepcionista g : dueno.getEmpleado()){
                g.ocuparMesaAhora(cliente, mes);
            }
        }else{
            System.out.println("La mesa no existe.");
       }
    }
    
    public void desocuparMesa(){
        int numMesa, numSala;
        System.out.print("Digite la mesa a desocupar: "); numMesa = entrada.nextInt();
        System.out.print("Digite la sala a ocupar la mesa: "); numSala = entrada.nextInt();
        
        if(dueno.buscarsala(numSala).buscarMesa(numMesa) != null){
           Mesa mes = dueno.buscarsala(numSala).buscarMesa(numMesa);
           for(Recepcionista g : dueno.getEmpleado()){
                g.desocuparMesaAhora(mes);
            }
           }else{
               System.out.println("La mesa no existe.");
        }
    }
    
    public int selecEMPLEADO(){
        
        int num;
        
        do{
            System.out.println("\n\tBIENVENIDOS AL SISTEMA DE RESERVA DE MESAS DEL RESTAURANTE RANCHO GRANDE");
            System.out.println("\t\t\t\t MENU DE EMPLEADO");
            System.out.println("\t1.) Reservar ");
            System.out.println("\t2.) Eliminar reserva");
            System.out.println("\t3.) Ocupar mesa ");
            System.out.println("\t4.) Desocupar mesa");
            System.out.println("\t5.) Salir");
            System.out.print("\nElija una opcion: ");
            num=entrada.nextInt();
            
            switch(num){
                
                case 1 -> Reservar();
                case 2 -> EliminarReserva();
                case 3 -> ocuparMesa();
                case 4 -> desocuparMesa();
            }
            return num;
        }while((num<1)||(num>2)); 
        
        
    }
    
    public int Salir(){
       
       System.out.println(" Gracias por usar el sotfware");
       return 3;
   }
    
    
    
}
