
package poortravelling;
import org.json.JSONObject;
import org.json.JSONException;
public class Comentario{
    private String nombre;
    private String comentario;

    public Comentario() {
        setComentario("");
        setNombre("");
    }
 
    public Comentario(String nombre, String comentario) {
        setComentario(comentario);
        setNombre(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getComentario() {
        return comentario;
    }

   private void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Override
    public String toString() {
        return  "  "+getNombre()+" comento:  "+getComentario();
    }
   public JSONObject cambiarComentarioAJson() throws JSONException
   {
       JSONObject obj=new JSONObject();
       obj.put("nombre", nombre);
       obj.put("comentario", comentario);
       return  obj;
   }
    
}
