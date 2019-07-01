package poortravelling;

public class Alojamiento extends ServicioAyudante {

    private String tipoAlojamiento;
    public static float PRECIOLIMITEALOJAMIENTO=500;
    public Alojamiento() {
        super();
        setTipo("");

    }

    public Alojamiento(String tipoAlojamiento, Integer disponibilidadCantidad, float precio, String disponibilidadTiempo) throws  PrecioIncorrectoException{
        super(disponibilidadCantidad,  disponibilidadTiempo);
        setTipo(tipoAlojamiento);
        if(verificarPrecio(precio))
        {
            setPrecio(precio);
        }
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
