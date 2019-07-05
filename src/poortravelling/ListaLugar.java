
package poortravelling;
import java.util.TreeSet;
import  java.util.Iterator;
import  org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public class ListaLugar {
   private TreeSet<Lugar> lugares;/// el tree set no permite duplicados por lo tal si ya existe un pais Argentina 
                          ///y el usuarie ingresa Argentina el dato se pisa, quedando un solo Argentina en el TreeSet
   public ListaLugar()
           
   {
       lugares= new TreeSet<>();
   }
    
    
    
    private boolean existeoNo(Lugar lugarr)
    {
        if(lugares.contains(lugarr))
        {
            return true;
        }
        else{
           return false;
        }
       
    }
    
    public void agregarLugar(Lugar lugar )
    {
        lugares.add(lugar);
        
    }

     public String lista()
     {
         String retorno= new String();
         for (Lugar l: lugares)
         {
            retorno+= lista().toString();
                   
         }
              return retorno; 
     }
      // pasaremos la coleccione de lugares que tenemos a un json array    
    public  JSONArray pasarAJson()throws  JSONException
    {
        JSONArray arregloJsonRetorno=new JSONArray();
        JSONObject objLugar=new JSONObject();
        Iterator<Lugar> ite= lugares.iterator();
        while(ite.hasNext())
        {
          objLugar= ite.next().getFormatoJsonLugar();
          arregloJsonRetorno.put(objLugar);
          
        }
        return  arregloJsonRetorno;
    }
    public JSONObject JsonlistaLugar() throws JSONException
    {
        JSONObject jsonListLugar= new JSONObject();
    
            jsonListLugar.put("lugares", pasarAJson());
        return  jsonListLugar;
    }

   
  
}

