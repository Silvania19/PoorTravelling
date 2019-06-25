
package poortravelling;

public class Transporte extends ServicioAyudante implements IServicioCantidadYTipo{
    
  public static float PRECIOLIMITETRAMSPORTE=300;
  private String tipoTransporte;
public Transporte()
{
    super();
    setTipo("");
}
public Transporte (String tipoServivio, Integer disponibilidadCantidad, float precio, String disponibilidadTiempo)
{
    super(disponibilidadCantidad, precio, disponibilidadTiempo);
    setTipo(tipoServivio);
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
    }

   


   
    
    

   

