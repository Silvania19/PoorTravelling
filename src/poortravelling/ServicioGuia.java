
package poortravelling;

public class ServicioGuia extends Servicio{
    public static  float LIMITEPRECIOGUIA=244;
    private String lugarTuristico;// este especifica a donde el guia va a levar al viajante. ejemplo rio, museo o lo que se le de la gana.

    public  ServicioGuia()
    {
        super();
        setLugarTuristico("");
    }
    public ServicioGuia(String lugarTuristico, float precio, String disponibilidadTiempo) {
        super(disponibilidadTiempo);
        setLugarTuristico(lugarTuristico);
    }
    public void modificarLimitePrecio(float nuevoPrecio)
    {
        LIMITEPRECIOGUIA=nuevoPrecio;
    }
    public String getLugarTuristico() {
        return lugarTuristico;
    }

    private void setLugarTuristico(String lugarTuristico) {
        this.lugarTuristico = lugarTuristico;
    }

    @Override
    public boolean verificarPrecio(float precio) throws PrecioIncorrectoException {
    
        if(precio<=LIMITEPRECIOGUIA)
        {
            return true;
        }
        else
        {
            throw new PrecioIncorrectoException(" el precio por el servicio es superior al limite");
        }
    }
    
  
  
}
