
package poortravelling;
import org.json.JSONObject;

public interface IServicioCantidadYTipo {
       final  String CONSTANTE1ALOJAMIENTOAYUDANTE=new String("casa");
       final  String CONSTANTE2ALOJAMIENTOAYUDANTE=new String("departamento");
       final  String CONSTANTE3ALOJAMIENTOAYUDANTE=new String("casa campo");
       final String CONTANTE1TRANSPORTEAYUDANTE= new String ("auto");
       final String CONTANTE2TRANSPORTEAYUDANTE= new String("moto");
       final String CONTANTE3TRANSPORTEAYUDANTE= new String("camioneta");
   public  void setDiponibilidadCantidad(Integer disponibilidad);
    public void setTipo(String tipo);
   public  String getTipo();
   public  Integer getDisponibilidadCantidad();
   public boolean verificarTipoServicio(String tipoServicio)throws TipoServicioIncorrectoException;
   public void agregarTipoServicio(String tipoServicio)throws TipoServicioIncorrectoException;
   public String mostrarTiposServicios();
      JSONObject pasarIServicioCantidadYTipo();
}
