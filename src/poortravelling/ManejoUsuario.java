
package poortravelling;

import java.util.TreeMap;
import  java.util.Iterator;
import java.util.Map;
import  org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONException;

public class ManejoUsuario <t extends Persona>{
    TreeMap<String, t> coleccionUsuario;
    
  public ManejoUsuario()
  {
      coleccionUsuario=new TreeMap<>();
  }
  ///despues poner booleam para que retorne true si es que agrego el usuario
  public void  agregarUsuario(String contraseña, t usuario){
      coleccionUsuario.put(contraseña, usuario);
  }
  public boolean existeUsuario(String contraseña)
          
  {
      return coleccionUsuario.containsKey(contraseña);
  }
  public void eliminar(String contraseña)throws ContraseñaNoExisteException
  {
      if(existeUsuario(contraseña))
      {
      coleccionUsuario.remove(contraseña);
      }
      else {
          throw new ContraseñaNoExisteException("LA CONTRASEÑA NO EXISTE");
      }
     
      
  }
  //para mostrar la informacion del usuario que este usando la app
  public t mostrarUnUsuario(String contraseña)throws ContraseñaNoExisteException
  { 
      t retorno;
     if(existeUsuario(contraseña))
     {
      retorno= coleccionUsuario.get(contraseña);
     }
     else{
         throw new ContraseñaNoExisteException("la contraseña no existe");
     }
     return retorno;
     
  }
 
    public StringBuilder mostrarPorRangoDeEdad(int inferior, int superior)
    {
     StringBuilder retorno =new StringBuilder();
    
    
            for(Map.Entry< String, t>usuario: coleccionUsuario.entrySet())
            {
            if(usuario.getValue().getEdad()>=inferior && usuario.getValue().getEdad()<=superior)
            {
                retorno.append(usuario.getValue().toString());
            }

       }
            return retorno;
    }
    public StringBuilder mostrarPorDestino(Lugar destino)
    {
        StringBuilder retorno=new StringBuilder();
        for(Map.Entry<String, t>usuario: coleccionUsuario.entrySet())
        {
            if(usuario.getValue().getLugar().equals(destino))
            {
                retorno.append(usuario.getValue().toString());
            }
        }
        return retorno;
    }
    // se tranformara la coleccion generica qe tenemos pero que a su vez es una coleccion de alguna clase de que herede de persona
    //en un jsonArray
    public JSONArray formatoJsonManejoUsuario()throws  JSONException
    {
        JSONArray arregloDePersonaRetorno=new  JSONArray();
        JSONObject objPersona=new JSONObject();
            for(Map.Entry<String, t>usuario: coleccionUsuario.entrySet())
              {
                   objPersona=usuario.getValue().getFormatoJSON();
                   arregloDePersonaRetorno.put(objPersona);
            
        }
         return arregloDePersonaRetorno;
    }
  /*  public StringBuilder mostrarPorTipoDeServicio(int tipoServicio)
    {
        StringBuilder retorno=new StringBuilder();
        for(Map.Entry<String, t>usuario: coleccionUsuario.entrySet())
        {
            if(tipoServicio==1)
            {
                if(usuario.getValue().)
            }
        }
        
    }*/
    
  
}
