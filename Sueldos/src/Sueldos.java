import java.util.Scanner;
import java.util.ArrayList;
public class Sueldos {
	public static void main(String args[])
	{
			Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		    System.out.println("Enter username");
		    String name = myObj.nextLine();  // Read user input
		    if(name.equals("Jorge"))
		    {
		    	System.out.println("Su sueldo es: "+200000);
		    }
	}
}