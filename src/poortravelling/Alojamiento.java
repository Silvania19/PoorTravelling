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

    public Alojamiento(Integer disponibilidadCantidad, String disponibilidadTiempo){
        super(disponibilidadCantidad,  disponibilidadTiempo);
        setTipo("");
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
    public void agregarPrecio(float precio) throws PrecioIncorrectoException {
            if(verificarPrecio(precio))
        {
            setPrecio(precio);
        }
            
            
  }

    @Override
    public boolean verificarTipoServicio(String tipoServicio) throws TipoServicioIncorrectoException {
              if(tipoServicio.equalsIgnoreCase(CONSTANTE1ALOJAMIENTOAYUDANTE)|| tipoServicio.equalsIgnoreCase(CONSTANTE3ALOJAMIENTOAYUDANTE))
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
    return "( " +CONSTANTE1ALOJAMIENTOAYUDANTE+ "   "+CONSTANTE2ALOJAMIENTOAYUDANTE+"  "+CONSTANTE3ALOJAMIENTOAYUDANTE+" )";
    }

    void agregarTipoServicio(Alojamiento alojamiento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return super.toString()+" \n Precio: "+getPrecio()+" \n Tipo de alojamiento: "+getTipo(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    

}
