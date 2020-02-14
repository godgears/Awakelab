package Test;
import java.util.ArrayList;

public class Ejemplo1 
{
    public static void main(String[] args) 
    {
        //1.- Crear una lista vacia
        ArrayList lista1 = new ArrayList();
        
        //2.- Agregar datos  a la lista
        lista1.add(-1);
        lista1.add('a');
        lista1.add(5.6F);
        lista1.add("hola");
        lista1.add(false);
        
        //3.- Recorrer la lista para mostar sus elementos
        for (int pos = 0; pos < lista1.size(); pos++) 
        {
            System.out.println(lista1.get(pos));
        }
        
        //4.- "for" mejorado  ('enhanced for')
        for(Object x : lista1)  //Para cada dato 'x' de la lista 'lista1'
        {                       //hacer lo siguiente
            System.out.println(x);
        }
    }
}
