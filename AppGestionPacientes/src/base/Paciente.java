package base;

public class Paciente 
{
    private String nombre, apellido;
    private byte edad;
    private char sexo;
    
    
	
    public Paciente(){}
    public Paciente(String nom, String ape, byte edad, char sex){
		this.nombre = nom;
		this.apellido = ape;
		this.edad = edad;
		this.sexo = sex;
	}
  
    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nom) {
        this.nombre = nom;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String ape) {
        this.apellido = ape;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sex) {
        this.sexo = sex;
    }  
}
