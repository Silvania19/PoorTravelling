
package poortravelling;

import java.util.TreeMap;
import  java.util.Iterator;
import java.util.Map;

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
        StringBuilder contraseña=new StringBuilder();
        for(Map.Entry<String, t>usuario: coleccionUsuario.entrySet())
        {
            if(usuario.getValue().getLugar().equals(destino))
            {
                retorno.append(usuario.getValue().toString());
            }
        }
        return retorno;
    }
  
}
