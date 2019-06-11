package poortravelling;

public class Alojamiento extends ServicioAyudante {

    private String tipoAlojamiento;

    public Alojamiento() {
        super();
        setTipo("");

    }

    public Alojamiento(String tipoAlojamiento, Integer disponibilidadCantidad, float precio, String disponibilidadTiempo) {
        super(disponibilidadCantidad, precio, disponibilidadTiempo);
        setTipo(tipoAlojamiento);
    }
    

    @Override
    public void setTipo(String tipo) {
        tipoAlojamiento=tipo;
        
    }

    @Override
    public String getTipo() {
    return tipoAlojamiento;
    }

}
