package cl.awakelab.evaluacion;
/*
 * @author Jorge Ríos
 * @version 1.0
 */
public class Electrodomestico {
	   
    //Constantes
	
    protected final static String COLOR_DEFECTO="blanco";
    protected final static char CONSUMO_DEFECTO='F';
    protected final static int PRECIOB_DEFECTO=100;
    protected final static int PESO_DEFECTO=5;
   
    //Atributos
    
    protected int precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected int peso;
   
   
    public void comprobarColor(String color){
   
        String colores[]={"blanco", "negro", "rojo", "azul", "gris"};
        boolean encontrado=false;
  
        for(int i=0;i<colores.length && !encontrado;i++){
              
            if(colores[i].equals(color)){
                encontrado=true;
            }
              
        }
          
        if(encontrado){
            this.color=color;
        }else{
            this.color=COLOR_DEFECTO;
        }
          
          
    }
      
    /**
     * Solo Letras mayusculas, no detecta las minusculas
     * @param consumoEnergetico
     */
    public void comprobarConsumoEnergetico(char consumoEnergetico){
          
        if(consumoEnergetico>=65 && consumoEnergetico<=70){
            this.consumoEnergetico=consumoEnergetico;
        }else{
            this.consumoEnergetico=CONSUMO_DEFECTO;
        }
          
    }
   
    /**
     * Retorna el precio base del Electrodomestico
     * @return Precio Base del Electrodomestico
     */
    public int getPrecioBase() {
        return precioBase;
    }
    /**
     * Retorna el color del Electrodomestico
     * @return color del Electrodomestico
     */
    public String getColor() {
        return color;
    }
   
     /**
     * Retorna el consumo energetico del Electrodomestico
     * @return consumo energetico del Electrodomestico
     */
    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }
    /**
     * Retorna el peso del Electrodomestico
     * @return Peso del Electrodomestico
     */
    public int getPeso() {
        return peso;
    }
    /**
     * Metodo para poder calcular el precio final del Electrodomestico
     * @return Precio Final del Electrodomestico
     */
    public int precioFinal(){
        int incremento=0;
        switch(consumoEnergetico){
            case 'A':
                incremento+=100;
                break;
            case 'B':
                incremento+=80;
                break;
            case 'C':
                incremento+=60;
                break;
            case 'D':
                incremento+=50;
                break;
            case 'E':
                incremento+=30;
                break;
            case 'F':
                incremento+=10;
                break;
        }
   
        if(peso>=0 && peso<19){
            incremento+=10;
        }else if(peso>=20 && peso<49){
            incremento+=50;
        }else if(peso>=50 && peso<=79){
            incremento+=80;
        }else if(peso>=80){
            incremento+=100;
        }
   
        return precioBase+incremento;
    }
   
    //Constructores
   
    /**
     * Contructor por defecto agregando sus constantes
     */
    public Electrodomestico(){
        this(PRECIOB_DEFECTO, PESO_DEFECTO, CONSUMO_DEFECTO, COLOR_DEFECTO);
    }
   
    /**
     * Contructor con 2 parametros y sus valores por def
     * @param precioBase
     * @param peso 
     */
    public Electrodomestico(int precioBase, int peso){
        this(precioBase, peso, CONSUMO_DEFECTO, COLOR_DEFECTO);
    }
   
    /**
     * Constructor que incorpora 4 parametros
     * @param precioBase
     * @param peso
     * @param consumoEnergetico
     * @param color
     */
    
    public Electrodomestico(int precioBase, int peso, char consumoEnergetico, String color){
        this.precioBase=precioBase;
        this.peso=peso;
        comprobarConsumoEnergetico(consumoEnergetico);
        comprobarColor(color);
    }
   
}