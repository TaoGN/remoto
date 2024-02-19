/**
 * 
 */
package app;

import leer.Leer;
import menu.Menu;

/**
 * @author Alejandro García
 *
 */
public class Aplicacion {


	public static void main(String[] args) {

		Menu.Mensaje_Inicial();

		boolean continuar = true;

		do {

			Menu.Opciones_Menu();

			switch (Leer.datoInt()) {
			case 1:

				break;
			case 2:
				

				break;
			case 3:

				break;
			default:
				// Se sale del programa
				continuar = false;
			}

		} while (continuar);

		Menu.Mensaje_Fin();

	}

	//Declaracion de métodos
	/**
	 * @param Método que llama a Mensaje_Fin que está alojado en el paquete menu y en la clase Menu.
	 */
	private static void Mensaje_Fin() {	
	}

	/**
	 * @param Método que llama a Opciones_Menu que está alojado en el paquete menu y en la clase Menu.
	 */
	private static void Opciones_Menu() {	
	}

	/**
	 * @param Método que llama a Mensaje_Inicial que está alojado en el paquete menu y en la clase Menu.
	 */
	private static void Mensaje_Inicial() {	
	}

}

