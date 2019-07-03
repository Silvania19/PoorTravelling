
package poortravelling;
import  org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public class Contenedora {
    ///usaremos un arreglo para cada clase de usuario por que trabajaremos mas independinetes que que en conjuntos 
    ManejoUsuario<Viajante>usuarioviajantes;
    ManejoUsuario<Ayudante> usuarioAyudantes;
    ManejoUsuario<GuiaTurista> usuarioGuiasTuristas;
  
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
        usuarioAyudantes.agregarUsuario(ayudante.getContraseña(), ayudante);
    }
    public void agregarUsuarioGuiaTurista(GuiaTurista guiaTurista)
    {
        usuarioGuiasTuristas.agregarUsuario(guiaTurista.getContraseña(), guiaTurista);
    }


    public JSONObject formatoJsonContenedora()
    {
        JSONObject jsonConteRetorno=new JSONObject();
        
        
    }
    //1=tranporte, 2=alojamiento
    public StringBuilder buscarAyudanteXTipoServicio(int tipo)
    {
        StringBuilder retorno= new StringBuilder();
        
    }
}
