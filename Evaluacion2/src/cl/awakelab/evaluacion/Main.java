package cl.awakelab.evaluacion;
/*
 * @author Jorge Ríos
 * @version 1.0
 */
public class Main {
	 
    public static void main(String[] args) {
   
        Electrodomestico listadoElectro[]=new Electrodomestico[10];
        
        listadoElectro[0]=new Television(3000, 60);
        listadoElectro[1]=new Television(1500, 40, 'A', "blanco", 50, true);
        listadoElectro[2]=new Lavadora(1000, 40, 'B', "verde", 20);
        listadoElectro[3]=new Electrodomestico(100, 10);
        listadoElectro[4]=new Television(4000, 80, 'E', "negro", 42, false);
        listadoElectro[5]=new Electrodomestico(200,50);
        listadoElectro[6]=new Electrodomestico(4350, 20, 'B', "morado");
        listadoElectro[7]=new Lavadora(100, 30);
        listadoElectro[8]=new Electrodomestico(2000, 60, 'C', "rojo");
        listadoElectro[9]=new Lavadora(3000, 100, 'F', "gris", 15);
       
        //Variables para poder almacenar la suma total por tipo
        int sumaElectrodomesticos=0;
        int sumaTelevisiones=0;
        int sumaLavadoras=0;
        int Total=0;
        
        /*
         * 	Recorre el arreglo y calcula con el metodo precioFinal()
         *  dependiendo de la clase la cual se encuentra y de que tipo es
         *  Agregandole la condicion la cual separa los tipos y se calcula por separado
         */
       
        for(int i=0;i<listadoElectro.length;i++){
        	//Antes Verificar los colores y consumo
        	listadoElectro[i].comprobarColor(listadoElectro[i].getColor());
        	listadoElectro[i].comprobarConsumoEnergetico(listadoElectro[i].getConsumoEnergetico());
        	
        	//Luego validar de que tipo es para poder calcular el precio final
        	
            if(listadoElectro[i] instanceof Electrodomestico){
       
                sumaElectrodomesticos+=listadoElectro[i].precioFinal();
            }
            if(listadoElectro[i] instanceof Lavadora){
                sumaLavadoras+=listadoElectro[i].precioFinal();
            }
            if(listadoElectro[i] instanceof Television){
                sumaTelevisiones+=listadoElectro[i].precioFinal();
            }
            Total= sumaElectrodomesticos+sumaLavadoras+sumaTelevisiones;
            /* Esto imprime cada uno de los objetos del array
            System.out.println("==============================================");
            System.out.println("Tipo: "+listadoElectro[i].getClass());
            System.out.println("Color: "+ listadoElectro[i].getColor());
            System.out.println("Precio Base: "+listadoElectro[i].getPrecioBase());
            System.out.println("Precio Final: "+listadoElectro[i].precioFinal());
            System.out.println("Peso: "+listadoElectro[i].getPeso());
            System.out.println("Consumo: "+listadoElectro[i].getConsumoEnergetico());
            System.out.println("==============================================");
            */
        }
        System.out.println("==============================================");
        System.out.println("| Precio Toltal de Electrodomesticos: "+sumaElectrodomesticos+"€ |");
        System.out.println("| Precio Total de Lavadoras:           "+sumaLavadoras+"€ |");
        System.out.println("| Precio Total de Televisiones:       "+sumaTelevisiones+"€ |");
        System.out.println("| Precio Total de todo:               "+Total+"€ |");
        System.out.println("==============================================");
   
    }
   
}
