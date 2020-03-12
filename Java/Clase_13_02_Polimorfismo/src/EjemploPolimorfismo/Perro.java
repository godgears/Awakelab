package EjemploPolimorfismo;

public class Perro extends Animal{

	 private String nombre;
	 
	 public Perro(String especie, String nombre) {
		 super(especie); this.nombre = nombre;
	 }
	 
	 public void imprimir() {
		 super.imprimir();
		 System.out.println("Soy un perro que ladra");
	 }
	 
	 public String getNombre() {
		 return nombre;
	 }
	 
	 public void setNombre(String nombre) {
		 this.nombre = nombre;
	 }
	 
}
