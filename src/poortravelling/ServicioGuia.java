
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
    public String agregarPrecio(float  precio)
    {
        String retorno=new String();
        
        try {
            
            verificarPrecio(precio);
            setPrecio(precio);
            retorno="el precio se agrego correctamebnte";
        
        } catch (Exception e) {
            setPrecio(precio);
           retorno=e.getMessage();
        }
        return retorno;
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
    public boolean modificarPrecio(float precio)throws  PrecioIncorrectoException{
    boolean retorno;
     if(verificarPrecio(precio))
     {
         setPrecio(precio);
         retorno=true;
     }else
     {
         retorno=false;
     }
     return  retorno;
    }
    
  
  
}
