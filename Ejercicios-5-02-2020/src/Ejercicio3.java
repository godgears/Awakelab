public class Ejercicio3 {
	 public static void main(String[] args) {
	        contar();
	    }
	 public static void contar() {

		String cadena="casa blanca";
		char vocal='a';
		String vocalS=Character.toString(vocal);
	    int contadorTotal=0;
	    // recorremos la cadena recibida letra a letra
	    for (int i=0;i<cadena.length();i++) {
	    // recorremos las vocales para comparar con cada una de las letras
	    	for (int j=0;j<vocalS.length();j++) {
	    		if (cadena.charAt(i)==vocalS.toLowerCase().charAt(j)) {
	    			contadorTotal++;   
	            }
	        }
	     }
	     System.out.println("EL total que se repite "+vocalS+" es: "+ contadorTotal);   
	 }

}
