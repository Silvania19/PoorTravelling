
package poortravelling;

public class Contenedora {
    ///usaremos un arreglo para cada clase de usuario por que trabajaremos mas independinetes que que en conjuntos 
    ManejoUsuario<Viajante>Usuarioviajantes;
    ManejoUsuario<Ayudante> usuarioAyudantes;
    ManejoUsuario<GuiaTurista> usuarioGuiasTuristas;
    ManejoPersona personaViajante;
    ManejoPersona personaAyudante;
    ManejoPersona  personaGuia;
    public Contenedora()
    {
        Usuarioviajantes=new ManejoUsuario<>();
        usuarioAyudantes=new ManejoUsuario<>();
        usuarioGuiasTuristas=new ManejoUsuario<>();
        personaAyudante=new  ManejoPersona();
        personaViajante=new ManejoPersona();
        personaGuia=new ManejoPersona();
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
    public void agregarPersonaViajante(Viajante viajante1)
    {
        
    }
    public void agregarPersonaAyudante(Ayudante ayudante)
    {
        personaAyudante.agregar(ayudante);
    }
    public  void agregarPersonaGuia(GuiaTurista guia)
    {
        personaGuia.agregar(guia);
    }
    //1=tranporte, 2=alojamiento
    public StringBuilder buscarAyudanteXTipoServicio(int tipo)
    {
        StringBuilder retorno= new StringBuilder();
        if(tipo==1)
        {
            for(personaAyudante.)
        }
    }
}
