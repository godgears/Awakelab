
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// char c;
		int posicion = 0;

		try (Scanner reader = new Scanner(System.in)) {
			System.out.println("Introduce un numero");
			posicion = reader.nextInt();

			//char c = (char) posicion;
			System.out.println("El texto final es: " + (char) posicion);
		}

		

	}

}
