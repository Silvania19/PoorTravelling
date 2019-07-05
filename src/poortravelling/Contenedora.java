
package poortravelling;
import  org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public class Contenedora {
    ///usaremos un arreglo para cada clase de usuario por que trabajaremos mas independinetes que que en conjuntos 
   private  ManejoUsuario<Viajante>usuarioviajantes;
    private ManejoUsuario<Ayudante> usuarioAyudantes;
    private ManejoUsuario<GuiaTurista> usuarioGuiasTuristas;
  
    public Contenedora()
    {
        usuarioviajantes=new ManejoUsuario<>();
        usuarioAyudantes=new ManejoUsuario<>();
        usuarioGuiasTuristas=new ManejoUsuario<>();

    }
    public void agreagarUsuarioViajante(Viajante vianjate1){
        ///viajantes.agregarUsuario(vianjate1., vianjate1);
    }
    public  void agregarUsuarioAyudante(Ayudante ayudante)
    {
        usuarioAyudantes.agregarUsuario(ayudante.verMiContraseña(), ayudante);
    }
    public void agregarUsuarioGuiaTurista(GuiaTurista guiaTurista)
    {
        usuarioGuiasTuristas.agregarUsuario(guiaTurista.verMiContraseña(), guiaTurista);
    }


    public JSONObject jsonContenedora()throws  JSONException
    {
        JSONObject jsonConteRetorno=new JSONObject();
        
             jsonConteRetorno.put("viajantes", usuarioviajantes.formatoJsonManejoUsuario());
             jsonConteRetorno.put("ayudantes", usuarioAyudantes.formatoJsonManejoUsuario());
             jsonConteRetorno.put("guias de turistas", usuarioGuiasTuristas.formatoJsonManejoUsuario());
        
       return  jsonConteRetorno;
        
    }
    //se buscara un viajante por un id, usando la funcion buscar x id de la generica, "manejo de usuario"
    public Viajante buscarViajantexId(Integer id)throws IdNoExisteExcepcion
    {
        Viajante viajante;
        viajante=usuarioviajantes.buscarXid(id);
        return viajante;
    }
    public Ayudante buscarAyudanteXid(Integer id)throws IdNoExisteExcepcion
    {
        Ayudante ayu;
        ayu=usuarioAyudantes.buscarXid(id);
        return ayu;
    }
    public String mostrarAyudantesXRangoDeEdad(int inferior, int superior)
    {
        String retorno=new String();
        retorno=usuarioAyudantes.mostrarPorRangoDeEdad(inferior, superior);
        return retorno ;
    }
    public String mostrarAyudantesXdestino(Lugar luga)
    {
        return usuarioAyudantes.mostrarPorDestino(luga);
    }
    public String mostrarViajanteXRangodeEdad(int inferior, int superior)
    {
        return usuarioviajantes.mostrarPorRangoDeEdad(inferior, superior);
    }
    public  String mostrarViajanteXdestino(Lugar lug)
    {
        return  usuarioviajantes.mostrarPorDestino(lug);
    }
    public String mostrarGuiaXrangoEdad(int inferior, int superior)
    {
        return usuarioGuiasTuristas.mostrarPorRangoDeEdad(inferior, superior);
    }
    public  String mostrarGuiaXdestino(Lugar lug)
    {
        return  usuarioGuiasTuristas.mostrarPorDestino(lug);
    }
    public GuiaTurista buscarGuiaXID(Integer id)throws IdNoExisteExcepcion
    {
        GuiaTurista guia;
        guia=usuarioGuiasTuristas.buscarXid(id);
        return guia;
    }
    public Viajante mostrarUnViajante(String contraseña)throws  ContraseñaNoExisteException
    {
        Viajante viaj=usuarioviajantes.mostrarUnUsuario(contraseña);
        return  viaj;
    }
    public Ayudante mostraUnAyudante(String contraseña)throws  ContraseñaNoExisteException
    {
        Ayudante ayu=usuarioAyudantes.mostrarUnUsuario(contraseña);
        return  ayu;
    }
    public  GuiaTurista mostrarUnGuia(String contraseña)throws ContraseñaNoExisteException
    {
        GuiaTurista guia=usuarioGuiasTuristas.mostrarUnUsuario(contraseña);
        return  guia;
    }

    
        }
