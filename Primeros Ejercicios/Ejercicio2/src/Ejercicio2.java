import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		char[] alfabeto= {'A','B','C','D','E','F','G','H','I',
			'J','K','L','M','N','Ñ','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		String final_text="";
		int pos=0;
		try (Scanner numero = new Scanner(System.in)) {
			while (pos!=-1) {
				System.out.println("Introduzca su numero de 0-26 y -1 para finalizar");
				pos=numero.nextInt();
				if (pos>=0&&pos<alfabeto.length) {
					final_text+=alfabeto[pos];
				}
			}
			System.out.println("El resultado final es: "+final_text);
		}
	}
}
