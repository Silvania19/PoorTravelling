
package poortravelling;


public abstract  class Viajante extends  Persona{
 private String TipoDeServicio;
    private String FechaDelServicio;
    
    public Viajante()
    {
        super();
        setTipoDeServicio(" ");
        setFechaDelServicio(" ");
        
    }

    
    public Viajante(String nombre, String apellido, String nroTelefono, Integer edad, String contraseña, Integer id ,String TipoDeServicio, String FechaDelServicio) {
         super(nombre, apellido, nroTelefono,edad,contraseña, id);
        setTipoDeServicio(TipoDeServicio);
        setFechaDelServicio(FechaDelServicio);
    }
      public Viajante(Viajante V1 ) {
       
        super(V1);
        setTipoDeServicio(V1.getTipoDeServicio());
        setFechaDelServicio(V1.getFechaDelServicio());
    }
   
    private String getTipoDeServicio() {
        return TipoDeServicio;
    }

    private void setTipoDeServicio(String TipoDeServicio) {
        this.TipoDeServicio = TipoDeServicio;
    }

    private String getFechaDelServicio() {
        return FechaDelServicio;
    }

    private void setFechaDelServicio(String FechaDelServicio) {
        this.FechaDelServicio = FechaDelServicio;
    }

    public String ToString() {
        return super.toString() + "\n  TipoDeServicio:" + getTipoDeServicio() + "\n  FechaDelServicio:" + getFechaDelServicio();
    }

    @Override
    public void agregarLugarDestino(String pais, String ciudad, String localidad) {
        modificarLugar(pais, ciudad, localidad);
    }
       
  
}
