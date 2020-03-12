
public class Circulo extends Figura{
	
	private double radio;
	
	public Circulo(double x, double y , double radio) {
		
		super(x,y);
		this.radio=radio;
	}
	
	public double area() {
		return Math.PI*radio*radio;
	}

}
