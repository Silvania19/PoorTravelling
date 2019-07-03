
package poortravelling;

import  java.util.ArrayList;
public  class Viajante extends  Persona{
 ArrayList<Servicio> tiposervicio;
  public Viajante()
    {
        super();
        tiposervicio= new ArrayList<>();
    }

    public Viajante(String nombre, String apellido, String nroTelefono, Integer edad, Integer id) {
         super(nombre, apellido, nroTelefono,edad, 0);
         tiposervicio=new ArrayList<>();
       
    }
    public String ToString() {
        return super.toString();
    }
    public void agregar(Servicio servicio)
    {
        tiposervicio.add(servicio);
    }

    @Override
    public void agregarLugarDestino(String pais, String ciudad, String localidad) {
        modificarLugar(pais, ciudad, localidad);
    }
       public String mostrar()
       {
           String retorno= new String();
           for(Servicio s: tiposervicio)
           {
               retorno+= s.toString();
           }
           return retorno;
       }
  public void eliminarServicio(Servicio servicio)
  {
      tiposervicio.remove(servicio);
  }
  public String mostrarServicioEspecifico(Servicio servicio)
  {
      String retorno= new String();
      retorno=servicio.toString();
      return  retorno;
  }
  public Servicio buscarServicioPorDisponibilidadDeTiempo(String dispTiempo){
      Servicio serRetorno = null;
      for(Servicio serv: tiposervicio)
      {
          if (serv instanceof Transporte) {
              serRetorno= new Transporte();
              
          }
          else if(serv instanceof  Alojamiento)
          {
              serRetorno= new Alojamiento();
          }
          else
          {
            serRetorno= new ServicioGuia();
          }
          if(serRetorno.getDisponibilidadTiempo().equals(dispTiempo))
          {
              serRetorno=serv;
          }
      }
      return serRetorno;
  } 
  
}
