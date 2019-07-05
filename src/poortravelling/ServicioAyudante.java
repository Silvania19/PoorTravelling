
package poortravelling;
import org.json.JSONObject;
public abstract  class ServicioAyudante extends Servicio implements IServicioCantidadYTipo{
     private Integer disponibilidadCantidad;

   public ServicioAyudante()
   {
       super();
       setDiponibilidadCantidad(0);
   }
    public ServicioAyudante(Integer disponibilidadCantidad) {
       super();
        setDiponibilidadCantidad(disponibilidadCantidad);
        
        
        
    }
@Override
    public Integer getDisponibilidadCantidad() {
        return disponibilidadCantidad;

    } 
   
    

     @Override
    public void setDiponibilidadCantidad(Integer disponibilidad) {
      disponibilidadCantidad=disponibilidad;  
    }

    
   @Override
    public String toString() {
        return super.toString()+"\n Disponibilidad cantidad: "+getDisponibilidadCantidad(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    @Override
    public JSONObject pasarServicioajSONObject() {
        JSONObject jsonServicioAyudante= new JSONObject();
        try {
            jsonServicioAyudante=super.pasarServicioajSONObject();
            jsonServicioAyudante.put("disponibilidad de cantidad", disponibilidadCantidad);
        } catch (Exception e) {
            e.getMessage();
        }
        return  jsonServicioAyudante;
    }
}
