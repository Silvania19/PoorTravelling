
package poortravelling;

import java.util.TreeMap;
public class ManejoUsuario <t>{
    TreeMap<String, t> coleccionUsuario;
  public ManejoUsuario()
  {
      coleccionUsuario=new TreeMap<>();
  }
  ///despues poner booleam para que retorne true si es que agrego el usuario
  public void  agregarUsuario(String contraseña, t usuario){
      coleccionUsuario.put(contraseña, usuario);
  }
  public void eliminar(String contraseña)
  {
      
      coleccionUsuario.remove(contraseña);
     
      
  }
  
  
}
