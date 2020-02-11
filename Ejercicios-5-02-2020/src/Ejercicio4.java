import java.util.Scanner;
public class Ejercicio4 {
	static String cadena;
	static int largo;
	public static void main(String[] args) {
		
		Scanner escaner= new Scanner(System.in);
		System.out.println("======================================");
		System.out.println("Devolver el valor total de la cadena");
		System.out.println("Ingrese un indice y se le da el caracter");
		System.out.println("Corte la cadena desde un indice");
		System.out.println("Corte la cadena desde dos indices");
		System.out.println("Cadena Concatenada");
		System.out.println("Ingrese Caracter y se le devuelve el indice");
		System.out.println("Comprobar igualdad de cadenas");
		System.out.println("Cadena en Mayuscula");
		System.out.println("Cadena en Minuscula");
		System.out.println("======================================");
		System.out.println("Ingrese Una Opcion");
		int menu = escaner.nextInt();
		do {
			switch (menu) {
			case 1:
				pedirCadena();
				contarCadena();
				break;
			case 2:
				pedirCadena();
			
				//cortarIndiceU(corte);
				break;
			case 3:
				pedirCadena();
				cortarDosIndices();
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				break;
			case 9:
				break;
			case 10:
				break;
			}
			
		} while (menu==0);
		escaner.close();
		
	}
	
	public static void pedirCadena()
	{
		Scanner leer=new Scanner(System.in);
		System.out.println("Ingrese Cadena");
		cadena=leer.nextLine();
		leer.close();
	}
	public static void contarCadena()
	{
		Scanner leer=new Scanner(System.in);
		System.out.println("Ingrese Cadena");
		cadena=leer.nextLine();
		leer.close();
		System.out.println("============");
		System.out.println("El total es: "+cadena.length());
	}
	public static void cortarIndiceU(int indice)
	{
	
		String a=cadena.substring(indice);
		System.out.println("2 Indices: "+a);
	}
	
	public static void cortarDosIndices()
	{
		
		System.out.println("Indice 2");
		System.out.println("============");
		System.out.println("Indice 2,1");
		Scanner escaner=new Scanner(System.in);
		int s2=escaner.nextInt();
		System.out.println("indice 2,2");
		int s3=escaner.nextInt();
		String a=cadena.substring(s2,s3);
		System.out.println("2 Indices: "+a);
		escaner.close();
	}
		
		
		
		/*
	
		System.out.println("Ingrese Cadena");
		String cadena=escaner.next();
		System.out.println("============");
		System.out.println("El total es: "+cadena.length());
		System.out.println("ingrese indice 1 a cortar");
		int s1=escaner.nextInt();
	
		String a=cadena.substring(s1);
		System.out.println("1 Indice: "+a);
		System.out.println("============");
		System.out.println("Indice 2");
		System.out.println("============");
		System.out.println("indice 2,1");
		int s2=escaner.nextInt();
	
		System.out.println("indice 2,2");
		int s3=escaner.nextInt();
	
		String s=cadena.substring(s2,s3);
		System.out.println("2 Indices: "+s);
		String totalCon=a+s;
		System.out.println("============");
		System.out.println("La concatenacion es: "+totalCon);
		
		System.out.println("Ingrese indice de caracter a buscar de: "+totalCon);
		int char1=escaner.nextInt();
		
		System.out.println("el indice del caracter es: "+totalCon.charAt(char1));
		if (a.equals(s)) {
			System.out.println("Son Iguales");
		}
		else
		{
			System.out.println("No son iguales");
		}
		
		System.out.println("============");
		System.out.println("En Mayusculas: "+totalCon.toUpperCase());
		System.out.println("============");
		System.out.println("En Minusculas: "+totalCon.toLowerCase());
		System.out.println("============");
		System.out.println("Ingresa caracter a reemplazar");
		String charA=escaner.next();
		char C1 = charA.charAt(0);
		System.out.println("============");
		System.out.println("Ingresa caracter a reemplazar");
		String charB=escaner.next();
		char C2 = charB.charAt(0);
		System.out.println("============");
		System.out.println("============");
		System.out.println("El cambio es: "+totalCon.replace(C1,C2));
		escaner.close();
		*/
}
