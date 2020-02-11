import java.util.Scanner;

public class Ejercicio1 {
	
	 public static void main(String[] args) {
		 	//Declaramos el tamaño de nuestro arreglo llamando el metodo
	        int num[]=rellenarArray(13);
	        //LLamamos a nuestro metodo
	        imprimirArray(num);
	    }
	    //Metodo para rellenar nuestro arreglo
	    public static int[] rellenarArray(int a){
	    	Scanner numero = new Scanner(System.in);
	    	//Variable de arreglo y definicion
	        int num[]=new int [a];
	        //Itera hasta que el arreglo sea de a
	        for(int i=0;i<num.length;i++){
	        	 System.out.println("Introduzca el elemento [" + i + "]");
	        	 num[i] = numero.nextInt();
	        }
	        return num;
	    }
	    //Metodo para Imprimir nuestro Arreglo
	    public static void imprimirArray (int num[]){
	        for(int i=0;i<num.length;i++){
	        	System.out.println ("[" + i +"] = " + num[i]);
	        }
	    }
}
