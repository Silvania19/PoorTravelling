
package poortravelling;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONException;

import  java.util.ArrayList;
/**
 * esta clase hereda de persona 
 * para manejar un viajante
 * @author silva
 */
public  class Viajante extends  Persona{
private  ArrayList<Servicio> tiposervicio;/// arreglo de los objtos servicios que pueda llegar a teer el viajante
  public Viajante()
    {
        super();
        tiposervicio= new ArrayList<>();
    }

    public Viajante(String nombre, String apellido, String nroTelefono, Integer edad, Integer id) {
         super(nombre, apellido, nroTelefono,edad, 0);
         tiposervicio=new ArrayList<>();
       
    }
  
    public void agregar(Servicio servicio)
    {
        tiposervicio.add(servicio);
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

    public String ToString() {
        return super.toString()+" \n Servicios:  "+mostrarServicios();
    }
    public String mostrarServicios()
    {
        String retorno=new String();
        for(Servicio ser: tiposervicio)
        {
            retorno+=ser.toString();
        }
        return  retorno;
    }
    /**
     * para ver si el viajante necesita u tranporte
     * @return true si necesita un transporte ; false si no lo necesita
     */
    //
    public boolean transporte()
    {
        boolean retorno=false;
        for(Servicio ser: tiposervicio)
        {
            if(ser instanceof  Transporte)
            {
                retorno=true;
            }
        }
        return retorno;
    }
    /**
     * para ver si el viajante necesita un alojamiento
     * 
     * @return true si lo necesita; false si no lo necesita 
     */
        public boolean alojamiento()
    {
        boolean retorno=false;
        for(Servicio ser: tiposervicio)
        {
            if(ser instanceof  Alojamiento)
            {
                retorno=true;
            }
        }
        return retorno;
    }
      /**  
       * para saber si el viajante necesita un guia
       * @return  true si lo necista; false si no 
       */
    public boolean guia()
    {
        boolean retorno=false;
        for(Servicio ser: tiposervicio)
        {
            if(ser instanceof ServicioGuia)
            {
                retorno=true;
            }
        }
        return retorno;
    }
    /**
     * para que el viajante contrate un servicio
     * al contratar lo que hace es cambiar el disponible del servicio que quiera de aquel usuario que quiera contratar
     * @param p el usuario del que quiere contratar un servicio
     * @param tipoServicio el nombre del servcio que quiera contratar
     * @return  un mensaje diiendo si es que lo conratao
     */
    public String contratar(Persona p, String tipoServicio)
    {
        String retorno=new String();
        if(p instanceof Ayudante)
        {
            Ayudante ayu=(Ayudante)p;
            Transporte trans;
            Alojamiento alo;
            if(tipoServicio.equalsIgnoreCase("transporte"))
            {
                for(int i=0; i<ayu.cantDeServicios(); i++){
                   trans=(Transporte)ayu.buscarServicioPorIdex(i);
                     if(ayu.transporte()&& trans.isDisponible())
                     {
                        retorno= trans.modificarDisponible(false);
                     }
                }
               
            }
            
            if(tipoServicio.equalsIgnoreCase("alojamiento"))
            {
                for(int i=0; i<ayu.cantDeServicios();i++)
                {
                    alo=(Alojamiento)ayu.buscarServicioPorIdex(i);
                    if(ayu.alojamiento()&& alo.isDisponible())
                    {
                        retorno=alo.modificarDisponible(false);
                    }
                }
            }
            
        }
        else if(p instanceof GuiaTurista)
        {
            GuiaTurista guiaTu= (GuiaTurista)p;
            if(guiaTu.guia()&& guiaTu.servicioDelGuia().isDisponible())
            {
                retorno=guiaTu.servicioDelGuia().modificarDisponible(false);
            }
        }
        return  retorno;
    }
    public String descontratar(Persona p, String tipoServicio)
    {
         String retorno=new String();
        if(p instanceof Ayudante)
        {
            Ayudante ayu=(Ayudante)p;
            Transporte trans;
            Alojamiento alo;
            if(tipoServicio.equalsIgnoreCase("transporte"))
            {
                for(int i=0; i<ayu.cantDeServicios(); i++){
                   trans=(Transporte)ayu.buscarServicioPorIdex(i);
                     if(ayu.transporte())
                     {
                        retorno= trans.modificarDisponible(true);
                     }
                }
               
            }
            
            if(tipoServicio.equalsIgnoreCase("alojamiento"))
            {
                for(int i=0; i<ayu.cantDeServicios();i++)
                {
                    alo=(Alojamiento)ayu.buscarServicioPorIdex(i);
                    if(ayu.alojamiento())
                    {
                        retorno=alo.modificarDisponible(true);
                    }
                }
            }
            
        }
        else if(p instanceof GuiaTurista)
        {
            GuiaTurista guiaTu= (GuiaTurista)p;
            if(guiaTu.guia()&& guiaTu.servicioDelGuia().isDisponible())
            {
                retorno=guiaTu.servicioDelGuia().modificarDisponible(true);
            }
        }
        return  retorno;
    }
    public int cantidadElemnetosServicio()
    {
        return tiposervicio.size();
    }
    public Servicio buscarUnServicio(int i)
    {
        return tiposervicio.get(i);
    }
       public JSONArray pasarArregloServicioaJson()throws  JSONException
    {
        JSONArray arraysServicio= new JSONArray();
        JSONObject objectServicio=new JSONObject();
        Servicio ser;
        for(int i=0; i<=tiposervicio.size(); i++)
        {
            ser=tiposervicio.get(i);
            objectServicio= ser.pasarServicioajSONObject();
            arraysServicio.put(objectServicio);
        }
        return arraysServicio;
    }

    @Override
    public JSONObject getFormatoJSON() throws JSONException {
       JSONObject obj=new JSONObject();
        obj=super.getFormatoJSON();
        obj.put("servicios", pasarArregloServicioaJson());
        return  obj;
        
        
    }
       
}
