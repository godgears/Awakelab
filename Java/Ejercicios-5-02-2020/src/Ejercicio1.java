import java.util.Scanner;

public class Ejercicio1 {
		
		 public static void main(String[] args) {
		        contar();
		    }
		 public static void contar() {
			Scanner escaner= new Scanner(System.in);
			System.out.println("Ingrese Palabra a buscar");
			String cadena=escaner.nextLine();
			String vocales="aeiou";
		    int contadorTotal=0;
		    // recorremos la cadena recibida letra a letra
		    for (int i=0;i<cadena.length();i++) {
		    // recorremos las vocales para comparar con cada una de las letras
		    	for (int j=0;j<vocales.length();j++) {
		    		if (cadena.charAt(i)==vocales.toLowerCase().charAt(j)) {
		    			contadorTotal++;   
		            }
		        }
		     }
		    escaner.close();
		     System.out.println("EL total de vocales es: "+ contadorTotal);   
		 }
}
