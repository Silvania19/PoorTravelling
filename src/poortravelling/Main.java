
package poortravelling;
import  java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONObject;
import org.json.JSONException;
public class Main {

    
    public static void main(String[] args) {
  
     /*final int puntajeMinimo=1;
       final int puntajeMaximo=10;*/
        
      Contenedora conte=new Contenedora();
      ListaLugar listaLugares=new ListaLugar();
      Viajante viajanteNuevo=new Viajante();
      Ayudante ayudanteNuevo=new Ayudante();
      GuiaTurista guiaNuevo=new GuiaTurista();
      ServicioGuia serviGuia=new ServicioGuia();
      Alojamiento servicioAlojamiento=new Alojamiento();
      Transporte serTransporte=new Transporte();
      Lugar lugar=new Lugar();
      //variables para crear la persona
      String nombre,apellido, nroTelefono, contraseña, contraseñaRepeticion, comentario;
      Integer edad, id;
      float precio;
      Scanner le=new  Scanner(System.in);
      int opcion;
       JsonUtilesContenedora jsonConte= new JsonUtilesContenedora();
       JSONObject jo=new JSONObject();
       jsonConte.grabarContenedora(jo);
        try {
             jo=conte.jsonContenedora();
        } catch (Exception e) {
            System.out.println("Problemas bb aborta el programa");
        }
        
        System.out.println(jo.toString());
      conte=jsonConte.leer();
      
       
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
                                    menu1ViajanteAyudante();
                                    opcion=lectorMenu.nextInt();
                                    switch(opcion){
                                        case 1:
                                            do { 
                                                menuTipoServicioViajante();
                                                opcion=lectorMenu.nextInt();
                                                switch(opcion)
                                                {
                                                    case 1:
                                                        System.out.println("ingrese datos del servicio transporte");
                                                         cargarServicio(serTransporte);
                                                         viajanteNuevo.agregar(serTransporte);
                                                         break;
                                                    case 2:
                                                        System.out.println("ingrese datos del servicio alojamiento");
                                                         cargarServicio(servicioAlojamiento);
                                                         viajanteNuevo.agregar(servicioAlojamiento);
                                                         break;
                                                    case 3:
                                                        System.out.println("ingrese datos del servivio de guia turistico");
                                                        cargarServicio(serviGuia);
                                                        viajanteNuevo.agregar(serviGuia);
                                                        break;
                                                    case 0:
                                                            break;
                                                }
                                            } while (opcion!=0);
                                            
                                            break;
                                        case 2:
                                            cargarUnLugar(lugar);
                                            viajanteNuevo.agregarLugarDestino(lugar);
                                            listaLugares.agregarLugar(lugar);
                                            break;
                                    }
                                    break;
                                } while (opcion!=0);
                                conte.agreagarUsuarioViajante(viajanteNuevo);
                                break;
                            case 2: 
                                ayudanteNuevo=new Ayudante(nombre, apellido, nroTelefono, edad, 0);
                                agregarCotraseñaAlaPersona(ayudanteNuevo);
                                do{
                                    menu1ViajanteAyudante();
                                    opcion=lectorMenu.nextInt();
                                    switch(opcion){
                                        case 1: do {
                                            
                                     menu1de2de1();
                                    String tipoDeServicio, disponibilidadTiempo;
                                    Integer cantidadDisponible;
                                    opcion=lectorMenu.nextInt();
                                    switch(opcion)
                                    {
                                        case 1:
                                            System.out.println("ingrese datos del servicio transporte");
                                             cargarServicio(serTransporte);
                                             agregarPrecioAservicio(serTransporte);
                                           ayudanteNuevo.agregarServicio(serTransporte);
                                           break;
                                        case 2 : 
                                             System.out.println("ingrese datos del servicio alojamiento");
                                              cargarServicio(servicioAlojamiento);
                                              agregarPrecioAservicio(servicioAlojamiento);
                                              ayudanteNuevo.agregarServicio(servicioAlojamiento);
                                              break;
                                    }
                                } while (opcion!=0);
                                       break;
                                        case 2:
                                            cargarUnLugar(lugar);
                                            ayudanteNuevo.agregarLugarDestino(lugar);
                                            listaLugares.agregarLugar(lugar);
                                            break;
                                    }
                                conte.agregarUsuarioAyudante(ayudanteNuevo);
                                }while(opcion!=0);
                                break;
                              case 3:
                               guiaNuevo=new GuiaTurista(nombre, apellido, nroTelefono, edad, 0);
                               agregarCotraseñaAlaPersona(guiaNuevo);
                               System.out.println("ingrese datos del servicio guia");
                               cargarServicio(serviGuia);
                               agregarPrecioAservicio(serviGuia);
                               guiaNuevo.agregarServivio(serviGuia);
                               System.out.println("ingrese los datos del lugar");
                               cargarUnLugar(lugar);
                                guiaNuevo.agregarLugarDestino(lugar);
                               listaLugares.agregarLugar(lugar);
                               conte.agregarUsuarioGuiaTurista(guiaNuevo);
                                  break;
                        }
                        
                    }while(opcion!=0);
               break;
                     case 2:
                         Lugar lug=new Lugar();
                         int inferior, superior, numeroUsuario;
                         String tipoSer=new String();
                                 
                         Ayudante ayudanteContratado=new Ayudante();
           do {
               menu1de1();
               opcion=lectorMenu.nextInt();
              switch(opcion)
            {   case 1:
                verficarContraseñaExiste(conte, viajanteNuevo);
                System.out.println(viajanteNuevo.toString());
                do { 
                    menuEjecutableViajante1();
                     opcion=lectorMenu.nextInt();
                     switch(opcion){
                         case 1:
                             cargarUnLugar(lugar);
                             System.out.println(conte.mostrarAyudantesXdestino(lug));
                             buscarUnaPersonaXid(conte, ayudanteContratado);
                             tipoSer=tipoServicioContratar();
                             viajanteNuevo.contratar(ayudanteContratado, tipoSer);
                             break;
                         case 2:
                             System.out.println("ingrese la edad minima");
                             inferior=lectorMenu.nextInt();
                             System.out.println("ingrese la edad maxima");
                             superior=lectorMenu.nextInt();
                             System.out.println("\n ayudantes con edad minima de "+inferior+" y edad maxima de "+superior+"\n");
                             System.out.println(conte.mostrarAyudantesXRangoDeEdad(inferior, superior));
                             buscarUnaPersonaXid(conte, ayudanteContratado);
                             tipoSer=tipoServicioContratar();
                             viajanteNuevo.contratar(ayudanteContratado, tipoSer);
                     }
                    
                } while (opcion!=0);
                
            }
             
               
          } while (opcion!=0);
            
               
                    
            }
        
            break;
       }while(opcion!=0);
      
         jsonConte.grabarContenedora(jo);   
    }
    public static String tipoServicioContratar()
    {
        Scanner lector=new Scanner(System.in);
        int numeroIngresado;
        String tipoSer=new String();
        System.out.println("seleciones el numero correspondiente a aquel servicio que desea contratar");
        System.out.println("1- alojamiento");
        System.out.println("2- transporte");
        numeroIngresado=lector.nextInt();
        if(numeroIngresado ==1)
        {
            tipoSer="alojamiento";
        }
        else if(numeroIngresado ==2)
        {
            tipoSer="transporte";
        }
        return  tipoSer;
    }
    public static void buscarUnaPersonaXid(Contenedora conte, Persona per)
    { 
        int numeroUsuario;
        Scanner lector=new Scanner(System.in);
        System.out.println("seleccione el numero de usuario  que quiere contratar");
        numeroUsuario=lector.nextInt();
        
            try {
                if(per instanceof  Ayudante)
             {
                per=conte.buscarAyudanteXid(numeroUsuario);
             }
                else if(per instanceof  GuiaTurista)
                {
                    per=conte.buscarGuiaXID(numeroUsuario);
                }
                else if(per instanceof  Viajante)
                {
                    per=conte.buscarViajantexId(numeroUsuario);
                }
            } catch (IdNoExisteExcepcion ex) {
                System.out.println(ex.getMessage());
                buscarUnaPersonaXid(conte, per);
           }
        
    }
    public static  void verficarContraseñaExiste(Contenedora conte, Persona per)
    {   String contraseña;
        Scanner lector=new Scanner(System.in);
        try {
       
        System.out.println("ingrese contraseña");
        contraseña=lector.nextLine();
        if(per instanceof  Ayudante){
           per= conte.mostraUnAyudante(contraseña);
        }
        else if(per instanceof  Viajante)
        {
           per= conte.mostrarUnViajante(contraseña);
        }
        else if(per instanceof GuiaTurista)
        {
            per=conte.mostrarUnGuia(contraseña);
        }
        
        } catch (ContraseñaNoExisteException ex) {
            System.out.println(ex.getMessage());
            verficarContraseñaExiste(conte, per);
         }
        
    }
    public static  void cargarServicio(Servicio servicio)
    {
                    
     String  tipoDeServicio;
     Integer cantidadDisponible;
   
     Scanner le=new Scanner(System.in);
     Scanner lectorMenu=new Scanner(System.in);
   
    
     if(servicio instanceof  Transporte)
     {
           System.out.println("ingrese cantidad de lugares(espacio)");//cantidad de persons
      cantidadDisponible=lectorMenu.nextInt();
         Transporte trans=(Transporte) servicio;
         trans=new Transporte(cantidadDisponible);
         agregarTipoServicio(trans);
         
     }
     else if(servicio instanceof Alojamiento)
     {
           System.out.println("ingrese cantidad de lugares(espacio) disponibles que tiene");//cantidad de persons
      cantidadDisponible=lectorMenu.nextInt();
         Alojamiento aloj=(Alojamiento)servicio;
         aloj=new Alojamiento(cantidadDisponible);
         agregarTipoServicio(aloj);
         
     }
     else if(servicio instanceof  ServicioGuia)
     {
         String lugarTuristico;
         System.out.println("ingrese lugar turistico (meseo, parque, etc)");
         lugarTuristico=le.nextLine();
         ServicioGuia serGuia=(ServicioGuia)servicio;
         serGuia=new ServicioGuia(lugarTuristico);
       
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
    /// para caragar el lugaar 
    public static void cargarUnLugar(Lugar lugar){
        {
            String pais, ciudad, localidad;
            Scanner lector=new Scanner(System.in);
            System.out.println("ingrese pais: ");
            pais=lector.nextLine();
            System.out.println("ingrese ciudad: ");
            ciudad=lector.nextLine();
            System.out.println("ingrese localidad: ");
            localidad=lector.nextLine();
            lugar=new Lugar(pais, ciudad, localidad);
            
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
    public static  void menu1ViajanteAyudante()
    {
        System.out.println("1-Ingresar datos del servicio ");
        System.out.println("2- ingresar destino a vijar");
        System.out.println("0-salir");
        
    }
   
    public static void menuEjecutableViajante1()
    {
        System.out.println("1-Buscar un ayudantes por destino.");
        System.out.println("2-Buscar un ayudante por tipo de servicio");
        System.out.println("3-Buscar ayudantes en  un determinado rango de edad");
        System.out.println("4-ver mi contraseña");
    }
    public static  void menuPrimeroviajanteEjecutable()
    {
        System.out.println("1- Buscar ayudantes.");
        System.out.println("2- Buscar guias de turistas");
    }
    public static void menuOpcion2Entrar()
    {
          
    }
    public static  void ejecutar()
    {
        int opcion;
       
    }
 
}

