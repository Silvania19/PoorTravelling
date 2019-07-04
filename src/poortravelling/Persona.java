package poortravelling;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public abstract class Persona {

    private String nombre;
    private String apellido;
    private String nroTelefono;
    private Integer edad;
    private String contraseña;
    private Integer id;
    private ArrayList<Comentario> comentarios;
    private Integer puntaje;
    private Lugar lugar;// para que ponga el destino al que quiere vajar.
// constructor vacio
 public abstract  void agregarLugarDestino(String pais, String ciudad, String localidad);
    public Persona() {
        setNombre("");
        setApellido("");
        setEdad(0);
        setNroTelefono("");
        setPuntaje(0);
        setContraseña("");
        setId(0);
        lugar = new Lugar();
        comentarios = new ArrayList<>();
    }
// constructor completo, sin lugar, ni putntaje, ni comentaris

    public Persona(String nombre, String apellido, String nroTelefono, Integer edad, Integer id) {
        setNombre(nombre);
        setApellido(apellido);
        setNroTelefono(nroTelefono);
        setEdad(edad);
        setPuntaje(0);
        setContraseña("");
        setId(id);
        lugar = new Lugar();
        comentarios = new ArrayList<>();
    }
    public void agregarContraseña(String contraseña, String contraseñaRepeticio)throws ContraseñaInvalidaException
    {
        if(verificarContraseña(contraseña, contraseñaRepeticio))
            {
                setContraseña(contraseña);
            }
    }
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
    // constructor copia, copia todo lo que venga en persona1//

    public Persona(Persona persona1) {
        setNombre(persona1.getNombre());
        setApellido(persona1.getApellido());
        setNroTelefono(persona1.getNroTelefono());
        setEdad(persona1.getEdad());
        setId(persona1.getId());
        lugar = new Lugar();//el lugar se remplasara ya que puede ser que cuando camnie de tipo de usuario reemplaza el lugar por lo tal lo borramos y lo volvemos a inicializar en cero toda la clase 
    }
      private void setId(Integer id)
      {
          this.id=id;
      }
      public Integer getId()
      {
          return id;
      }
    public String getContraseña() {
        return contraseña;
    }

    private void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Integer getPuntaje() {
        return puntaje;
    }

    private void setPuntaje(Integer puntaje) {
        this.puntaje = puntaje;
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    private void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNroTelefono() {
        return nroTelefono;
    }

    private void setNroTelefono(String nroTelefono) {
        this.nroTelefono = nroTelefono;
    }

    public Integer getEdad() {
        return edad;
    }

    private void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void agregarComentario(Comentario comen) {
        comentarios.add(comen);
    }
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

    @Override
    public String toString() {
        return "\n Numero de Usuario"+getId()+"\n Nombre:  " + getNombre() + "\n Apellido:  " + getApellido() + "\n Edad:  " + getEdad() + "\n Numero de telefono:  " + getNroTelefono() + " \n Comentarios: " + listarComentarios();
    }

    protected void modificarLugar(String pais, String ciudad, String localidad)
    {
        lugar= new Lugar(pais, ciudad, localidad);
    }
    public void sumarPuntaje(Integer puntaje)//establecer limites de puntaje de 1 a 10
   {
     this.puntaje+=puntaje;
   }
    public JSONObject getFormatoJSON() throws JSONException
    {
        JSONObject jsonPersona= new JSONObject();
        
        jsonPersona.put("apellido", apellido);
        jsonPersona.put("nombre", nombre);
        jsonPersona.put("nroTelefono", nroTelefono);
        jsonPersona.put("contraseña", contraseña);
        jsonPersona.put("id", id);
        jsonPersona.put("edad", edad);
        jsonPersona.put("puntaje", puntaje);
        jsonPersona.put("lugar", lugar.getFormatoJsonLugar());
        JSONArray jsonArray_Comentarios= new JSONArray();
        for(Comentario comen: comentarios)
        {
            jsonArray_Comentarios.put(comen.cambiarComentarioAJson());
            
        }
           jsonPersona.put("comentarios", jsonArray_Comentarios);
        return  jsonPersona;
        
    }
    
   
}
