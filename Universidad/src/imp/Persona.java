package imp;

import java.util.List;

public class Persona {
	private String nombre;
	private String apellido;
	private EstadoCivil estadoCivil;
	private String dni;
	
	public Persona(
			String nombre, 
			String apellido, 
			EstadoCivil estadoCivil, 
			String dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.estadoCivil = estadoCivil;
		this.dni = dni;
	}
	
	public void CambiarEstadoCivil(EstadoCivil nuevoEstadoCivil) {
		this.estadoCivil = nuevoEstadoCivil;
		return;
	}
	
	public String GetNombre() {
		return this.nombre;
	}
	
	public String GetApellido() {
		return this.apellido;
	}
	
	public EstadoCivil GetEstadoCivil() {
		return this.estadoCivil;
	}
	
	public String GetDni() {
		return this.dni;
	}
}
