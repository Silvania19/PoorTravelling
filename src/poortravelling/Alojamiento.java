package poortravelling;
///falta verificar tipo 
//verificar precio
/**
 * 
 * @author Silvania-Florencia-Marcos
 */
import org.json.JSONObject;
import org.json.JSONException;
import org.json.JSONArray;
public class Alojamiento extends ServicioAyudante {

    private String tipoAlojamiento;
    public static float PRECIOLIMITEALOJAMIENTO=500;
        /**
     * Constructor vacio
     */
    public Alojamiento() {
        super();
        setTipo("");

    }
/**
 * Constructor completo
 * @param disponibilidadCantidad
 * @param disponibilidadTiempo 
 */
    public Alojamiento(Integer disponibilidadCantidad){
        super(disponibilidadCantidad);
        setTipo("");
        setPrecio(0);
    }
    
/**
 * Asigna un tipo de alojamiento
 * @param tipo 
 */
    @Override
    public void setTipo(String tipo) {
        tipoAlojamiento=tipo;
        
    }
/**
 * Muestra el tipo de Alojamiento
 * @return tipoAlojamiento
 */
    @Override
    public String getTipo() {
    return tipoAlojamiento;
    }
/**
 * Verifica si el precio a asignar es valido o no.
 * @param precio
 * @return true si el precio es correcto, que no paso el limite.
 * @throws PrecioIncorrectoException 
 */
    @Override
    public boolean verificarPrecio(float precio) throws PrecioIncorrectoException{
  if(precio<=PRECIOLIMITEALOJAMIENTO)
  {
      return true;
  }
  else
  {
      throw new PrecioIncorrectoException("el precio para el alojamiento es incorrecto");
      
        }
    }

    
    /**
     * Asigno un precio mientras verifico el mismo
     * @param precio
     * @throws PrecioIncorrectoException 
     */

    @Override
    public void agregarPrecio(float precio) throws PrecioIncorrectoException {
            if(verificarPrecio(precio))
        {
            setPrecio(precio);
        }
            
            
  }
        /**
     * Verifica Si el tipo de Servicio es valido
     * @param tipoServicio
     * @return true si el Tipo de srvicio es corrrecto
     * @throws TipoServicioIncorrectoException 
     */
    @Override
    public boolean verificarTipoServicio(String tipoServicio) throws TipoServicioIncorrectoException {
              if(tipoServicio.equalsIgnoreCase(CONSTANTE1ALOJAMIENTOAYUDANTE)|| tipoServicio.equalsIgnoreCase(CONSTANTE3ALOJAMIENTOAYUDANTE))
        {
            return true;
        }
        else
        {
            throw new TipoServicioIncorrectoException(" el tipo de servicio ingresado no correponde a algun tipo de transporte");
        }
    }
    
   /**
     * Asigno un tipo de servicio mientras verifico si el mismo es valido
     * @param tipoServicio
     * @throws TipoServicioIncorrectoException 
     */
    @Override
    public void agregarTipoServicio(String tipoServicio) throws TipoServicioIncorrectoException {
          if(verificarTipoServicio(tipoServicio))
        {
           setTipo(tipoServicio);
         }
    }
     /**
     * Muestro los Tipos de Servicios
     * 
     */
    @Override
    public String mostrarTiposServicios() {
    return "( " +CONSTANTE1ALOJAMIENTOAYUDANTE+ "   "+CONSTANTE2ALOJAMIENTOAYUDANTE+"  "+CONSTANTE3ALOJAMIENTOAYUDANTE+" )";
    }
   
    void agregarTipoServicio(Alojamiento alojamiento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Muestro el tipo de alojamiento y el precio
     * @return datos del alojamiento
     */
    @Override
    public String toString() {
        return super.toString()+" \n Precio: "+getPrecio()+" \n Tipo de alojamiento: "+getTipo(); //To change body of generated methods, choose Tools | Templates.
    }
    


  /*  @Override
    public JSONObject pasarIServicioCantidadYTipo() {
        JSONObject jsonAlojamiento= new JSONObject();
        try {
           jsonAlojamiento= super.pasarServicioajSONObject();
           jsonAlojamiento.put("tipo de alojamiento", tipoAlojamiento);
           jsonAlojamiento.put("limite de precio", PRECIOLIMITEALOJAMIENTO);
        } catch (Exception e) {
            e.getMessage();
        }
        return  jsonAlojamiento;
   }
    */

    @Override
    public JSONObject pasarServicioajSONObject() throws JSONException {
        JSONObject obj=new JSONObject();
      obj= super.pasarServicioajSONObject(); //To change body of generated methods, choose Tools | Templates.
       obj=obj.put("tipo de alojamiento", tipoAlojamiento);
       obj=obj.put("precio", getPrecio());
       return  obj;
    }

}
