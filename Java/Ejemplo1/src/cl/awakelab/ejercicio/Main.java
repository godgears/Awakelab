/**
 * 
 */
package cl.awakelab.ejercicio;
import java.util.Scanner;

import cl.awakelab.ejercicio.Password;

/**
 * @author Alumno
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Password[] passwords;
		boolean[] clave_fuerte;
		
		int cantidad_passwords = 0;
		int longitud_password = 0;
		
		try (Scanner reader = new Scanner(System.in)) {		
			System.out.println("Introduzca la cantidad de contraseñas a generar.");
			cantidad_passwords = reader.nextInt();
			passwords = new Password[cantidad_passwords];
			clave_fuerte = new boolean[cantidad_passwords];
			
			System.out.println("Introduzca la longitud de la contraseña");
			longitud_password = reader.nextInt();
		}
		
		for (int i=0; i<passwords.length; i++) {
			Password pass = new Password(longitud_password);
			passwords[i] = pass;
			
			String passw = pass.generarPassword(longitud_password);
			clave_fuerte[i] = pass.esFuerte(passw);
			System.out.println(passw + (clave_fuerte[i] ? " Es Fuerte" : " No es fuerte"));
		}	
	}
}
