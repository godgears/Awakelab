package cl.awakelab.evaluacion;

/*
 * @author Jorge Ríos
 * @version 1.0
 */
public class Lavadora extends Electrodomestico{
	  
    //Constantes
    private final static int CARGA_DEFECTO=5;
  
    //Atributos
    private int carga;
  
    /**
     * Retorna la carga de la Lavadora
     * @return
     */
    public int getCarga() {
        return carga;
    }
  
    /**
     * Metodo Precio final de la lavadora
     * @return precioFinal() de la Lavadora
     */
    public int precioFinal(){
        //Invocamos el método precioFinal del método padre
        int plus=super.precioFinal();
  
        //añadimos el código necesario
        if (carga>30){
            plus+=50;
        }
  
        return plus;
    }
  
    //Constructor
  
    /**
     * Contructor por defecto
     */
    public Lavadora(){
        this(PRECIOB_DEFECTO, PESO_DEFECTO, CONSUMO_DEFECTO, COLOR_DEFECTO, CARGA_DEFECTO);
    }
  
    /**
     * Constructor con 2 parametros
     * @param precioBase
     * @param peso
     */
    public Lavadora(int precioBase, int peso){
        this(precioBase, peso, CONSUMO_DEFECTO, COLOR_DEFECTO, CARGA_DEFECTO);
    }
  
    /**
     *  Constructor que incorpora 5 parametros
     * @param precioBase
     * @param peso
     * @param consumoEnergetico
     * @param color
     * @param carga
     */
    public Lavadora(int precioBase, int peso, char consumoEnergetico, String color, int carga){
        super(precioBase,peso, consumoEnergetico,color);
        this.carga=carga;
    }
}