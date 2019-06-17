
package poortravelling;
import  java.util.ArrayList;
import java.util.Scanner;
public class Main {

    
    public static void main(String[] args) {
       final  String constante1AlojamientoAyudante=new String("casa");
       final  String constante2AlojamientoAyudante=new String("departamento");
       final  String constante3AlojamientoAyudante=new String("casa campo");
       final String constante1TransporteAyudante= new String ("auto");
       final String constante2TransporteAyudante= new String("moto");
       final String constante3TransporteAyudante= new String("camioneta");
       final int puntajeMinimo=1;
       final int puntajeMaximo=10;
       
       
      Contenedora conte=new Contenedora();
      GuiaTurista guiaNuevo;
      Viajante viajanteNuevo;
      Ayudante ayudanteNuevo;
      ServicioGuia serviGuia;
      Alojamiento servicioAlojamiento;
      Transporte serTransporte;
      String nombre,apellido, nroTelefono, contraseña, comentario;
      int opcion;
      
       do {
            menu1();
            Scanner lectorMenu = new Scanner(System.in);
            opcion = lectorMenu.nextInt();
            switch (opcion) {
                case 1:
                    
                    
                    
            }
       }while(opcion!=0);
            
      
      
    }
    public static void menu1()
    {
        System.out.println("1-crear usuario");
        System.out.println("2-entrar");
        System.out.println("3-salir");
    }
    
}
