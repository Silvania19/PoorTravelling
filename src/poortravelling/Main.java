
package poortravelling;
import  java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONObject;
import org.json.JSONException;
public class Main {

    
    public static void main(String[] args) {
  
    
        Contenedora conte=new Contenedora();
        Servicio serV1, serv2, serA; 
        Lugar LV1, LV2, LA, LG;
        ListaLugar lisLugar=new ListaLugar();
        int id=1;
        Viajante viajante1=new Viajante("silvania", "ortega", "345567344", 19, 1);
        Viajante v2=new Viajante("flor", "juarez ", "23456551", 20, 2);
        Ayudante ayu1=new Ayudante("marcos", "cabezas", "2334556", 21, 3);
        GuiaTurista guia=new GuiaTurista("liz", "Perez", "375482344", 3, 4);
        LV1=new Lugar("argentina", "buenos aires", "mar del plata");
        LV2=new Lugar("argentina", "buenos aires ", "pinamar");
        LA=new Lugar("argentina", "buenos aires " , " mar del plata");
        LG=new Lugar("argentina", "buenos aires "," pinamar");
        try {
             viajante1.agregarContraseña("lafiori", "lafiori");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
       
        serV1=new Transporte(12);
        serv2=new Alojamiento(3);
        serA= new Transporte(2);
        Alojamiento sera=new Alojamiento(4);
        ServicioGuia serG=new ServicioGuia("museo");
        viajante1.agregar(serV1);
        v2.agregar(serv2);
        ayu1.agregarServicio(sera);
        guia.agregarServivio(serG);
    conte.agreagarUsuarioViajante(viajante1);
        conte.agreagarUsuarioViajante(v2);
        conte.agregarUsuarioAyudante(ayu1);
        conte.agregarUsuarioGuiaTurista(guia);
        System.out.println("");
       lisLugar.agregarLugar(LG);
        lisLugar.agregarLugar(LA);
        lisLugar.agregarLugar(LV1);
        lisLugar.agregarLugar(LV2);
  
    
      ListaLugar listaLugares=new ListaLugar();
      Viajante viajanteNuevo=new Viajante();
      Ayudante ayudanteNuevo=new Ayudante();
      GuiaTurista guiaNuevo=new GuiaTurista();
      ServicioGuia serviGuia=new ServicioGuia();
      Alojamiento servicioAlojamiento=new Alojamiento();
      Transporte serTransporte=new Transporte();
      Lugar lugar=new Lugar();
      Comentario comentarioNuevo;
      Viajante viajanteBuscado=new Viajante();
      //variables para crear la persona
      String nombre,apellido, nroTelefono, contraseña, contraseñaRepeticion, comentario;
      Integer edad;
      float precio;
      Scanner le=new  Scanner(System.in);
      int opcion;
     
       JSONObject jo=new JSONObject();
      
       
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
                              
                                viajanteNuevo= new Viajante(nombre, apellido, nroTelefono, edad, id+1);
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
                                                        case 4:
                                                            opcion=1;
                                                            break;
                                                
                                                }
                                            } while (opcion!=0);
                                            
