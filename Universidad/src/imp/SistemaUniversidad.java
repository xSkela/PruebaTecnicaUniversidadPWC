package imp;

import java.util.ArrayList;
import java.util.List;

public class SistemaUniversidad {
	private List<Estudiante> listaEstudiantes = new ArrayList<>();
	private List<Profesor> listaProfesores = new ArrayList<>();
	private List<PersonalDeServicio> listaPersonalDeServicio = new ArrayList<>();
	
	//Agregar estudiante al sistema con cursos
	public void AgregarEstudiante(
			String nombre,
			String apellido,
			EstadoCivil estadoCivil,
			String dni,
			List<String> cursos) {
		listaEstudiantes.add(new Estudiante(nombre, apellido, estadoCivil, dni, cursos));
	}
	
	//Agregar estudiante al sistema sin cursos
	public void AgregarEstudiante(
			String nombre,
			String apellido,
			EstadoCivil estadoCivil,
			String dni
			) {
		listaEstudiantes.add(new Estudiante(nombre, apellido, estadoCivil, dni));
	}
	
	//Agregar profesor al sistema
	public void AgregarProfesor(
			String nombre,
			String apellido,
			EstadoCivil estadoCivil,
			String dni,
			Departamento departamento,
			int anioIncorporacion,
			int numeroDespachoAsignado) {
		listaProfesores.add(
				new Profesor(nombre, apellido, estadoCivil, dni,anioIncorporacion,numeroDespachoAsignado,departamento)
		);
	}
	
	//Agregar Personal De Servicio al sistema
	public void AgregarPersonalDeServicio(
			String nombre,
			String apellido,
			EstadoCivil estadoCivil,
			String dni,
			SeccionPersonalDeServicio seccion,
			int anioIncorporacion,
			int numeroDespachoAsignado) {
		listaPersonalDeServicio.add(
				new PersonalDeServicio(nombre, apellido, estadoCivil, dni, anioIncorporacion, numeroDespachoAsignado, seccion)
		);
	}
	
	//Devolver una lista con los Profesores del mismo departamento dado
	public List<Profesor> ProfesoresPorDepartamento(Departamento buscado) {
		List<Profesor> listaRetorno = new ArrayList<>();
		for (int i = 0; i < listaProfesores.size(); i++) {
			Profesor actual = listaProfesores.get(i);
			if (actual.getDepartamento() == buscado) listaRetorno.add(actual);
		}
		return listaRetorno;
	}
	
	//Devolver una lista con los estudiantes del mismo curso
	public List<Estudiante> EstudiantesPorCurso(String buscado){
		List<Estudiante> listaRetorno = new ArrayList<>();
		for(int i = 0; i < listaEstudiantes.size();i++) {
			Estudiante actual = listaEstudiantes.get(i);
			if (actual.PertenceACurso(buscado)) listaRetorno.add(actual);
		}
		return listaRetorno;
	}
	
	//Cambiar el estado civil de una persona dando el dni
	public void CambiarEstadoCivil(String dni, EstadoCivil estadoCivil) {
		for (int i = 0; i < listaProfesores.size(); i++) {
			Profesor actual = listaProfesores.get(i);
			if (actual.GetDni() == dni) actual.CambiarEstadoCivil(estadoCivil);
		}
		for (int i = 0; i < listaEstudiantes.size(); i++) {
			Estudiante actual = listaEstudiantes.get(i);
			if (actual.GetDni() == dni) actual.CambiarEstadoCivil(estadoCivil);
		}
		for (int i = 0; i < listaPersonalDeServicio.size(); i++) {
			PersonalDeServicio actual = listaPersonalDeServicio.get(i);
			if (actual.GetDni() == dni) actual.CambiarEstadoCivil(estadoCivil);
		}
	}
	
	//Imprimir por consola
	public void Imprimir(String dni) {
		for (int i = 0; i < listaProfesores.size(); i++) {
			Profesor actual = listaProfesores.get(i);
			if (actual.GetDni() == dni) System.out.print(actual.GetNombre()+actual.GetApellido()+actual.GetDni()+actual.GetEstadoCivil()+actual.getDepartamento());
		}
		for (int i = 0; i < listaEstudiantes.size(); i++) {
			Estudiante actual = listaEstudiantes.get(i);
			if (actual.GetDni() == dni) System.out.print(actual.GetNombre()+actual.GetApellido()+actual.GetDni()+actual.GetEstadoCivil()+actual.GetCursos());
		}
		for (int i = 0; i < listaPersonalDeServicio.size(); i++) {
			PersonalDeServicio actual = listaPersonalDeServicio.get(i);
			if (actual.GetDni() == dni) System.out.print(actual.GetNombre()+actual.GetApellido()+actual.GetDni()+actual.GetEstadoCivil()+actual.GetSeccion());
		}
	}
	
	//Cambiar Departamento de un Profesor
	public void CambiarDepartamento(String dni, Departamento departamento) {
		for (int i = 0; i < listaProfesores.size(); i++) {
			Profesor actual = listaProfesores.get(i);
			if (actual.GetDni() == dni) actual.CambiarDepartamento(departamento);
		}
	}
	
	//Cambiar Seccion de un Personal de servicio
	public void CambiarSeccion (String dni, SeccionPersonalDeServicio seccion) {
		for (int i = 0; i < listaPersonalDeServicio.size(); i++) {
			PersonalDeServicio actual = listaPersonalDeServicio.get(i);
			if (actual.GetDni() == dni) actual.CambiarSeccionPersonalDeServicio(seccion);
		}
	}
	
	//Matricular a un estudiante a un curso
	public void MatricularEstudiante(String dni, String curso) {
		for (int i = 0; i < listaEstudiantes.size(); i++) {
			Estudiante actual = listaEstudiantes.get(i);
			if (actual.GetDni() == dni) actual.GetCursos().add(curso);
		}
	}
}
