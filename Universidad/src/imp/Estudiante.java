package imp;

import java.util.ArrayList;
import java.util.List;

public class Estudiante extends Persona{
	private List<String> cursos;
	
	public Estudiante(
			String nombre, 
			String apellido, 
			EstadoCivil estadoCivil, 
			String dni
			) {
		super(nombre, apellido, estadoCivil, dni);
		this.cursos = new ArrayList<>();
	}
	public Estudiante(
			String nombre, 
			String apellido, 
			EstadoCivil estadoCivil, 
			String dni,
			List<String> cursos) {
		super(nombre, apellido, estadoCivil, dni);
		this.cursos = cursos;
	}
	
	public void MatriculacionNueva(String curso) {
		this.cursos.add(curso);
	}
	
	public boolean PertenceACurso(String curso) {
		for (int i = 0; i < cursos.size(); i++) {
			if (curso==cursos.get(i)) return true;
		}
		return false;
	}
	
	public List<String> GetCursos() {
		return this.cursos;
	}
}
