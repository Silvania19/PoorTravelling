
package poortravelling;

public class Contenedora {
    ///usaremos un arreglo para cada clase de usuario por que trabajaremos mas independinetes que que en conjuntos 
    ManejoUsuario<Viajante>viajantes;
    ManejoUsuario<Ayudante> ayudantes;
    ManejoUsuario<GuiaTurista> guiasTuristas;
    public Contenedora()
    {
        viajantes=new ManejoUsuario<>();
        ayudantes=new ManejoUsuario<>();
        guiasTuristas=new ManejoUsuario<>();
    }
    public void agreagarViajante(Viajante vianjate1){
        ///viajantes.agregarUsuario(vianjate1., vianjate1);
    }
    public  void agregarAyudante(Ayudante ayudante)
    {
        ayudantes.agregarUsuario(ayudante.getContraseña(), ayudante);
    }
    public void agregarGuiaTurista(GuiaTurista guiaTurista)
    {
        guiasTuristas.agregarUsuario(guiaTurista.getContraseña(), guiaTurista);
    }
}
