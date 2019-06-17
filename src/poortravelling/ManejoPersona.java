
package poortravelling;

 import java.util.HashSet;
public class ManejoPersona {
    HashSet<Persona> arregloDePersonas;
    public  ManejoPersona ()
    {
        arregloDePersonas=new HashSet<>();
    }
    public void agregar(Persona per)
    {
        arregloDePersonas.add(per);
    }
    public StringBuilder mostrarPorRangoEdad(int inferior, int superior)
    {
        StringBuilder retorno=new StringBuilder();
       for(Persona pe : arregloDePersonas)
       {
           if(pe.getEdad()<=superior && pe.getEdad()>=inferior)
           {
               retorno.append(pe.toString());
           }
       }
       return  retorno;
    }
    public StringBuilder mostrarPorDestino(Lugar destino)
    {
        StringBuilder retorno=new StringBuilder();
        for (Persona per: arregloDePersonas)
        {
            if(destino.equals(per.getLugar()))
            {
                retorno.append(per.getLugar().toString());
            }
        }
        return retorno;
    }
   
}
