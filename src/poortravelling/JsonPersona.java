
package poortravelling;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


import org.json.JSONArray;
import org.json.JSONException;


public class JsonPersona {
   public static void grabar(JSONArray array)
   {
       try {
           FileWriter file= new FileWriter("persona.json");
           file.write(array.toString());
           file.flush();
           file.close();
       } catch (Exception e) {
           e.printStackTrace();
       }
   }
   
   public static String leer()
   {
       String contenido="";
       try
   {
       contenido= new String(Files.readAllBytes(Paths.get("persona.json")));
   }
       catch (IOException e)
       {
           e.printStackTrace();
       }
       return contenido;
   }
   
    
}
