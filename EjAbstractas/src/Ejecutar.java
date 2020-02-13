import java.util.Scanner;

public class Ejecutar {
	
	public static void main(String[] args) {
		
		Scanner escaner=new Scanner(System.in);
		
		Circulo circulo1= new Circulo(1, 2, 3);
		
		System.out.println(circulo1.area());
		
		escaner.close();
	}

}
