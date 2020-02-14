package Test;
import java.util.ArrayList;

public class Ejemplo2 
{
    public static void main(String[] args) 
    {
        ArrayList<Float> lista2 = new ArrayList<Float>();
        ArrayList<Integer> lista3 = new ArrayList<Integer>(); // Enteros
        ArrayList<String> lista4 = new ArrayList<String>();
        ArrayList<String> lista5 = new ArrayList<>();
        
        lista2.add(100.45F);
        lista2.add(-5.67F);
        lista2.add(56.92F);
        lista2.add(0.001F);
        
        //Calcular el promedio de lso datos anteriores
        float total = 0.0F;
        for(Float num : lista2)
        {
            total = total + num;
        }
        
        System.out.println("Promedio = " + (total/lista2.size()));
    }
}
