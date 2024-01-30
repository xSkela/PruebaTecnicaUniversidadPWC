package imp;

public class PersonalDeServicio extends Empleado{
	private SeccionPersonalDeServicio seccion;
	
	public PersonalDeServicio(
			String nombre, 
			String apellido, 
			EstadoCivil estadoCivil, 
			String dni,
			int anioIncorporacion,
			int numeroDespachoAsignado,
			SeccionPersonalDeServicio seccion) {
		super(nombre, apellido, estadoCivil, dni, anioIncorporacion, numeroDespachoAsignado);
		this.seccion = seccion;
	}
	
	public void CambiarSeccionPersonalDeServicio(SeccionPersonalDeServicio seccionNueva) {
		this.seccion = seccionNueva;
	}
	
	public SeccionPersonalDeServicio GetSeccion() {
		return this.seccion;
	}
}
