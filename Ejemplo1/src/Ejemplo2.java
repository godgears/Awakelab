import java.util.Scanner;

public class Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] letras = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
				"S", "T", "U", "V", "W", "X", "Y", "Z" };
		String texto_final = "";

		int posicion = 0;

		try (Scanner reader = new Scanner(System.in)) {
			while (posicion != -1) {
				System.out.println("Introduce un numero");
				posicion = reader.nextInt();

				if (posicion >= 0 && posicion < letras.length) {
					texto_final += letras[posicion];
				} else {

				}

			}
		}

		System.out.println("El texto final es: " + texto_final);

	}

}
