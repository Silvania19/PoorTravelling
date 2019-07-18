
package poortravelling;
import  java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONException;
/**
 * Esta clase va a ofrecer Servicios a un Viajante
 * @author Silvania-Florencia-Marcos
 */

public class Ayudante extends  Persona{
     
   private  ArrayList<IServicioCantidadYTipo> serviAyudante;
    /**
     * Constructor Vacio
     */
    public Ayudante()
    {
        super();
        serviAyudante=new ArrayList<>();
    }
        /**
     * Constructor completo
     * @param nombre
     * @param apellido
     * @param nroTelefono
     * @param edad
     * @param id 
     */
    public Ayudante(String nombre, String apellido, String nroTelefono, Integer edad, Integer id)
    {
        super(nombre, apellido, nroTelefono, edad, id);
        serviAyudante=new ArrayList<>();
    }
    /**
     * Agrego un servicio al Ayudante
     * @param ser 
     */
    public void agregarServicio(IServicioCantidadYTipo ser)
    {
        serviAyudante.add(ser);
    }

    /**
     * Muestro a Ayudante
     * @return Cadena con datos De tipo persona mas los servicios del Ayudante
     */
    @Override
    public String toString() {
        return super.toString()+"\n Servicios: "+mostrarServiAyudante(); //To change body of generated methods, choose Tools | Templates.
    }
     /**
   * Muestro los servicios
   * @return Sring con los servicios
   */ 
   public String mostrarServiAyudante()
   {
       String retorno=new  String();
       for(IServicioCantidadYTipo ser: serviAyudante)
       {
           retorno+=ser.toString();
       }
       return retorno;
   }

   /**
    * Metodo para saber si el ayudante tiene un servicio de tipo transporte
    * @return true si es correcto
    */
   @Override
    public boolean transporte() {
    boolean retorno=false;
    for(IServicioCantidadYTipo ser: serviAyudante)
    {
      if(ser instanceof  Transporte)
      {
          retorno=true;
      }
    }
    return retorno;
    }
    /**
     * Metodo para saber si el ayudante tiene un servicio de tipo alojamiento
     * @return true si es que lo tiene
     */
    @Override
    public boolean alojamiento() {
        boolean retorno=false;
        for(IServicioCantidadYTipo ser: serviAyudante){
        if(ser instanceof  Alojamiento)
      {
          retorno=true;
      }
        }return retorno;
    }
    
    
    /**
     * 
     * @return FALSE porque el ayudante no puede tener un servicio de tipo guia
     */
    @Override
    public boolean guia() {
   return  false;
    }
  
    /**
     * 
     * @return la cantidad de elementos que tiene el arreglo de elementos en el arreglo de servicios
     */
    public int cantDeServicios()
    {
        return  serviAyudante.size();
    }
      /**
     * @param i indice a buscar
     * @return un tipo de alojamiento o transporte segun la ubicacios
     */
    public  IServicioCantidadYTipo buscarServicioPorIdex(int i)
    {
        return  serviAyudante.get(i);
    }
    /**
     * Metodo para convertir un ayudante a formato JSON
     * @return JsonObject con datos del ayudante
     * @throws JSONException 
     */
    @Override
    public JSONObject getFormatoJSON() throws JSONException {
       JSONObject jsonAyudante= new JSONObject();
       
            jsonAyudante= super.getFormatoJSON();
            jsonAyudante.put("servicios", pasarArregloServicioaJson());
      
        return  jsonAyudante;
    }
  /**
   * Metodo para convertir el arreglo de servcio de ayudante a formato JSON
   * @return JsonArray 
   * @throws JSONException 
   */
   public JSONArray pasarArregloServicioaJson()throws  JSONException
    {
        JSONArray arraysServicio= new JSONArray();
        JSONObject objectServicio=new JSONObject();
        Servicio ser;
        for(int i=0; i<=serviAyudante.size(); i++)
        {
            ser=(Servicio)serviAyudante.get(i);
            objectServicio= ser.pasarServicioajSONObject();
            arraysServicio.put(objectServicio);
        }
        return arraysServicio;
    }
}


