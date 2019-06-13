
package poortravelling;

public class ServicioGuia extends Servicio{
    private String lugarTuristico;// este especifica a donde el guia va a levar al viajante. ejemplo rio, museo o lo que se le de la gana.

    public  ServicioGuia()
    {
        super();
        setLugarTuristico("");
    }
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
