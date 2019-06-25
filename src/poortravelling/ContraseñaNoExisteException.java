
package poortravelling;


public class ContraseñaNoExisteException extends Exception{
    public final long serialVersionUID=700L;
    public ContraseñaNoExisteException()
    {
        
    }
    public  ContraseñaNoExisteException(String mensaje)
    {
        super(mensaje);
    }
    
}
