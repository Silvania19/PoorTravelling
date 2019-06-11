
package poortravelling;


public abstract class Servicio {
 private  float precio;
 private String  disponibilidadTiempo;/// disponibilidad de fecha por ejemplo digo que estoy disponible de 23 de junio a 6 de julio
 
  public Servicio()
  {
      setPrecio(0);
      setDisponibilidadTiempo("");
  }
    public Servicio(float precio, String  disponibilidadTiempo) {
        setDisponibilidadTiempo(disponibilidadTiempo);
        setPrecio(precio);
    }

    public float getPrecio() {
        return precio;
    }

    private void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getDisponibilidadTiempo() {
        return disponibilidadTiempo;
    }

    private void setDisponibilidadTiempo(String disponibilidadTiempo) {
        this.disponibilidadTiempo = disponibilidadTiempo;
    }
    public void modificarPrecio(float nuevoPrecio)
    {
        setPrecio(nuevoPrecio);
    }
 
 
}
