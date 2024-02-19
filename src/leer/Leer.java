/**
 * 
 */
package leer;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * @author Alejandro García
 *
 */
public class Leer {

	public static String dato() {
		String sdato = " ";
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader flujoE = new BufferedReader(isr);
			sdato = flujoE.readLine();
		} catch (IOException e) {
			System.out.println("Error " + e.getMessage());
		}
		return sdato;

	}
	/**
	 * 
	 * @return Retorna como resultado un valor entero
	 */
	public static int datoInt() {
	// Este método toma una cadena como entrada y la convierte a un valor entero, que luego retorna como resultado.
		return Integer.parseInt(dato());
	}
	/**
	 * 
	 * @return Retorna como resultado un número float
	 */
	public static float datoFloat() {
	// Este método toma una cadena como entrada y la convierte a un número de tipo float, que luego retorna como resultado.
		return Float.parseFloat(dato());
	}

	// Leer un char por teclado

	public static char datoChar() {
		char c = ' ';
		try {
			java.io.BufferedInputStream b = new BufferedInputStream(System.in);
			c = (char) b.read();
		} catch (IOException e) {
			System.out.println("Error al leer");
			e.printStackTrace();
		}
		return c;
	}
	/**
	 * 
	 * @return Retorna como resultado un número long
	 */
	public static long datoLong() {
	// Este método toma una cadena como entrada y la convierte a un número de tipo long, que luego retorna como resultado.
		return Long.parseLong(dato());
	}
}