                                            break;
                                        case 2:
                                            cargarUnLugar(lugar);
                                            viajanteNuevo.agregarLugarDestino(lugar);
                                            listaLugares.agregarLugar(lugar);
                                            break;
                                        case 3:
                                            opcion=1;
                                            break;
                                    }
                                    break;
                                } while (opcion!=0);
                                conte.agreagarUsuarioViajante(viajanteNuevo);
                                break;
                            case 2: 
                                ayudanteNuevo=new Ayudante(nombre, apellido, nroTelefono, edad, id+1);
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
                               guiaNuevo=new GuiaTurista(nombre, apellido, nroTelefono, edad, id+1);
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
                              case 4: 
                                  opcion=1;
                                  break;
                        }
                        
                    }while(opcion!=0);
               break;
                     case 2:
                         Lugar lug=new Lugar();
                         int inferior, superior, numeroUsuario;
                         String tipoSer=new String();
                         Ayudante ayudanteContratado=new Ayudante();
                         GuiaTurista guiaContratado=new GuiaTurista();
           do {
               menu1de1();
               opcion=lectorMenu.nextInt();
              switch(opcion)
            {   case 1:
                verficarContraseñaExiste(conte, viajanteNuevo);
                System.out.println(viajanteNuevo.toString());
                do {
                    System.out.println("necesita un: ");
                    menuViajanteCO();
                    opcion=lectorMenu.nextInt();
                    switch(opcion)
                    {
                        case 1:
                            do{
                                menuEjecutableViajante1Ayudante();
                     opcion=lectorMenu.nextInt();
                     switch(opcion){
                         case 1:
                             cargarUnLugar(lugar);
                             System.out.println(conte.mostrarAyudantesXdestino(lug));
                             buscarUnaPersonaXid(conte, ayudanteContratado);
                             do {                                 
                                 menuViajanteComentarOcontratar();
                                 opcion=lectorMenu.nextInt();
                                 switch(opcion)
                                 {
                                     case 1:
                                         tipoSer=tipoServicioContratar();
                                         System.out.println(viajanteNuevo.contratar(ayudanteContratado, tipoSer));
                                     case 2:
                                         System.out.println("ingrese el comentario:   ");
                                         comentario=le.nextLine();
                                        comentarioNuevo= viajanteNuevo.comentar(comentario);
                                         ayudanteContratado.agregarComentario(comentarioNuevo);
                                 }
                             } while (opcion!=0);
                             
                             break;
                         case 2:
                             System.out.println("ingrese la edad minima");
                             inferior=lectorMenu.nextInt();
                             System.out.println("ingrese la edad maxima");
                             superior=lectorMenu.nextInt();
                             System.out.println("\n ayudantes con edad minima de "+inferior+" y edad maxima de "+superior+"\n");
                             System.out.println(conte.mostrarAyudantesXRangoDeEdad(inferior, superior));
                             buscarUnaPersonaXid(conte, ayudanteContratado);
                             do {                                 
                                 menuViajanteComentarOcontratar();
                                 opcion=lectorMenu.nextInt();
                                 switch(opcion)
                                 {
                                     case 1:
                                         tipoSer=tipoServicioContratar();
                                         System.out.println(viajanteNuevo.contratar(ayudanteContratado, tipoSer));
                                     case 2:
                                         System.out.println("ingrese el comentario:   ");
                                         comentario=le.nextLine();
                                        comentarioNuevo= viajanteNuevo.comentar(comentario);
                                         ayudanteContratado.agregarComentario(comentarioNuevo);
                                 }
                             } while (opcion!=0);
                             
                     }
                            }while(opcion!=0);
                        
                        
                        case 2:
                            do {  
                                menuEjecutableViajante1Guia();
                                opcion=lectorMenu.nextInt();
                                switch(opcion)
                                {
                                    case 1: 
                                        cargarUnLugar(lugar);
                                        System.out.println(conte.mostrarGuiaXdestino(lug));
                                        buscarUnaPersonaXid(conte, guiaContratado);
                                        tipoSer="guia turistico";
                                        do {                                 
                                 menuViajanteComentarOcontratar();
                                 opcion=lectorMenu.nextInt();
                                 switch(opcion)
                                 {
                                     case 1:
                                         System.out.println(viajanteNuevo.contratar(guiaContratado, tipoSer));
                                     case 2:
                                         System.out.println("ingrese el comentario:   ");
                                         comentario=le.nextLine();
                                        comentarioNuevo= viajanteNuevo.comentar(comentario);
                                         guiaContratado.agregarComentario(comentarioNuevo);
                                 }
                             } while (opcion!=0);
                                        
                                        break;
                                    case 2:
                                        
                             System.out.println("ingrese la edad minima");
                             inferior=lectorMenu.nextInt();
                             System.out.println("ingrese la edad maxima");
                             superior=lectorMenu.nextInt();
                             System.out.println("\n ayudantes con edad minima de "+inferior+" y edad maxima de "+superior+"\n");
                               System.out.println(conte.mostrarGuiaXrangoEdad(inferior, superior));  
                               buscarUnaPersonaXid(conte, guiaContratado);
                               do {                                 
                                 menuViajanteComentarOcontratar();
                                 opcion=lectorMenu.nextInt();
                                 switch(opcion)
                                 {
                                     case 1:
                                         System.out.println(viajanteNuevo.contratar(guiaContratado, tipoSer)); 
                                     case 2:
                                         System.out.println("ingrese el comentario:   ");
                                         comentario=le.nextLine();
                                        comentarioNuevo= viajanteNuevo.comentar(comentario);
                                         guiaContratado.agregarComentario(comentarioNuevo);
                                 }
                             } while (opcion!=0);
                                        
                                }
                                
                            } while (opcion!=0);
                            
                    
                    }
                   
                    
                } while (opcion!=0);
                case 2:
                    verficarContraseñaExiste(conte, ayudanteNuevo);
                    System.out.println(ayudanteNuevo.toString());
                    do {                        
                       menuGuiaViajante();
                        opcion=lectorMenu.nextInt();
                        switch(opcion)
                        {
                            case 1: 
                                do {                                    
                                    menuBuscarViajantes();
                                    opcion=lectorMenu.nextInt();
                                    switch(opcion)
                                    {
                                        case 1:
                                            cargarUnLugar(lugar);
                                            System.out.println(conte.mostrarViajanteXdestino(lug));
                                            buscarUnaPersonaXid(conte, viajanteBuscado);
                                            System.out.println("ingrese el comentario:  ");
                                            comentario=le.nextLine();
                                            comentarioNuevo= ayudanteNuevo.comentar(comentario);
                                            viajanteBuscado.agregarComentario(comentarioNuevo);
                                            case 2:
                                            System.out.println("ingrese la edad minima");
                                            inferior=lectorMenu.nextInt();
                                            System.out.println("ingrese la edad maxima");
                                            superior=lectorMenu.nextInt();
                                            System.out.println("\n viajantes con edad minima de "+inferior+" y edad maxima de "+superior+"\n");
                                            System.out.println(conte.mostrarViajanteXRangodeEdad(inferior, superior)); 
                                            buscarUnaPersonaXid(conte, viajanteBuscado);
                                            System.out.println("ingrese el comentario:  ");
                                            comentario=le.nextLine();
                                            comentarioNuevo= ayudanteNuevo.comentar(comentario);
                                            viajanteBuscado.agregarComentario(comentarioNuevo);
                                                
                                    }
                                } while (opcion!=0);
                                
                                
                        }
                    } while (opcion!=0);
                    
                case 3:
                    verficarContraseñaExiste(conte, guiaNuevo);
                    System.out.println(guiaNuevo.toString());
                                      do {                        
                       menuGuiaViajante();
                        opcion=lectorMenu.nextInt();
                        switch(opcion)
                        {
                            case 1: 
                                do {                                    
                                    menuBuscarViajantes();
                                    opcion=lectorMenu.nextInt();
                                    switch(opcion)
                                    {
                                        case 1:
                                            cargarUnLugar(lugar);
                                            System.out.println(conte.mostrarViajanteXdestino(lug));
                                            buscarUnaPersonaXid(conte, viajanteBuscado);
                                            System.out.println("ingrese el comentario:  ");
                                            comentario=le.nextLine();
                                            comentarioNuevo= guiaNuevo.comentar(comentario);
                                            viajanteBuscado.agregarComentario(comentarioNuevo);
                                            case 2:
                                            System.out.println("ingrese la edad minima");
                                            inferior=lectorMenu.nextInt();
                                            System.out.println("ingrese la edad maxima");
                                            superior=lectorMenu.nextInt();
                                            System.out.println("\n viajantes con edad minima de "+inferior+" y edad maxima de "+superior+"\n");
                                            System.out.println(conte.mostrarViajanteXRangodeEdad(inferior, superior)); 
                                            buscarUnaPersonaXid(conte, viajanteBuscado);
                                            System.out.println("ingrese el comentario:  ");
                                            comentario=le.nextLine();
                                            comentarioNuevo= guiaNuevo.comentar(comentario);
                                            viajanteBuscado.agregarComentario(comentarioNuevo);
                                                
                                    }
                                } while (opcion!=0);
                                
                                
                        }
                    } while (opcion!=0);
            }
             
               
          } while (opcion!=0);
            
               
                    
            }
        
            break;
       }while(opcion!=0);
          }
    public static  void menuGuiaViajante()
    {
        System.out.println("1-comentar a un viajante");
        System.out.println("2- ver el estado de mis servicios");
        System.out.println("3- ver mi contraseña");
    }
    public static  void menuBuscarViajantes()
    { 
        System.out.println("1-Buscar un viajantes por destino.");
        System.out.println("2-Buscar viajantes en  un determinado rango de edad");
        
    }
    public static void menuViajanteComentarOcontratar()
    {
        System.out.println("1- contratar");
        System.out.println("2-comentar");
    }
    public static String tipoServicioContratar()
    {
        Scanner lector=new Scanner(System.in);
        int numeroIngresado;
        String tipoSer=new String();
        System.out.println("seleciones el numero correspondiente a aquel servicio que desea contratar de un ayudante");
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
    static void agregarCotraseñaAlaPersona( Persona per)
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
        System.out.println("4-volver");
    }
    /// para que expecifique que tipo de servicio ofrece el ayudante, y asi crear el objeto que le corresponda
    public static void menu1de2de1()
    {
        System.out.println("1-Transporte");
        System.out.println("2-Alojamiento");
        System.out.println("3-volver");
    }
    // para saber que tipo de servicio necesita el viajante, para crear el objeto que le corresponda
    public static  void menuTipoServicioViajante()
    {
         System.out.println("1-Transporte");
        System.out.println("2-Alojamiento");
        System.out.println("3-Guia turismo");
        System.out.println("4-volver");
        
    }
    //este menu se mostrara despues de que se cree un objeto viajante. y se agregue este al arreglo
    public static  void menu1ViajanteAyudante()
    {
        System.out.println("1-Ingresar datos del servicio ");
        System.out.println("2- ingresar destino a vijar");
        System.out.println("3-volver");
        
    }
   public static  void menuViajanteCO()
   {
       System.out.println("1- ayudante");
       System.out.println("2- guia");
       System.out.println("3-volver");
   }
    public static void menuEjecutableViajante1Ayudante()
    {
        System.out.println("1-Buscar un ayudantes por destino.");
       System.out.println("2-Buscar ayudantes en  un determinado rango de edad");
        System.out.println("3-volver");
    } 
    public static void menuEjecutableViajante1Guia()
    {
        System.out.println("1-Buscar un guias por destino.");
        System.out.println("2-Buscar gias en  un determinado rango de edad");
        System.out.println("3-volver");
       
    }
    public static  void menuPrimeroviajanteEjecutable()
    {
        System.out.println("1- Buscar ayudantes.");
        System.out.println("2- Buscar guias de turistas");
        System.out.println("3-volver");
    }

 
}

