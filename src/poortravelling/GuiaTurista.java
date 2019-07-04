
package poortravelling;


public class GuiaTurista extends Persona{
    ServicioGuia serGuia;

    public GuiaTurista() {
        super();
        serGuia=new ServicioGuia();
    }
   // cinstructor completo peo dejamos aparte los datos que se le pide al guia para completar su servicio.
    public GuiaTurista( String nombre, String apellido, String nroTelefono, Integer edad, Integer id) {
        super(nombre, apellido, nroTelefono, edad, id);
        serGuia=new ServicioGuia();
    }
    public void agregarServivio(String lugarTuristico, String disponibilidadTiempo)throws PrecioIncorrectoException
    {
        serGuia=new ServicioGuia(lugarTuristico,disponibilidadTiempo);
    }

    @Override
    public void agregarLugarDestino(String pais, String ciudad, String localidad) {
        modificarLugar(pais, ciudad, localidad);
       
    }

    @Override
    public String toString() {
        return super.toString()+"\n Servicio:"+serGuia.toString(); //To change body of generated methods, choose Tools | Templates.
    }
   
    
   
    
}
