
package poortravelling;

public interface IServicioCantidadYTipo {
       final  String CONSTANTE1ALOJAMIENTOAYUDANTE=new String("casa");
       final  String CONSTANTE2ALOJAMIENTOAYUDANTE=new String("departamento");
       final  String CONSTANTE3ALOJAMIENTOAYUDANTE=new String("casa campo");
       final String CONTANTE1TRANSPORTEAYUDANTE= new String ("auto");
       final String CONTANTE2TRANSPORTEAYUDANTE= new String("moto");
       final String CONTANTE3TRANSPORTEAYUDANTE= new String("camioneta");
    void setDiponibilidadCantidad(Integer disponibilidad);
    void setTipo(String tipo);
    String getTipo();
    Integer getDisponibilidadCantidad();
}
