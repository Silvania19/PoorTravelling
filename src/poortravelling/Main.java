
package poortravelling;
import  java.util.ArrayList;
import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
      
    
      /*final  String constante1AlojamientoAyudante=new String("casa");
       final  String constante2AlojamientoAyudante=new String("departamento");
       final  String constante3AlojamientoAyudante=new String("casa campo");
       final String constante1TransporteAyudante= new String ("auto");
       final String constante2TransporteAyudante= new String("moto");
       final String constante3TransporteAyudante= new String("camioneta");
       final int puntajeMinimo=1;
       final int puntajeMaximo=10;*/
      
       ServicioGuia serv= new ServicioGuia();
        System.out.println(serv.agregarPrecio(678));
        
       
       
       
      Contenedora conte=new Contenedora();
    GuiaTurista guiaNuevo;
     /* GuiaTurista guia=new GuiaTurista("flor", "juarez", "67655", 10 ,"hilo" , 86434);
      GuiaTurista a=new GuiaTurista("marcos ", "cabezas", "78899", 15, "hola", 6743345);
      conte.agregarUsuarioGuiaTurista(guiaNuevo);
      conte.agregarUsuarioGuiaTurista(guia);
      conte.agregarUsuarioGuiaTurista(a);
        System.out.println(" chicos"+ conte.usuarioGuiasTuristas.mostrarPorRangoDeEdad(15, 20));*/
      Viajante viajanteNuevo;
      Ayudante ayudanteNuevo;
      ServicioGuia serviGuia;
      Alojamiento servicioAlojamiento;
      Transporte serTransporte;
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
                                System.out.println("ingrese contraseña");
                                contraseña=le.nextLine();
                                System.out.println("ingrese de vuelta su contraseña");
                                contraseñaRepeticion=le.nextLine();
                                viajanteNuevo= new Viajante(nombre, apellido, nroTelefono, edad, 0);
                                viajanteNuevo.agregarContraseña(contraseña, contraseñaRepeticion);
                                do {
                                    menu1Viajante();
                                    opcion=lectorMenu.nextInt();
                                    switch(opcion){
                                        case 1:
                                            do { 
                                                menuTipoServicioViajante();
                                                
                                            } while (opcion!=0);
                                    }
                                    
                                } while (opcion!=0);
                                
                                break;
                            case 2: 
                                ayudanteNuevo=new Ayudante(nombre, apellido, nroTelefono, edad, 0);
                                System.out.println(ayudanteNuevo.toString());
                                do {                                    
                                    menu1de2de1();
                                    String tipoDeServicio, disponibilidadTiempo;
                                    Integer cantidadDisponible;
                                    opcion=lectorMenu.nextInt();
                                    switch(opcion)
                                    {
                                        case 1:
                                            System.out.println("ingrese datos del servicio transporte");
                                            System.out.println("ingrese tipo:");
                                            tipoDeServicio=le.nextLine();
                                            System.out.println("ingrese cantidad de lugares(espacio) disponibles que tiene");//cantidad de persons
                                            cantidadDisponible=lectorMenu.nextInt();
                                            System.out.println("ingrese cuanto tiempo dispone el servicio");
                                            disponibilidadTiempo=le.nextLine();
                                            System.out.println("ingrese el precio de su servicio");
                                            precio=lectorMenu.nextFloat();
                                            serTransporte= new Transporte(tipoDeServicio, cantidadDisponible, disponibilidadTiempo);
                                            //agregar precio 
                                            ayudanteNuevo.agregarServicio(serTransporte);
                                        case 2 : 
                                             System.out.println("ingrese datos del servicio transporte");
                                            System.out.println("ingrese tipo:");
                                            tipoDeServicio=le.nextLine();
                                            System.out.println("ingrese cantidad de lugares(espacio) disponibles que tiene");//cantidad de persons
                                            cantidadDisponible=lectorMenu.nextInt();
                                            System.out.println("ingrese cuanto tiempo dispone el servicio");
                                            disponibilidadTiempo=le.nextLine();
                                            System.out.println("ingrese el precio de su servicio");
                                            precio=lectorMenu.nextFloat();
                                            //agregar precio
                                            servicioAlojamiento=new Alojamiento(tipoDeServicio, cantidadDisponible, disponibilidadTiempo);
                                    }
                                } while (opcion!=0);
                        }
                        
                    }while(opcion!=0);
                    
                    
                    
            }
       }while(opcion!=0);
            
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
    /*
     public static  Servicio ingresarDatosServicio(Servicio ser)
     { 
         Scanner lectorString= new Scanner(System.in);
         Scanner lectorInt=new Scanner(System.in);
         String tipoDeServicio, disponibilidadTiempo;
         Integer cantidadDisponible;
         float precio;
         System.out.println("ingrese datos del servicio transporte");
        System.out.println("ingrese tipo:");
        tipoDeServicio=lectorInt.nextLine();
         System.out.println("ingrese cantidad de lugares(espacio) disponibles que tiene");//cantidad de persons
         cantidadDisponible=lectorString.nextInt();
         System.out.println("ingrese cuanto tiempo dispone el servicio");
         disponibilidadTiempo=lectorInt.nextLine();
         System.out.println("ingrese el precio de su servicio");
         precio=lectorString.nextFloat();
         ser=new Servicio
          //agregar precio
         
     }*/
}

