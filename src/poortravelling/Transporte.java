
package poortravelling;

public class Transporte extends ServicioAyudante implements ServicioCantidadYTipo{
    
  
  private String tipoTransporte;
public Transporte()
{
    super();
    setTipo("");
}

  

    @Override
    public void setTipo(String tipo) {
        tipoTransporte=tipo;
    }

   

  
    @Override
    public String getTipo() {
     return  tipoTransporte;
    }

   


   
    
    

   
}
