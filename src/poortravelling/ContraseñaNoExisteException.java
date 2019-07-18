
package poortravelling;

/**
  * Clase de Excepcion para la validacion de contraseña
 * @author Silvania-Florencia-Marcos
 */
public class ContraseñaNoExisteException extends Exception{
    public final long serialVersionUID=700L;
    /**
     * Constructor vacio
     */
    public ContraseñaNoExisteException()
    {
        
    }
    /**
     * Constructor que recibe msj a mostrar
     * @param mensaje 
     */
    public  ContraseñaNoExisteException(String mensaje)
    {
        super(mensaje);
    }
    
}
