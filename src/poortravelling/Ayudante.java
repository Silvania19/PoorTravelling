
package poortravelling;
import  java.util.ArrayList;

public class Ayudante extends  Persona{
     
    ArrayList<IServicioCantidadYTipo> serviAyudante;
    public Ayudante()
    {
        super();
        serviAyudante=new ArrayList<>();
    }
    public Ayudante(String nombre, String apellido, String nroTelefono, Integer edad, String contraseña, Integer id)
    {
        super(nombre, apellido, nroTelefono, edad, contraseña, id);
        serviAyudante=new ArrayList<>();
    }

    public void agregarServicio(IServicioCantidadYTipo ser)
    {
        serviAyudante.add(ser);
    }

    @Override
    public void agregarLugarDestino(String pais, String ciudad, String localidad) {
     modificarLugar(pais, ciudad, localidad);
    }

  
}
