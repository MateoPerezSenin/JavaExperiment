
public class Cliente {
	private String dni;
	private String nombre;
	private int edad;
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		
		this.dni = dni;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		return "Cliente [dni=" + dni + ", NOMBRE=" + nombre + ", EDAD=" + edad + "]";
	}
	
	
}
