
package poortravelling;
/**
 * Clase para el manejo de errores en Precios
 *@author Silvania-Florencia-Marcos
 */
public class PrecioIncorrectoException extends Exception {
/**
 * Constructor vacio
 */
    public PrecioIncorrectoException() {
    }
/**
 * Constructor con msj
 * @param msg 
 */
    public PrecioIncorrectoException(String msg) {
        super(msg);
    }
}
