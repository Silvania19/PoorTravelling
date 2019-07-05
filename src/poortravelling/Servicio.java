package poortravelling;
import  org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONException;
public abstract class Servicio {

    private float precio;
    private boolean  disponible;//true si esta disponible, false si esta ocupado sera usado para cuando un viajante queiera contrar el servicio


    abstract public boolean verificarPrecio(float precio) throws PrecioIncorrectoException;

    abstract public void agregarPrecio(float precio) throws PrecioIncorrectoException;

    public Servicio() {
        setPrecio(0);
        
        setDisponible(true);// al crearse un servicio el servicio sera verdadero, osea estara disponible
    }
    //no inicializamos precio con un valor traido hasta que verifiquemos en las clases hijas


    public float getPrecio() {
        return precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

 
   public String modificarDisponible(boolean  valorAmodificar){
       String retorno=new String();
       setDisponible(valorAmodificar);
       if(valorAmodificar==true)
       {
           retorno=  "el servicio ya se encuentra de vuelta disponible";
       }
       else if(valorAmodificar==false)
       {
           retorno= " el servivio, ha sido contratado";
       }
       return retorno;
   }

    @Override
    public String toString() {
        return "";
    }
   public JSONObject pasarServicioajSONObject() throws  JSONException
 {
     JSONObject jsonServicio= new JSONObject();
      jsonServicio.put("disponible", disponible);
     return jsonServicio;
 }
}
