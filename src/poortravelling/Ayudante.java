
package poortravelling;
import  java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONException;

public class Ayudante extends  Persona{
     
   private  ArrayList<IServicioCantidadYTipo> serviAyudante;
    public Ayudante()
    {
        super();
        serviAyudante=new ArrayList<>();
    }
    public Ayudante(String nombre, String apellido, String nroTelefono, Integer edad, Integer id)
    {
        super(nombre, apellido, nroTelefono, edad, id);
        serviAyudante=new ArrayList<>();
    }

    public void agregarServicio(IServicioCantidadYTipo ser)
    {
        serviAyudante.add(ser);
    }


    @Override
    public String toString() {
        return super.toString()+"\n Servicios: "+mostrarServiAyudante(); //To change body of generated methods, choose Tools | Templates.
    }
  
   public String mostrarServiAyudante()
   {
       String retorno=new  String();
       for(IServicioCantidadYTipo ser: serviAyudante)
       {
           retorno+=ser.toString();
       }
       return retorno;
   }

    @Override
    public boolean transporte() {
    boolean retorno=false;
    for(IServicioCantidadYTipo ser: serviAyudante)
    {
      if(ser instanceof  Transporte)
      {
          retorno=true;
      }
    }
    return retorno;
    }
    @Override
    public boolean alojamiento() {
        boolean retorno=false;
        for(IServicioCantidadYTipo ser: serviAyudante){
        if(ser instanceof  Alojamiento)
      {
          retorno=true;
      }
        }return retorno;
    }
    
    

    @Override
    public boolean guia() {
   return  false;
    }
    // retorna la cantidad de elementos que tiene el arreglo de elementos en el arreglo de servicios
    public int cantDeServicios()
    {
        return  serviAyudante.size();
    }
    public  IServicioCantidadYTipo buscarServicioPorIdex(int i)
    {
        return  serviAyudante.get(i);
    }
    
    @Override
    public JSONObject getFormatoJSON() throws JSONException {
       JSONObject jsonAyudante= new JSONObject();
        
        try {
            jsonAyudante= super.getFormatoJSON();
            jsonAyudante.put("cantidad y tipo", serviAyudante);
        } catch (Exception e) {
            e.getMessage();
        }
        return  jsonAyudante;
    }
  
    public JSONArray pasarArregloServicioaJson()
    {
        JSONArray arraysServicio= new JSONArray();
        JSONObject objectServicio=new JSONObject();
        IServicioCantidadYTipo serCYT;
        for(int i=0; i<=serviAyudante.size(); i++)
        {
            serCYT=serviAyudante.get(i);
            objectServicio= serCYT.pasarIServicioCantidadYTipo();
            arraysServicio.put(objectServicio);
        }
        return arraysServicio;
    }
}


