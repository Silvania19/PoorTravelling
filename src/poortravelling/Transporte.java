
package poortravelling;


public class Transporte extends ServicioAyudante implements IServicioCantidadYTipo{
    
  public static float PRECIOLIMITETRAMSPORTE=300;
  private String tipoTransporte;
public Transporte()
{
    super();
    setTipo("");
}
public Transporte (String tipoServicio, Integer disponibilidadCantidad, String disponibilidadTiempo)
{
    super(disponibilidadCantidad, disponibilidadTiempo);
    setTipo(tipoServicio);
    setPrecio(0);
    
}

 
   /* @Override
  public void  modificarPrecio(float nuevoPrecio)
{
  String retorno=new String();
  boolean modificoOno;
      try {
            while( verificarPrecio(nuevoPrecio))
          
              setPrecio(nuevoPrecio);
            modificoOno=true;
             
      }
         
            catch (PrecioIncorrectoException ex) {
              retorno=ex.getMessage();
                modificarPrecio(nuevoPrecio);
            }
    return retorno; 
}
*/

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

    @Override
    public boolean modificarPrecio(float precio) throws PrecioIncorrectoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }

   


   
    
    

   

