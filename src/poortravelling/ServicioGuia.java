
package poortravelling;

public class ServicioGuia extends Servicio{
    private String lugarTuristico;

    public ServicioGuia(String lugarTuristico, float precio, String disponibilidadTiempo) {
        super(precio, disponibilidadTiempo);
        setLugarTuristico(lugarTuristico);
    }

    public String getLugarTuristico() {
        return lugarTuristico;
    }

    private void setLugarTuristico(String lugarTuristico) {
        this.lugarTuristico = lugarTuristico;
    }
    
  
  
}
