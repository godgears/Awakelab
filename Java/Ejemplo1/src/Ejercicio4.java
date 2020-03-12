/*
 * Clase para detectar cuantas veces se repite un carácter en una cadena de texto.
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		
		String cad = "casa BLANCA"; // Texto donde buscaremos el carácter repetido 
		char car = 'A'; // Carácter que buscaremos en la cadena cad
		int cont = 0; // Cantidad que se repite el carácter		//cad.toLowerCase();	
		
		/*
		 * Recorremos la cadena según el largo.
		 * En la variable letra capturamos el carácter según su posición
		 * Comparamos la variable letra con la variable car para contar si estas son iguales
		 */
		for(int i=0; i<cad.length(); i++) {
			char letra = cad.charAt(i); 
			if(letra == car) {
				cont++;
			}
			
		}
		
		// Mostramos el mensaje al usuario
		System.out.println("El carácter " + car + " se repite " + cont + " veces");
		
	}

}
