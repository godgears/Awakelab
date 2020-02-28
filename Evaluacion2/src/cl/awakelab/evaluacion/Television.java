package cl.awakelab.evaluacion;

/*
 * @author Jorge Ríos
 * @version 1.0
 */
public class Television extends Electrodomestico{
	  
    //Constantes
    private final static int RESOLUCION_DEFECTO=20;
  
    //Atributos
    private int resolucion;
    private boolean sintonizadorTDT;
  
  
    /**
     * Precio final de la television
     * @return precio final de la television
     */
    public int precioFinal(){
        //Invocamos el método precioFinal del método padre
        int plus=super.precioFinal();
  
        //Añadimos el codigo necesario
        if (resolucion>40){
            plus+=precioBase*0.3;
        }
        if (sintonizadorTDT){
            plus+=50;
        }
  
        return plus;
    }
  
    //Constructor
  
    /**
     * Constructor por defecto
     */
    public Television(){
        this(PRECIOB_DEFECTO, PESO_DEFECTO, CONSUMO_DEFECTO, COLOR_DEFECTO, RESOLUCION_DEFECTO, false);
    }
  
    /**
     * Constructor con 2 parametros
     * @param precioBase
     * @param peso
     */
    public Television(int precioBase, int peso){
        this(precioBase, peso, CONSUMO_DEFECTO, COLOR_DEFECTO, RESOLUCION_DEFECTO, false);
    }
  
    /**
     * Contructor con 6 parametros
     * @param precioBase
     * @param peso
     * @param consumoEnergetico
     * @param color
     * @param resolucion
     * @param sintonizadorTDT
     */
    public Television(int precioBase, int peso, char consumoEnergetico, String color, int resolucion, boolean sintonizadorTDT){
        super(precioBase, peso, consumoEnergetico, color);
        this.resolucion=resolucion;
        this.sintonizadorTDT=sintonizadorTDT;
    }
}
