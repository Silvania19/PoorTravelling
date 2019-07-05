
package poortravelling;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONObject;
import org.json.JSONException;

public class GuiaTurista extends Persona{
    private ServicioGuia serGuia;

    public GuiaTurista() {
        super();
        serGuia=new ServicioGuia();
    }
   // cinstructor completo peo dejamos aparte los datos que se le pide al guia para completar su servicio.
    public GuiaTurista( String nombre, String apellido, String nroTelefono, Integer edad, Integer id) {
        super(nombre, apellido, nroTelefono, edad, id);
        serGuia=new ServicioGuia();
    }
    public  ServicioGuia getSerGuia()
    {
        return  serGuia;
    }
    public void agregarServivio(ServicioGuia ser)
    {
        serGuia=new ServicioGuia(ser.getLugarTuristico());
    }
    public ServicioGuia servicioDelGuia()
    {
        return  getSerGuia();
    }
    

    @Override
    public String toString() {
        return super.toString()+"\n Servicio:"+serGuia.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean transporte() {
   return false;
    }

    @Override
    public boolean alojamiento() {
   return  false;
    }

    @Override
    public boolean guia() {
     return  true;
    }
   
    @Override
    public JSONObject getFormatoJSON()   {
        JSONObject jsonGuaTurista= new JSONObject();
                
        try { 
            jsonGuaTurista= super.getFormatoJSON();
            jsonGuaTurista.put("guia", serGuia);
        } catch (JSONException ex) {
            ex.getMessage();
        }
        return  jsonGuaTurista;
    }
   
    
}
