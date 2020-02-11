import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
			//Scanner lee datos ingresados por consola
			Scanner entra = new Scanner(System.in);
			int numero=0;
			//Ingresamos los valores de 0 a 255 de los valores ASCII
			System.out.println("ingresa un numero de 0 al 255");
			//Asignamos nuestro valor de entrada en un int
			numero=entra.nextInt();
			//Convertimos de un numero int a char
			char c=(char)numero;
			System.out.println("Valor ascci "+c);
	}
}//Fin llave Clase
