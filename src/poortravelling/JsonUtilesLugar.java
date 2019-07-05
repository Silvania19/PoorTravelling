
package poortravelling;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;

public class JsonUtilesLugar {
     public static void grabar(JSONObject obj)
   {
       try {
           FileWriter file= new FileWriter("C:\\Users\\silva\\Documents\\NetBeansProjects\\PoorTravelling\\ArchivoLugar");
           file.write(obj.toString());
           file.flush();
           file.close();
       } catch (Exception e) {
           e.printStackTrace();
       }
       
   }
    public ListaLugar leer()
    {
        ListaLugar lista= new ListaLugar();
        int i=0;
        try {
            String aux= new String(Files.readAllBytes(Paths.get("C:\\Users\\silva\\Documents\\NetBeansProjects\\PoorTravelling\\ArchivoLugar")));
            JSONObject lugar= new JSONObject(aux);
            
            lugar.getJSONArray("lugares").getJSONArray(0);
            for(i=0;i<lugar.getJSONArray("lugares").getJSONArray(0).length();i++)
            {
                Lugar l=new Lugar();
                l.setPais(lugar.getJSONArray("lugares").getJSONArray(0).getJSONObject(i).getString("pais"));
               l.setPais(lugar.getJSONArray("lugares").getJSONArray(0).getJSONObject(i).getString("ciudad"));
            l.setPais(lugar.getJSONArray("lugares").getJSONArray(0).getJSONObject(i).getString("localidad"));
            lista.agregarLugar(l);
            }
        } catch (JSONException e) {
            e.getMessage();
        }catch(IOException e)
        {
            e.getMessage();
        }
        return lista;
                
    }
}

