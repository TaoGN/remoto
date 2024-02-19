/**
 * 
 */
package menu;


/**
 * @author Alejandro García
 *
 */
public class Menu {
/**
 * Muestra el mensaje inicial de bienvenida a la tienda virtual.
 */
	public static void Mensaje_Inicial() {

		System.out.println("Bienvenido a la tienda virtual\n\n"
				+ "El programa simula una tienda que vende juegos, música y cine\n"
				+ "Solamente se pueden vender productos si aparecen disponibles en la tienda\n"
		);
	}
	
/**
 * Muestra las diferentes opciones a seleccionar en nuestro menú.
 */
	public static void Opciones_Menu() {

		System.out.println("\nSeleccione que desea realizar:\n\n" + "\t1. Mostrar productos. (Listar productos)\n"
				+ "\t2. Comprar productos\n" + "\t3. Mostrar caja. (Importe total de la compra actual)\n"
				+ "\tSALIR --> Pulse cualquier otro número\n");
	}

	/**
	 * Muestra el mensaje final al terminar de usar la aplicación.
	 */
	public static void Mensaje_Fin() {

		System.out.println("---- Gracias por usar este software. ----");
	}

	
}
