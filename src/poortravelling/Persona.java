package poortravelling;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/**
 * Clase Padre -> Persona
 * @author Silvania-Florencia-Marcos
 */
public abstract class Persona implements  Comparable{

    private String nombre;
    private String apellido;
    private String nroTelefono;
    private Integer edad;
    private String contraseña;
    private Integer id;
    private ArrayList<Comentario> comentarios;
    private Lugar lugar;// para que ponga el destino al que quiere vajar.
     public abstract boolean  transporte();
    public abstract boolean alojamiento();
   public abstract  boolean guia();
    
  /**
  * Constructor vacio
  */
    public Persona() {
        setNombre("");
        setApellido("");
        setEdad(0);
        setNroTelefono("");
        setContraseña("");
        setId(0);
       
        lugar = new Lugar();
        comentarios = new ArrayList<>();
    }
     /**
     * Constructor completo, sin lugar, ni putntaje, ni comentario
     * @param nombre
     * @param apellido
     * @param nroTelefono
     * @param edad
     * @param id 
     */


    public Persona(String nombre, String apellido, String nroTelefono, Integer edad, Integer id) {
        setNombre(nombre);
        setApellido(apellido);
        setNroTelefono(nroTelefono);
        setEdad(edad);
        setContraseña("");
        setId(id);
       
        lugar = new Lugar();
        comentarios = new ArrayList<>();
    }
    
    /**
 * constructor copia, copia todo lo que venga en persona1
 * @param persona1 
 */
    public Persona(Persona persona1) {
        setNombre(persona1.getNombre());
        setApellido(persona1.getApellido());
        setNroTelefono(persona1.getNroTelefono());
        setEdad(persona1.getEdad());
        setId(persona1.getId());
        lugar = new Lugar();//el lugar se remplasara ya que puede ser que cuando camnie de tipo de usuario reemplaza el lugar por lo tal lo borramos y lo volvemos a inicializar en cero toda la clase 
    }
/**
     * Asigno una id
     * @param id 
     */
    public  void setId(Integer id)
      {
          this.id=id;
      }
      /**
       * Muestro la ID
       * @return Id
       */
      public Integer getId()
      {
          return id;
      }
      /**
       * Muestro la contraseña
       * @return contraseña
       */
    public String getContraseña() {
        return contraseña;
    }
    /**
     * Asigno una contraseña
     * @param contraseña 
     */

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    /**
     * Muestro el Nombre
     * @return nombre
     */
    public String getNombre(){
        return nombre;
    }
    /**
     * Asigno un nombre
     * @param nombre 
     */

   public  void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Muestro el apellido
     * @return apellido
     */

    public String getApellido() {
        return apellido;
    }
    /**
     * Asigno un apellido
     * @param apellido 
     */
    public  void setApellido(String apellido) {
        this.apellido = apellido;
    }
    /**
     * Devuelvo el numero de telefono
     * @return numero de telefono 
     */

    public String getNroTelefono() {
        return nroTelefono;
    }
    /**
     * Asigno un numero de teleono
     * @param nroTelefono 
     */
    public void setNroTelefono(String nroTelefono) {
        this.nroTelefono = nroTelefono;
    }
    /**
     * Devuelvo la edad
     * @return edad
     */

    public Integer getEdad() {
        return edad;
    }
    /**
     * Asigno una edad
     * @param edad 
     */
    public  void setEdad(Integer edad) {
        this.edad = edad;
    }
    /**
     * Agrego un comentario al array de comentarios
     * @param comen 
     */
    public void agregarComentario(Comentario comen) {
        comentarios.add(comen);
    }
        /**
     * para generar un objeto comentario, creamos el objeto comentario y como parametro le mandamos nuestro nombre para que lo guarde en el nombre de comentario
     * este comentario posteriormente tiene que ser agregado al arreglo de cometrarios de otra persona 
   
     * @param comentario
     * @return 
     */
    public Comentario comentar(String comentario)
    {
        Comentario retornoComentario=new Comentario(nombre, comentario);/// para generar un objeto comentario, creamos el objeto comentario y como parametro le mandamos nuestro nombre para que lo guarde en el nombre de comentario
        return retornoComentario;/// este comentario posteriormente tien que ser agragdo al arreglo de cometrarios de otra persona 
          //para agragar usara la funcion agregarFuncion               
    }
    public Lugar getLugar()
    {
        return lugar;
    }
    public String listarComentarios() {
        String retorno = new String();
        for (Comentario come : comentarios) {
            retorno += " \n " + comentarios.toString();
        }
        return retorno;
    }
    /**
     * Agrego una contraseña verificando si la misma es valida
     * @param contraseña
     * @param contraseñaRepeticio 
     * @throws ContraseñaInvalidaException 
     */
public void agregarContraseña(String contraseña, String contraseñaRepeticio)throws ContraseñaInvalidaException
    {
        if(verificarContraseña(contraseña, contraseñaRepeticio))
            {
                setContraseña(contraseña);
            }
    }
  /**
     * Verifico si la contraseña es valida
     * @param contraseña
     * @param contraseñaRepeticion
     * @return true si es correcta
     * @throws ContraseñaInvalidaException 
     */
    public boolean verificarContraseña(String contraseña, String contraseñaRepeticion)throws  ContraseñaInvalidaException
    {
        if(contraseña.equals(contraseñaRepeticion))
        {
            return  true;
        }
        else{
            throw  new ContraseñaInvalidaException("las contraseñas no son iguales");
        }
    }
    @Override
    public String toString() {
        return "\n Numero de Usuario"+getId()+"\n Nombre:  " + getNombre() + "\n Apellido:  " + getApellido() + "\n Edad:  " + getEdad() + "\n Numero de telefono:  " + getNroTelefono() + " \n Comentarios: " + listarComentarios();
    }
    /**
     * Modifico el Lugar
     * @param pais
     * @param ciudad
     * @param localidad 
     */
    protected void modificarLugar(String pais, String ciudad, String localidad)
    {
        lugar= new Lugar(pais, ciudad, localidad);
    }
       /**
     * Pasos los datos de Persona a formato Json
     * @return JsonObject con los datos de persona
     * @throws JSONException 
     */
    public JSONObject getFormatoJSON() throws JSONException
    {
        JSONObject jsonPersona= new JSONObject();
        
        jsonPersona.put("apellido", apellido);
        jsonPersona.put("nombre", nombre);
        jsonPersona.put("nroTelefono", nroTelefono);
        jsonPersona.put("contraseña", contraseña);
        jsonPersona.put("id", id);
        jsonPersona.put("edad", edad);
        jsonPersona.put("lugar", lugar.getFormatoJsonLugar());
        JSONArray jsonArray_Comentarios= new JSONArray();
        for(Comentario comen: comentarios)
        {
            jsonArray_Comentarios.put(comen.cambiarComentarioAJson());
            
        }
           jsonPersona.put("comentarios", jsonArray_Comentarios);
        return  jsonPersona;
        
    }
      /**
     * Metodo para elejir lugar de destino del servicio
     * @param pais
     * @param ciudad
     * @param localidad 
     */
   public  void agregarLugarDestino(Lugar lug)
   {
       modificarLugar(lug.getPais(), lug.getCiudad(), lug.getLocalidad());
   }
   public String verMiContraseña()
   {
       return getContraseña();
   }
}
