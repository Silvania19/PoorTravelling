
package poortravelling;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class JsonUtiles {
   public static void grabar(JSONObject obj)
   {
       try {
           FileWriter file= new FileWriter("persona.json");
           file.write(obj.toString());
           file.flush();
           file.close();
       } catch (Exception e) {
           e.printStackTrace();
       }
   }
   /// leer el archivo que tenemos guardado de personas
   public static String leerArchivo()
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
   public static  JSONObject pasarArchivoAJson(String contenido)throws JSONException
   {
       JSONObject jsonContenedora=new JSONObject(contenido);
       return jsonContenedora;
   }
    
   
    
}
