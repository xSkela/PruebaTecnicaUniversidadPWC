package imp;

public class Empleado extends Persona{
	private int anioIncorporacion;
	private int numeroDespachoAsignado;
	
	public Empleado (
			String nombre, 
			String apellido, 
			EstadoCivil estadoCivil, 
			String dni,
			int anioIncorporacion,
			int numeroDespachoAsignado) {
		super(nombre, apellido, estadoCivil, dni);
		this.anioIncorporacion = anioIncorporacion;
		this.numeroDespachoAsignado = numeroDespachoAsignado;		
	}
	
	public int GetAnioIncorporacion() {
		return this.anioIncorporacion;
	}
	
	public int numeroDespachoAsignado() {
		return this.numeroDespachoAsignado;
	}
}
