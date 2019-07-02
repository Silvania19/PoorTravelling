
package poortravelling;
import java.util.TreeSet;

public class ListaLugar {
    TreeSet<Lugar> lugares;/// el tree set no permite duplicados por lo tal si ya existe un pais Argentina 
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
          
    
   
 
}

