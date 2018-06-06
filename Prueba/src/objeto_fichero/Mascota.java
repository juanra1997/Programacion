/**
 * Javier Abellán. 20 Marzo 2006
 * Clase de datos de ejemplo para meter en el fichero.
 */
package objeto_fichero;

import java.io.Serializable;

/**
 * Clase que contiene el nombre de la mascota y el número de patas.
 * @author Javier Abellán
 *
 */
public class Mascota implements Serializable
{

	private static final long serialVersionUID = 1L;
	public String nombre;
    public int numeroPatas;
}
