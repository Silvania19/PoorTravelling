
package poortravelling;
/**
 * Clase de Excepcion para la validacion de contraseña
 * @author Silvania-Florencia-Marcos
 */
public class ContraseñaInvalidaException extends Exception {

   /**
    * Contructor vacio
    */
    public ContraseñaInvalidaException() {
    }
    /**
     * Contructor que recibe el msj que quiere mostrar
     * @param msg 
     */
    public ContraseñaInvalidaException(String msg) {
        super(msg);
    }
}
