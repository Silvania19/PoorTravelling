
package poortravelling;

public class Transporte extends Servicio implements ServivioCantidad{
    
  private Integer disponibilidadCantidad;
public Transporte()
{
    super(0, disponibilidadTiempo);
}
   
    @Override
    public void setDiponibilidadCantidad(Integer disponibilidad) {
      disponibilidadCantidad=disponibilidad;  
    }

    @Override
    public Integer getDisponibilidadCantidad() {
        return disponibilidadCantidad;

    }

    

   
}
