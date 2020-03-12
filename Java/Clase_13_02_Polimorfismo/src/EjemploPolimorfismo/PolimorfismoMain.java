package EjemploPolimorfismo;

public class PolimorfismoMain {

	public static void main(String[] args) {
		
		Animal Scooby;
		Animal Tom;
		Scooby = new Perro("Perro", "Scooby");
		Tom = new Gato ("Gato", "Tom");
		
		Scooby.imprimir();
		Tom.imprimir();

	}

}
