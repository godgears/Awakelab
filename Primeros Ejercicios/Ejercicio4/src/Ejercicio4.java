import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		int pos=0;
		try (Scanner numero = new Scanner(System.in)) {
			while (pos!=-1) {
				System.out.println("Introduzca un numero mayor a 0");
				pos=numero.nextInt();
					if (pos>=0) {
					System.out.println("el numero es mayor o igual que 0: "+pos);
					}
					else
					{
					System.out.println("El numero es menor que 0");
					}
			}//fin llave while
		}//fin llave try
	}//Fin Llave main
} //Fin Llave principal
