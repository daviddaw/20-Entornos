package ejercicio;

public class Cantante {
	private String nombre;
	private String nacionalidad;
	
	public Cantante(String nombre, String nacionalidad) {
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	@Override
	public String toString() {
		return "Cantante [nombre=" + nombre + ", nacionalidad=" + nacionalidad + "]";
	}
	
	

}
