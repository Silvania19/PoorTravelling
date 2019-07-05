
package poortravelling;

import org.json.JSONException;
import org.json.JSONObject;

public class Transporte extends ServicioAyudante implements IServicioCantidadYTipo{
    
  public static float PRECIOLIMITETRAMSPORTE=300;
  private String tipoTransporte;
public Transporte()
{
    super();
    setTipo("");
}
public Transporte ( Integer disponibilidadCantidad)
{
    super(disponibilidadCantidad);
    setTipo("");
    setPrecio(0);
    
}



@Override
    public void setTipo(String tipo) {
        tipoTransporte=tipo;
    }
  @Override
    public String getTipo() {
     return  tipoTransporte;
    }

    @Override
    public boolean isDisponible() {
        return super.isDisponible(); 
    }
   
 
    @Override
   public boolean verificarPrecio(float  precio) throws PrecioIncorrectoException
 {
     boolean retorno;
     if(precio<=PRECIOLIMITETRAMSPORTE)
     {
         retorno= true;
     }
     else
         
     {
         throw new PrecioIncorrectoException("el precio ingresado supera el limite de precio establecido por el sistema");
       
     }
   return retorno;
 }


    @Override
    public void agregarPrecio(float precio) throws PrecioIncorrectoException {
       if(verificarPrecio(precio))
        {
            setPrecio(precio);
        }
    }

    @Override
    public boolean verificarTipoServicio(String tipoServicio) throws TipoServicioIncorrectoException {
        if(tipoServicio.equalsIgnoreCase(CONTANTE1TRANSPORTEAYUDANTE)|| tipoServicio.equalsIgnoreCase(CONTANTE2TRANSPORTEAYUDANTE)|| tipoServicio.equalsIgnoreCase(CONTANTE3TRANSPORTEAYUDANTE))
        {
            return true;
        }
        else
        {
            throw new TipoServicioIncorrectoException(" el tipo de servicio ingresado no correponde a algun tipo de transporte");
        }
            }

    @Override
    public void agregarTipoServicio(String tipoServicio) throws TipoServicioIncorrectoException {
   if(verificarTipoServicio(tipoServicio))
   {
       setTipo(tipoServicio);
   }
    }

    @Override
    public String mostrarTiposServicios() {
   return "( " +CONTANTE1TRANSPORTEAYUDANTE+ "   "+CONTANTE2TRANSPORTEAYUDANTE+"  "+CONTANTE3TRANSPORTEAYUDANTE+" )";
   
           }

    @Override
    public String toString() {
        return super.toString()+" \n Precio: "+getPrecio()+" \n Tipo de transporte: "+getTipo(); //To change body of generated methods, choose Tools | Templates.
    }



    @Override
    public JSONObject pasarServicioajSONObject()throws  JSONException{
        JSONObject jsonTransporte= new JSONObject();
        
            jsonTransporte=super.pasarServicioajSONObject();
            jsonTransporte.put("Tipo de transporte", tipoTransporte);
            jsonTransporte.put("precio", getPrecio());
      
        return jsonTransporte;
    }
    
    
    }

   


   
    
    

   

