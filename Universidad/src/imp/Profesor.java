package imp;

public class Profesor extends Empleado{
	private Departamento departamento;
	
	public Profesor(
			String nombre, 
			String apellido, 
			EstadoCivil estadoCivil, 
			String dni,
			int anioIncorporacion,
			int numeroDespachoAsignado,
			Departamento departamento) {
		super(nombre, apellido, estadoCivil, dni, anioIncorporacion, numeroDespachoAsignado);
		this.departamento = departamento;
	}
	
	public void CambiarDepartamento(Departamento nuevoDepartamento) {
		this.departamento = nuevoDepartamento;
	}
	
	public Departamento getDepartamento() {
		return this.departamento;
	}
	
}