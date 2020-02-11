import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main m = new Main();	
		int lista_numeros[] = m.solicitarNumero();
		m.mostrarDatos(lista_numeros);
		
	}
	
	
	public int[] solicitarNumero() {
		
		int lista_numeros[] = new int[14];

		try (Scanner reader = new Scanner(System.in)) {
			int numero = 0;
			
			for (int i=0; i<lista_numeros.length; i++) {	
				System.out.println("Introduce un número");			
				numero = reader.nextInt();
				lista_numeros[i] = numero;
			}
		}
		
		return lista_numeros;
	}
	
	public void mostrarDatos (int[] mi_lista) {
		System.out.println("Numeros introducidos...");	
		for (int i=0; i<mi_lista.length; i++) {	
			System.out.println("Indice: " + i + " Valor: " + mi_lista[i]);				
		}
	}

}
