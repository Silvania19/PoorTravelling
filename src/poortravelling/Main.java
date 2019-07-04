
package poortravelling;
import  java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    
    public static void main(String[] args) {
  
     /*final int puntajeMinimo=1;
       final int puntajeMaximo=10;*/
        
      Contenedora conte=new Contenedora();
      Viajante viajanteNuevo;
      Ayudante ayudanteNuevo;
      GuiaTurista guiaNuevo;
      ServicioGuia serviGuia=new ServicioGuia();
      Alojamiento servicioAlojamiento=new Alojamiento();
      Transporte serTransporte=new Transporte();
      //variables para crear la persona
      String nombre,apellido, nroTelefono, contraseña, contraseñaRepeticion, comentario;
      Integer edad, id;
      float precio;
      Scanner le=new  Scanner(System.in);
      int opcion;
     
   
      do {
            menu1();
            Scanner lectorMenu = new Scanner(System.in);
            opcion = lectorMenu.nextInt();
            
            switch (opcion) {
                case 1:
                     
                                System.out.println("ingrese nombre: ");
                               nombre=le.nextLine();
                               System.out.println("ingrese apellido: ");
                                apellido=le.nextLine();
                                System.out.println("ingrese edad:");
                                edad=lectorMenu.nextInt();
                                System.out.println("ingrese telefono");
                                nroTelefono=le.nextLine();
                  do{
                        menu1de1();
                        opcion=lectorMenu.nextInt();
                        switch(opcion)
                        {
                            case 1:
                              
                                viajanteNuevo= new Viajante(nombre, apellido, nroTelefono, edad, 0);
                                agregarCotraseñaAlaPersona(viajanteNuevo);
                                do {
                                    menu1Viajante();
                                    opcion=lectorMenu.nextInt();
                                    switch(opcion){
                                        case 1:
                                            do { 
                                                menuTipoServicioViajante();
                                                opcion=lectorMenu.nextInt();
                                                switch()
                                            } while (opcion!=0);
                                    }
                                    
                                } while (opcion!=0);
                                
                                break;
                            case 2: 
                                ayudanteNuevo=new Ayudante(nombre, apellido, nroTelefono, edad, 0);
                                agregarCotraseñaAlaPersona(ayudanteNuevo);
                                do {                                    
                                    menu1de2de1();
                                    String tipoDeServicio, disponibilidadTiempo;
                                    Integer cantidadDisponible;
                                    opcion=lectorMenu.nextInt();
                                    switch(opcion)
                                    {
                                        case 1:
                                            System.out.println("ingrese datos del servicio transporte");
                                             cargarServicio(serTransporte);
                                           ayudanteNuevo.agregarServicio(serTransporte);
                                        case 2 : 
                                             System.out.println("ingrese datos del servicio alojamiento");
                                              cargarServicio(servicioAlojamiento);
                                              ayudanteNuevo.agregarServicio(servicioAlojamiento);
                                    }
                                } while (opcion!=0);
                                break;
                              case 3:
                                guiaNuevo=new GuiaTurista(nombre, apellido, nroTelefono, edad, 0);
                                agregarCotraseñaAlaPersona(guiaNuevo);
                        }
                        
                    }while(opcion!=0);
                    
                    
                    
            }
       }while(opcion!=0);
      
           
    }
    public static  void cargarServicio(Servicio servicio)
    {
                    
     String  tipoDeServicio;
     Integer cantidadDisponible;
     String disponibilidadTiempo;
     Scanner le=new Scanner(System.in);
     Scanner lectorMenu=new Scanner(System.in);
     System.out.println("ingrese cantidad de lugares(espacio) disponibles que tiene");//cantidad de persons
      cantidadDisponible=lectorMenu.nextInt();
     System.out.println("ingrese cuanto tiempo dispone el servicio");
     disponibilidadTiempo=le.nextLine();
     if(servicio instanceof  Transporte)
     {
         Transporte trans=(Transporte) servicio;
         trans=new Transporte(cantidadDisponible, disponibilidadTiempo);
         agregarTipoServicio(trans);
         agregarPrecioAservicio(trans);
     }
     else if(servicio instanceof Alojamiento)
     {
         Alojamiento aloj=(Alojamiento)servicio;
         aloj=new Alojamiento(cantidadDisponible, disponibilidadTiempo);
         agregarTipoServicio(aloj);
         agregarPrecioAservicio(aloj);
     }
     else if(servicio instanceof  ServicioGuia)
     {
         String lugarTuristico;
         System.out.println("ingrese lugar turistico (meseo, parque, etc)");
         lugarTuristico=le.nextLine();
         ServicioGuia serGuia=(ServicioGuia)servicio;
         serGuia=new ServicioGuia(lugarTuristico, disponibilidadTiempo);
         agregarPrecioAservicio(serGuia);
     }

    }
    public  static void agregarTipoServicio(IServicioCantidadYTipo ser)
           
    { String tipoServicio;
    Scanner lector=new Scanner(System.in);
        if(ser instanceof Alojamiento)
    {
        Alojamiento alojamiento=(Alojamiento)ser;
       System.out.println("ingrese el tipo de alojamiento: "+alojamiento.mostrarTiposServicios());
        tipoServicio=lector.nextLine();
        try {
            alojamiento.agregarTipoServicio(tipoServicio);
        } catch (TipoServicioIncorrectoException ex) {
            System.out.println(ex.getMessage());
            agregarTipoServicio(ser);
       }
        
    }
        else if (ser instanceof  Transporte) {
            Transporte transporte=(Transporte)ser;
            System.out.println("ingrese el tipo de transporte: "+transporte.mostrarTiposServicios());
            tipoServicio=lector.nextLine();
        try {
            transporte.agregarTipoServicio(tipoServicio);
        } catch (TipoServicioIncorrectoException ex) {
           System.out.println(ex.getMessage());
            agregarTipoServicio(ser);
        }
        }

    }
    public static void agregarPrecioAservicio(Servicio ser)
    {
        float precio;
        Scanner lector=new Scanner(System.in);
       
            try {
                System.out.println("ingrese el precio");
                precio=lector.nextFloat();
                ser.agregarPrecio(precio);
            } catch (PrecioIncorrectoException e) {
                System.out.println(e.getMessage());
                agregarPrecioAservicio(ser);
       }
    }
    public static void agregarCotraseñaAlaPersona( Persona per)
    {
        // vamaos a pedir una cotraseña y despues le vamos a pedir que la repita verificaremos si las contraseñas son correctas antes de agregarlo
        String contraseña, contraseñaRepeticion;
        Scanner lector=new Scanner(System.in);
        System.out.println("ingrese la contraseña");
        contraseña=lector.nextLine();
        System.out.println("ingrese otra vez la contraseña");
        contraseñaRepeticion=lector.nextLine();
        
        try {
            per.agregarContraseña(contraseña, contraseñaRepeticion);
        } catch (ContraseñaInvalidaException ex) {
            System.out.println(ex.getMessage());
            agregarCotraseñaAlaPersona(per);
       }
        
    }
    
    public static void menu1()
    {
        System.out.println("1-crear usuario");
        System.out.println("2-entrar");
        System.out.println("3-salir");
    }
    public static  void menu1de1()
    {
        System.out.println("1-viajante");
        System.out.println("2-ayudante");
        System.out.println("3-guia");
        System.out.println("0-Salir");
    }
    /// para que expecifique que tipo de servicio ofrece el ayudante, y asi crear el objeto que le corresponda
    public static void menu1de2de1()
    {
        System.out.println("1-Transporte");
        System.out.println("2-Alojamiento");
        System.out.println("0-Salir");
    }
    // para saber que tipo de servicio necesita el viajante, para crear el objeto que le corresponda
    public static  void menuTipoServicioViajante()
    {
         System.out.println("1-Transporte");
        System.out.println("2-Alojamiento");
        System.out.println("3-Guia turismo");
        System.out.println("0-Salir");
    }
    //este menu se mostrara despues de que se cree un objeto viajante. y se agregue este al arreglo
    public static  void menu1Viajante()
    {
        System.out.println("1-Ingresar datos del servicio que necesita.");
        System.out.println("0-salir");
        
    }
   
    public static void menuEjecutableViajante1()
    {
        System.out.println("1-Buscar un ayudantes por destino.");
        System.out.println("2-Buscar un ayudante por tipo de servicio");
        System.out.println("3-Buscar ayudantes en  un determinado rango de edad");
    }
    public static  void ejecutar()
    {
        
    }
 
}

