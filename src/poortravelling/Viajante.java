
package poortravelling;


public class Viajante extends Persona {
    private String TipoDeServicio;
    private String FechaDelServicio;
    
    public Viajante()
    {
        super();
        setTipoDeServicio(" ");
        setFechaDelServicio(" ");
        
    }

    
    public Viajante(String nombre, String apellido, String nroTelefono, Integer edad, String contraseña,String TipoDeServicio, String FechaDelServicio) {
         super(nombre, apellido, nroTelefono,edad,contraseña);
        setTipoDeServicio(TipoDeServicio);
        setFechaDelServicio(FechaDelServicio);
    }
      public Viajante(Viajante V1 ) {
       
         super(V1.getNombre(),V1.getApellido(),V1.getNroTelefono(),V1.getEdad(),V1.getContraseña());
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