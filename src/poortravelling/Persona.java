
package poortravelling;

import  java.util.ArrayList;
public  class Persona {
  private String nombre;
  private String apellido;
  private String nroTelefono;
  private Integer edad;
  private ArrayList<String> comentario;//fijarnos como funcionaria, si va un arreglo o no.
  private Integer puntaje;//fijarnos si va a arreglo o no.
// constructor vacio
  public Persona ()
  {
      setNombre("");
      setApellido("");
      setEdad(0);
      setNroTelefono("");
      comentario=new ArrayList<>();
  }
// constructor completo
    public Persona(String nombre, String apellido, String nroTelefono, Integer edad) {
        setNombre(nombre);
        setApellido(apellido);
        setNroTelefono(nroTelefono);
        setEdad(edad);
        comentario=new ArrayList<>();
    }
 // constructor copia, copia todo lo que venga en persona1//
    public  Persona(Persona persona1)
    {
        setNombre(persona1.getNombre());
        setApellido(persona1.getApellido());
        setNroTelefono(persona1.getNroTelefono());
        setEdad(persona1.getEdad());
        //es necesario que los comentarios vengan incluidos en una persona, sean incluidos en esta parte ya que estos son de 
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

   private  void setNroTelefono(String nroTelefono) {
        this.nroTelefono = nroTelefono;
    }

    public Integer getEdad() {
        return edad;
    }

   private  void setEdad(Integer edad) {
        this.edad = edad;
    }
   public void agragarComentario(String comentario)
   {
       this.comentario.add(comentario);
   }
   public String listarComentarios()
   {
       String retorno=new String();
       for(String comentario: comentario)
       {
           retorno+=" \n "+comentario;
       }
       return retorno;
   }
    @Override
    public String toString() {
        return  "\n Nombre:  "+getNombre()+"\n Apellido:  "+getApellido()+"\n Edad:  "+ getEdad()+"\n Numero de telefono:  "+getNroTelefono()+" \n Comentarios: "+listarComentarios();
      }

   
  
   
}

