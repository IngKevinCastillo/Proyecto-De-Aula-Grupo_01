
package entidades;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Gerente extends Usuario{
    private ArrayList<Sala> sala;
    public Scanner entrada= new Scanner(System.in);
    private ArrayList<Reserva> listaReservas;
    private ArrayList<Recepcionista> empleado;
    int numMesa=1;

    public Gerente() {
        this.listaReservas = new ArrayList<>();
        this.empleado = new ArrayList<>();
        this.sala = new ArrayList<>();
    }

    public Gerente(String usuario, String contraseña, String nombre, String apellido, long cedula) {
        super(usuario, contraseña, nombre, apellido, cedula);
        
        if (permisos == null) {
            permisos = new Permisos();
        }
        
        permisos.setEstadoMesas(false);
        permisos.setGestionReserv(false);
        permisos.setGestionSalas(true);
        permisos.setGestionUsuario(true);
        permisos.setModificarMesas(true);
        empleado = new ArrayList<>();
    }
    
    public ArrayList<Recepcionista> getEmpleado() {
        return empleado;
    }
    
    public void setEmpleado(ArrayList<Recepcionista> empleado) {
        this.empleado = empleado;
    }

    public void setSala(Sala sala) {
        this.sala.add(sala) ;
    }
    
    public ArrayList<Mesa> CrearMesas(){
        
        int num, asientos;
        
        System.out.print("Ingrese la contidad de mesas que desea agregar: "); num= entrada.nextInt();
        
        ArrayList<Mesa> mesa= new ArrayList();
        
        for(int i=numMesa; i<=num; i++){
            
            System.out.print(" Ingrese el numero de asientos de la mesa: "+ i + ": "); asientos= entrada.nextInt();
            
            Mesa mes= new Mesa(numMesa, asientos);
            numMesa++;
            
            mesa.add(mes);
        }
        return mesa;
    }
    
    public void eliminarMesa(int sala, int mesa) {
        for (Sala sa : this.sala) {
            Iterator<Mesa> iterator = sa.getMesas().iterator();
            while (iterator.hasNext()) {
                Mesa me = iterator.next();
                if (me.getNumero() == mesa) {
                    iterator.remove(); // Utilizamos el método remove del iterador para eliminar el elemento
                }
            }
        }
    }
    
    public ArrayList<Reserva> getListaReservas() {
        return listaReservas;
    }

    public void setListaReservas(ArrayList<Reserva> listaReservas) {
        this.listaReservas = listaReservas;
    }
    
    /*public void generarInforme(Sala sala, Recepcionista empleado) {
        this.sala = sala;
        this.empleado = empleado;
        System.out.println("\n\n...Generando Informe...");
        System.out.println(this.sala.toString());
        System.out.println(empleado.datosReserva());
    }*/
    
    public void cambiarContrasenna(long cedula){
        String nuevaContra; int op;
        
        this.buscarEmpleado(cedula);
        do{
            System.out.print(" Ingrese la nueva contraseña: ");nuevaContra= entrada.nextLine();
            System.out.print(" Desea que "+nuevaContra+" sea su nueva contraseña?");
            System.out.print(" 1.) Si \n 2.) No");op=entrada.nextInt();
        }while(op!=1);
        
        this.buscarEmpleado(cedula).setContraseña(nuevaContra);
        
    }
    
    public void añadirEmpleado(Recepcionista nuevo){
        empleado.add(nuevo);
    }
    
    public void eliminarEmpleado(long cedula) {
        Iterator<Recepcionista> iterator = empleado.iterator();
        while (iterator.hasNext()) {
            Recepcionista recepcionista = iterator.next();
            if (recepcionista.getCedula() == cedula) {
                iterator.remove(); // Utilizamos el método remove del iterador para eliminar el elemento
            }
        }
    }
    
    public Recepcionista buscarEmpleado(long cedula){
        for(Recepcionista e: this.empleado){
            if(e.getCedula()==cedula){
                return e;
            }
        }
        return null;
    }
    
    public Sala buscarsala(int num){
        for(Sala e: this.sala){
            if(e.getCodigoSala()==num){
                return e;
            }
        }
        return null;
    }
    
    public void crearSala(int numeroSala){
        Sala nueva = new Sala(numeroSala);
        sala.add(nueva);
    }
    
    public void eliminarSala(int numeroSala) {
        Iterator<Sala> iterator = sala.iterator();
        while (iterator.hasNext()) {
            Sala sala = iterator.next();
            if (sala.getCodigoSala() == numeroSala) {
                iterator.remove(); // Utilizamos el método remove del iterador para eliminar el elemento
            }
        }
    }  
}
