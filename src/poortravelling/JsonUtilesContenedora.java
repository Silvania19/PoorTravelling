
package poortravelling;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class JsonUtilesContenedora {
   public  void grabarContenedora(JSONObject obj)
   {
       try {
           FileWriter file= new FileWriter("C:\\Users\\silva\\Documents\\NetBeansProjects\\PoorTravelling\\ArchivoContenedora");
           file.write(obj.toString());
           file.flush();
           file.close();
       } catch (Exception e) {
           e.printStackTrace();
       }
   }
   /// leer el archivo que tenemos guardado de personas
   public  String leerArchivoContenedora()
   {
       String contenido="";
       try
   {
       contenido= new String(Files.readAllBytes(Paths.get("C:\\Users\\silva\\Documents\\NetBeansProjects\\PoorTravelling\\ArchivoContenedora")));
   }
       catch (IOException e)
       {
           e.printStackTrace();
       }
       return contenido;
   }
   public  JSONObject pasarArchivoContenedoraAJson(String contenido)throws JSONException
   {
       JSONObject jsonContenedora=new JSONObject(contenido);
       return jsonContenedora;
   }
     public Contenedora leer() 
   {
       Contenedora cont= new Contenedora();
       int i=0;
       try {
           String aux= new String(Files.readAllBytes(Paths.get("C:\\Users\\silva\\Documents\\NetBeansProjects\\PoorTravelling\\ArchivoContenedora")));
           JSONObject jo= new JSONObject(aux);
           for(i=0; i<jo.getJSONArray("ayudantes").getJSONArray(0).length();i++)
           {
                Ayudante a=new Ayudante();
               /// a.setNombre(jo.getJSONObject("ayudantes").getJSONArray().getString("nombre"));
                a.setApellido(jo.getJSONArray("ayudantes").getJSONArray(0).getJSONObject(i).getString("apellido"));
                a.setNroTelefono(jo.getJSONArray("ayudantes").getJSONArray(0).getJSONObject(i).getString("nro de telefono"));
                a.setContraseña(jo.getJSONArray("ayudantes").getJSONArray(0).getJSONObject(i).getString("contraseña"));
                a.setId(jo.getJSONArray("ayudantes").getJSONArray(0).getJSONObject(i).getInt("id"));
                a.setEdad(jo.getJSONArray("ayudantes").getJSONArray(0).getJSONObject(i).getInt("edad"));
                                             
                      cont.agregarUsuarioAyudante(a);
           }
        i=0;
        for(i=0; i<jo.getJSONArray("viajantes").getJSONArray(0).length();i++)
        {
            Viajante v= new Viajante();
            v.setNombre(jo.getJSONArray("viajantes").getJSONArray(0).getJSONObject(i).getString("nombre"));
            v.setApellido(jo.getJSONArray("viajantes").getJSONArray(0).getJSONObject(i).getString("apellido"));
            v.setNroTelefono(jo.getJSONArray("viajantes").getJSONArray(0).getJSONObject(i).getString("nro de telefono"));
            v.setContraseña(jo.getJSONArray("viajantes").getJSONArray(0).getJSONObject(i).getString("contraseña"));
            v.setId(jo.getJSONArray("viajantes").getJSONArray(0).getJSONObject(i).getInt("id"));
            v.setEdad(jo.getJSONArray("viajantes").getJSONArray(0).getJSONObject(i).getInt("edad"));
            cont.agreagarUsuarioViajante(v);
        }
        i=0;
        for(i=0;i<jo.getJSONArray("guias").getJSONArray(0).length();i++)
        {
            GuiaTurista g= new GuiaTurista();
            g.setNombre(jo.getJSONArray("guias").getJSONArray(0).getJSONObject(i).getString("nombre"));
            g.setApellido(jo.getJSONArray("guias").getJSONArray(0).getJSONObject(i).getString("apellido"));
            g.setNroTelefono(jo.getJSONArray("guias").getJSONArray(0).getJSONObject(i).getString("nro de telefono"));
            g.setContraseña(jo.getJSONArray("guias").getJSONArray(0).getJSONObject(i).getString("contraseña"));
            g.setId(jo.getJSONArray("guias").getJSONArray(0).getJSONObject(i).getInt("id"));
            g.setEdad(jo.getJSONArray("guias").getJSONArray(0).getJSONObject(i).getInt("edad"));
            cont.agregarUsuarioGuiaTurista(g);
        }
           
         
        
       } catch (JSONException e) {
           e.getMessage();
       }catch(IOException e)
       {
           e.getMessage();
       }
       return  cont;
   }
   
    
}
