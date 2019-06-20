
package poortravelling;

public class Transporte extends ServicioAyudante implements IServicioCantidadYTipo{
    
  
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

   


   
    
    

   
}
