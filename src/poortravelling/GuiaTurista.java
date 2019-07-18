
package poortravelling;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONObject;
import org.json.JSONException;
/**
 * Esta clase va a ofrecer servicio de turismo a los Viajantes
 * @author Silvania-Florencia-Marcos
 */
public class GuiaTurista extends Persona{
    private ServicioGuia serGuia;
/**
 * Constructor vacio
 */
    public GuiaTurista() {
        super();
        serGuia=new ServicioGuia();
    }
      
    /**
     * Constructor completo pero dejamos aparte los datos que se le pide al guia para completar su servicio.
     * @param nombre
     * @param apellido
     * @param nroTelefono
     * @param edad
     * @param id 
     */
    public GuiaTurista( String nombre, String apellido, String nroTelefono, Integer edad, Integer id) {
        super(nombre, apellido, nroTelefono, edad, id);
        serGuia=new ServicioGuia();
    }
    public  ServicioGuia getSerGuia()
    {
        return  serGuia;
    }
       /**
     * Metodo donde agrego un servicio al guia
     * @param ServicioGuia
     * @throws PrecioIncorrectoException 
     */
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
    public JSONObject getFormatoJSON() throws  JSONException{
        JSONObject jsonGuaTurista= new JSONObject();
                
  
            jsonGuaTurista= super.getFormatoJSON();
            jsonGuaTurista.put("servicios", serGuia.pasarServicioajSONObject());
   
        return  jsonGuaTurista;
    }
   
    
}
