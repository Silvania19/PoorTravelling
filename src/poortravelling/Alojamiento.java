package poortravelling;
///falta verificar tipo 
//verificar precio
public class Alojamiento extends ServicioAyudante {

    private String tipoAlojamiento;
    public static float PRECIOLIMITEALOJAMIENTO=500;
    public Alojamiento() {
        super();
        setTipo("");

    }

    public Alojamiento(String tipoAlojamiento, Integer disponibilidadCantidad, String disponibilidadTiempo){
        super(disponibilidadCantidad,  disponibilidadTiempo);
        setTipo(tipoAlojamiento);
        setPrecio(0);
    }
    

    @Override
    public void setTipo(String tipo) {
        tipoAlojamiento=tipo;
        
    }

    @Override
    public String getTipo() {
    return tipoAlojamiento;
    }

    @Override
    public boolean verificarPrecio(float precio) throws PrecioIncorrectoException{
  if(precio<=PRECIOLIMITEALOJAMIENTO)
  {
      return true;
  }
  else
  {
      throw new PrecioIncorrectoException("el precio para el alojamiento es incorrecto");
      
  }
    }

    @Override
    public boolean modificarPrecio(float precio) throws PrecioIncorrectoException {
    }

}
