
package poortravelling;


public class GuiaTurista extends Persona{
    ServicioGuia serGuia;

    public GuiaTurista() {
        super();
        serGuia=new ServicioGuia();
    }
   // cinstructor completo peo dejamos aparte los datos que se le pide al guia para completar su servicio.
    public GuiaTurista( String nombre, String apellido, String nroTelefono, Integer edad, String contraseña, Integer id) {
        super(nombre, apellido, nroTelefono, edad, contraseña, id);
        serGuia=new ServicioGuia();
    }
    public void agregarServivio(String lugarTuristico, float precio, String disponibilidadTiempo)
    {
        serGuia=new ServicioGuia(lugarTuristico, precio, disponibilidadTiempo);
    }

    @Override
    public void agregarLugarDestino(String pais, String ciudad, String localidad) {
        modificarLugar(pais, ciudad, localidad);
       
    }
   
    
   
    
}
