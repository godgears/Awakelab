package testing;
import base.Paciente;
import java.util.ArrayList;
import java.util.Scanner;

public class AppGestionPacientes 
{
    private static ArrayList<Paciente> listaPac;
    
    public static void main(String[] args) 
    {
    	
        listaPac = new ArrayList<Paciente>();
        Scanner sc = new Scanner(System.in);
        
        while(true)
        {
            System.out.println("Menu: ");
            System.out.println("======");
            System.out.println(" 1) Agregar nuevo paciente");
            System.out.println(" 2) Listar pacientes");
            System.out.println(" 3) Eliminar un paciente");
            System.out.println(" 4) Modificar datos de un paciente");
            System.out.println(" 9) Salir");
            System.out.println(" Opcion? ");
            
            int opcion = sc.nextInt();
                         sc.nextLine(); //Limpiar de teclado
                         
            if(opcion==9) System.exit(0);
            
            switch(opcion)
            {
                case 1: //Agregar
                    agregarPaciente();
                    break;
                case 2: //Listar
                    listarPaciente();
                    break;
                case 3: //Eliminar
                    eliminarPaciente();                    
                    break;
                case 4: //Modificar
                    modificarPaciente();                    
                    break;    
            }
        }
    }
    
    public static void agregarPaciente()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Agregar un nombre de paciente");
        System.out.println("=============================");
                 
        System.out.println("Nombre : ");
        String nom = sc.nextLine();
                    
        System.out.println("Apellido : ");
        String ape = sc.nextLine();
                    
        System.out.println("Edad : ");
        byte edad = sc.nextByte();
                    sc.nextLine();
                    
        System.out.println("Sexo : ");
        char sex = sc.nextLine().trim().toUpperCase().charAt(0);
                    
        //Crear un objeto de la clase paciente
        Paciente pAux = new Paciente();
        pAux.setNombre(nom);
        pAux.setApellido(ape);
        pAux.setEdad(edad);
        pAux.setSexo(sex);
                    
        //Agregar el objeto paciente pAux a la lista paciente
        listaPac.add(pAux);
                    
        System.out.println("Paciente agreagdo correctamente");
    }
    
    public static void listarPaciente()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Listado de Pacientes");
        System.out.println("====================");
        int numPaciente = 0;
                    
        for(Paciente p : listaPac)
        {
        System.out.println("Paciente # " + numPaciente);
        System.out.println("=========================");
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Apellido: " + p.getApellido());
        System.out.println("Edad: " + p.getEdad());
        System.out.println("Sexo: " + p.getSexo());
        System.out.println();
        numPaciente++;
        }
    }

    public static void eliminarPaciente()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Elimincacion de Pacientes");
        System.out.println("=========================");
                    
        System.out.println("¿Que num de de paciente desea eliminar?  (-1 para listar)");
        System.out.println("====================");
        int posAEliminar = sc.nextInt();
                           sc.nextLine();
        if(posAEliminar ==-1)
            listarPaciente();
                    
        else if(posAEliminar >= 0 & posAEliminar < listaPac.size())
        {
            listaPac.remove(posAEliminar);
            System.out.println("Paciente eliminado");
            return;
        }
        else
        {
            System.out.println("Error: el paciente no existe");
        }
    }

    public static void modificarPaciente()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Modificacion de Paciente");
        System.out.println("==================");
        System.out.println("¿Que paciente desea modificar? ");
        int posAModificar = sc.nextInt();
                            sc.nextLine();
                                        
        if(posAModificar >= 0 & posAModificar < listaPac.size())
        {
            Paciente pModif = listaPac.get(posAModificar);
                        
            System.out.println("Nombre [ " + pModif.getNombre() + " ]:");
            String nom2 = sc.nextLine();
            if(nom2.length()>0) pModif.setNombre(nom2);
                    
            System.out.println("Apellido [ " + pModif.getApellido() + " ]:");
            String ape2 = sc.nextLine();
            if(ape2.length()>0) pModif.setApellido(ape2);
                    
            System.out.println("Edad [ " + pModif.getEdad() + " ]:");
            String edad2 = sc.nextLine();
                           sc.nextLine();
            if(ape2.length()>0) 
                pModif.setEdad(Byte.parseByte(edad2) );
                    
            System.out.println("Sexo [ " + pModif.getSexo() + " ]:");
            String sex2 = sc.nextLine();
            if(sex2.length()>0) 
            {
                pModif.setSexo(sex2.trim().toUpperCase().charAt(0));
                System.out.println("Paciente modificado correctamente");
            }
            else
            System.out.println("Error: el paciente no existe");
        }
    }
}