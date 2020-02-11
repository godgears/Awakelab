
public class Ejercicio2 {
	public static void main(String[] args) {
		
		String sCadena = "Casa Blanca";
		String sCadenaInvertida="";
		
		for (int x=sCadena.length()-1;x>=0;x--) {
			sCadenaInvertida = sCadenaInvertida + sCadena.charAt(x);
		}
		System.out.println(sCadenaInvertida);
	}
}