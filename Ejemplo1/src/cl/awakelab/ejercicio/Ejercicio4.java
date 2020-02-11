package cl.awakelab.ejercicio;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String texto = "casa blanca";
		int largo_texto = texto.length();
		
		System.out.println("El largo del texto es: " + largo_texto);
		
		int indice = 3;
		char car =  texto.charAt(indice);
		
		System.out.println("El carácter en la posición " + indice + " es: " + car);
		
		int indice1 = 2;
		String texto_cortado = texto.substring(indice);
		System.out.println("El texto cortado 1 es: " + texto_cortado);
		
		
		int indice2 = 3;
		int indice3 = 8;
		String texto_cortado2 = texto.substring(indice2, indice3);
		
		System.out.println("El texto cortado 2 es: " + texto_cortado2);
		
		String texto_concatenado = texto_cortado + texto_cortado2;
		System.out.println("La cadena concatenada es: " + texto_concatenado);
		
		System.out.println("Talentos y talentos : " + ("Talentos".equals("talentos") ? "Son iguales" : "No son iguales"));
		System.out.println("TalenTOS y talentos : " + ("TalenTOS".equals("talentos") ? "Son iguales" : "No son iguales"));
		System.out.println("talentos y talentos : " + ("talentos".equals("talentos") ? "Son iguales" : "No son iguales"));
		
		System.out.println("El texto en minuscula es : " + texto_concatenado.toLowerCase());
		System.out.println("El texto en mayuscula es: " + texto_concatenado.toUpperCase());
	
		
	}

}
