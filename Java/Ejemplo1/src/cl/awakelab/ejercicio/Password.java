/**
 * 
 */
package cl.awakelab.ejercicio;

import java.util.Random;

/**
 * @author Alumno
 *
 */
public class Password {

	private int longitud;
	private String clave;
	
	public Password() {
		// TODO Auto-generated constructor stub
		setLongitud(8);
	}

	public Password(int longitud) {
		// TODO Auto-generated constructor stub
		this.setLongitud(longitud);
		this.clave = generarPassword(longitud);

	}

	public String generarPassword(int longitud) {
		String clave_nueva = "";
		String pass;
		
		char[] elementos = {'0','1','2','3','4','5','6','7','8','9','0','1','2','3','4','5','6','7','8','9' ,'a',
				'b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t',
				'u','v','w','x','y','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T',
				'U','V','W','X','Y','Z'};
		
		char[] conjunto = new char[longitud];
		
		for(int i=0;i<longitud;i++){
			Random rand = new Random(); //instance of random class
			int int_random = rand.nextInt(elementos.length); 
			char x = elementos[int_random];
			
			clave_nueva += x;
		}
				
		return clave_nueva;
		
	} 
	
	boolean esFuerte(String pass) {
		int cantidad_mayusculas = 0;
		int cantidad_minusculas = 0;
		int cantidad_numeros = 0;
		
		for (int i=0; i<pass.length(); i++) {
			char car = pass.charAt(i);
			
			if(Character.isLetter(car) && Character.isUpperCase(car))
				cantidad_mayusculas++;
			
			if(Character.isLetter(car) && Character.isLowerCase(car))
				cantidad_minusculas++;
			
			if(Character.isDigit(car))
				cantidad_numeros++;
		}
			
		if (cantidad_mayusculas <= 2) {
			return false;
		}

		if (cantidad_minusculas <= 1) {
			return false;
		}
			
		
		if (cantidad_numeros <= 5) {
			return false;
		}
			
		return true; 
	}

	/**
	 * @return the longitud
	 */
	public int getLongitud() {
		return longitud;
	}

	/**
	 * @param longitud the longitud to set
	 */
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	/**
	 * @return clave
	 */
	public String getClave() {
		return clave;
	}
	/**
	 * @param longitud clave
	 */
	
	public void setClave(String clave) {
		this.clave=clave;
	}

}
