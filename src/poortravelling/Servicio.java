
package poortravelling;


public abstract class Servicio {

 private  float precio;
 private String  disponibilidadTiempo;/// disponibilidad de fecha por ejemplo digo que estoy disponible de 23 de junio a 6 de julio
 abstract public boolean verificarPrecio(float precio)throws PrecioIncorrectoException;
 abstract public boolean modificarPrecio(float precio)throws PrecioIncorrectoException;
  public Servicio()
  {
      setPrecio(0);
      setDisponibilidadTiempo("");
  }
  //no inicializamos precio con un valor traido hasta que verifiquemos en las clases hijas
    public Servicio( String  disponibilidadTiempo) {
        setDisponibilidadTiempo(disponibilidadTiempo);
        setPrecio(0);
        
    }
 
    public float getPrecio() {
        return precio;
    }

   public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getDisponibilidadTiempo() {
        return disponibilidadTiempo;
    }

    private void setDisponibilidadTiempo(String disponibilidadTiempo) {
        this.disponibilidadTiempo = disponibilidadTiempo;
    }
 

}
