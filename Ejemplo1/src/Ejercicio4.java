/*
 * Clase para detectar cuantas veces se repite un car�cter en una cadena de texto.
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		
		String cad = "casa BLANCA"; // Texto donde buscaremos el car�cter repetido 
		char car = 'A'; // Car�cter que buscaremos en la cadena cad
		int cont = 0; // Cantidad que se repite el car�cter		//cad.toLowerCase();	
		
		/*
		 * Recorremos la cadena seg�n el largo.
		 * En la variable letra capturamos el car�cter seg�n su posici�n
		 * Comparamos la variable letra con la variable car para contar si estas son iguales
		 */
		for(int i=0; i<cad.length(); i++) {
			char letra = cad.charAt(i); 
			if(letra == car) {
				cont++;
			}
			
		}
		
		// Mostramos el mensaje al usuario
		System.out.println("El car�cter " + car + " se repite " + cont + " veces");
		
	}

}
