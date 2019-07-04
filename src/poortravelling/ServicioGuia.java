
package poortravelling;

public class ServicioGuia extends Servicio{
    public static  float LIMITEPRECIOGUIA=244;
    private String lugarTuristico;// este especifica a donde el guia va a levar al viajante. ejemplo rio, museo o lo que se le de la gana.

    public  ServicioGuia()
    {
        super();
        setLugarTuristico("");
    }
    //precio sera iniciado en cero, habara una funcion especial para iniciar el precio 
    public ServicioGuia(String lugarTuristico, String disponibilidadTiempo){
        super(disponibilidadTiempo);
        setLugarTuristico(lugarTuristico);
        setPrecio(0);
    }

    @Override
    public void agregarPrecio(float precio) throws PrecioIncorrectoException {
  
        if(verificarPrecio(precio))
        {
            setPrecio(precio);
        }
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

    @Override
    public String toString() {
        return super.toString()+" \n Precio: "+getPrecio()+" \n Lugar turistico: "+getLugarTuristico(); //To change body of generated methods, choose Tools | Templates.
    }

 
    
  
}
