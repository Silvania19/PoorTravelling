
package poortravelling;

public abstract  class ServicioAyudante extends Servicio implements IServicioCantidadYTipo{
     private Integer disponibilidadCantidad;

   public ServicioAyudante()
   {
       super();
       setDiponibilidadCantidad(0);
   }
    public ServicioAyudante(Integer disponibilidadCantidad,  String disponibilidadTiempo) {
       super(disponibilidadTiempo);
        setDiponibilidadCantidad(disponibilidadCantidad);
        
        
        
    }
@Override
    public Integer getDisponibilidadCantidad() {
        return disponibilidadCantidad;

    } 
   
    

     @Override
    public void setDiponibilidadCantidad(Integer disponibilidad) {
      disponibilidadCantidad=disponibilidad;  
    }

    
   @Override
    public String toString() {
        return super.toString()+"\n Disponibilidad cantidad: "+getDisponibilidadCantidad(); //To change body of generated methods, choose Tools | Templates.
    }
    
    

}
