import java.io.*;
public class moneda {
	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String cantidad;
		String moneda;
		System.out.println("Que Moneda Quiere Cambiar: yen, dolar o libra");
		moneda = bufEntrada.readLine();
		System.out.println("Cantidad: ");
		cantidad = bufEntrada.readLine();
		double mon = Double.parseDouble(cantidad);
		double total;
		while(moneda.equals("libra")|| moneda.equals("dolar")|| moneda.equals("yen")){	
	
		if(moneda.equals("libra"))
		{
			total=mon*1.22;
			System.out.print(total);
		}
		else if(moneda.equals("dolar"))
		{
			total=mon*0.75;
			System.out.println(total);
		}
		else if(moneda.equals("yen"))
		{
			total=mon*0.009;
			System.out.println("El valor a convertir es: "+total);
		}
		else
		{
			System.out.println("Error en la conversion");
		}
		}
		
	}
}

