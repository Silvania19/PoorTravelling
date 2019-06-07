
package poortravelling;


public interface Servicio {
    
  void setDisponibilidadTiempo(String disponibilidadDeTiempo);
  void setPrecio(Integer precio);
 
  String getDisponibilidadDeTiempo();
  Integer getPrecio();
  
}
