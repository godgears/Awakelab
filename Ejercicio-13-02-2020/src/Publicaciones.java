
public class Publicaciones {
	
	private String nombre;
	private String tipo;
	private int fecha;
	private boolean estado;
	
	public Publicaciones(String nombre, String tipo, int fecha, boolean estado) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.fecha = fecha;
		this.estado = estado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getFecha() {
		return fecha;
	}
	public void setFecha(int fecha) {
		this.fecha = fecha;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	
	public void cuentaPrestrados() {
		int cont;
		cont=0;
		if (estado==true) {
			cont++;
		}
	}
	
	
}
