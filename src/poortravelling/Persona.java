package poortravelling;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
public abstract class Persona {

    private String nombre;
    private String apellido;
    private String nroTelefono;
    private Integer edad;
    private String contraseña;
    private ArrayList<Comentario> comentarios;
    private Integer puntaje;
    private Lugar lugar;// para que ponga el destino al que quiere vajar.
// constructor vacio
 abstract public void agregarLugarDestino(String pais, String ciudad, String localidad);
    public Persona() {
        setNombre("");
        setApellido("");
        setEdad(0);
        setNroTelefono("");
        setPuntaje(0);
        setContraseña("");
        lugar = new Lugar();
        comentarios = new ArrayList<>();
    }
// constructor completo, sin lugar, ni putntaje, ni comentaris

    public Persona(String nombre, String apellido, String nroTelefono, Integer edad, String contraseña) {
        setNombre(nombre);
        setApellido(apellido);
        setNroTelefono(nroTelefono);
        setEdad(edad);
        setPuntaje(0);
        setContraseña(contraseña);
        lugar = new Lugar();
        comentarios = new ArrayList<>();
    }
    // constructor copia, copia todo lo que venga en persona1//

    public Persona(Persona persona1) {
        setNombre(persona1.getNombre());
        setApellido(persona1.getApellido());
        setNroTelefono(persona1.getNroTelefono());
        setEdad(persona1.getEdad());
        lugar = new Lugar();//el lugar se remplasara ya que puede ser que cuando camnie de tipo de usuario reemplaza el lugar por lo tal lo borramos y lo volvemos a inicializar en cero toda la clase 
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
        return "\n Nombre:  " + getNombre() + "\n Apellido:  " + getApellido() + "\n Edad:  " + getEdad() + "\n Numero de telefono:  " + getNroTelefono() + " \n Comentarios: " + listarComentarios();
    }

    protected void modificarLugar(String pais, String ciudad, String localidad)
    {
        lugar= new Lugar(pais, ciudad, localidad);
    }
   
}
