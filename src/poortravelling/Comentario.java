
package poortravelling;
import org.json.JSONObject;
import org.json.JSONException;
/**
 * 
 *@author Silvania-Florencia-Marcos
 */
public class Comentario{
    private String nombre;
    private String comentario;
/**
 * Constructor vacio
 */
    public Comentario() {
        setComentario("");
        setNombre("");
    }
  /**
  * Constructor Completo
  * @param nombre
  * @param comentario 
  */
    public Comentario(String nombre, String comentario) {
        setComentario(comentario);
        setNombre(nombre);
    }
    /**
 * Devuelvo el Nombre
 * @return nombre
 */
    public String getNombre() {
        return nombre;
    }
/**
 * Asigno un Nombre al comentario
 * @param nombre 
 */
    private void setNombre(String nombre) {
        this.nombre = nombre;
    }
/**
 * Muestro el comentario
 * @return comentario
 */
    public String getComentario() {
        return comentario;
    }
/**
 * Asigno un comentario
 * @param comentario 
 */
   private void setComentario(String comentario) {
        this.comentario = comentario;
    }
/**
 * Muestro el comentario con el contenido y nombre de la persona que comento 
 * @return 
 */
    @Override
    public String toString() {
        return  "  "+getNombre()+" comento:  "+getComentario();
    }
     
   /**
    * Metodo para transformar los comentarios a formato JSON
    * @return JSONObject
    * @throws JSONException 
    */
   public JSONObject cambiarComentarioAJson() throws JSONException
   {
       JSONObject obj=new JSONObject();
       obj.put("nombre", nombre);
       obj.put("comentario", comentario);
       return  obj;
   }
    
}
