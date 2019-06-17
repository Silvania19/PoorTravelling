
package poortravelling;

public abstract  class ServicioAyudante extends Servicio implements IServicioCantidadYTipo{
     private Integer disponibilidadCantidad;

   public ServicioAyudante()
   {
       super();
       setDiponibilidadCantidad(0);
   }
    public ServicioAyudante(Integer disponibilidadCantidad, float precio, String disponibilidadTiempo) {
        super(precio, disponibilidadTiempo);
        setDiponibilidadCantidad(disponibilidadCantidad);
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
