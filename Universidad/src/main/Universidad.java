package main;

import java.util.List;

import imp.Departamento;
import imp.EstadoCivil;
import imp.Estudiante;
import imp.Profesor;
import imp.SeccionPersonalDeServicio;
import imp.SistemaUniversidad;

public class Universidad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SistemaUniversidad pruebaTecnicaPWC = new SistemaUniversidad();
		
		pruebaTecnicaPWC.AgregarEstudiante("Matias", "Corleone", EstadoCivil.SOLTERO, "34102493");
		pruebaTecnicaPWC.AgregarEstudiante("Ezequiel", "Morillo", EstadoCivil.DIVORCIADO, "35255772");
		pruebaTecnicaPWC.AgregarEstudiante("Dylan", "Bienvenida", EstadoCivil.CASADO, "43949422");
		pruebaTecnicaPWC.AgregarEstudiante("Christian", "Pliego", EstadoCivil.SOLTERO, "40185011");
		pruebaTecnicaPWC.AgregarEstudiante("Zacarías", "Montreal", EstadoCivil.CASADO, "41752796");
		
		pruebaTecnicaPWC.AgregarProfesor("Alina", "Costa", EstadoCivil.CASADO, "28416606",Departamento.ARQUITECTURA,1995,435);
		pruebaTecnicaPWC.AgregarProfesor("Mariangel", "Madrid", EstadoCivil.CASADO, "20618726",Departamento.LENGUAJES,1997,54);
		pruebaTecnicaPWC.AgregarProfesor("Ramón", "Sáez", EstadoCivil.DIVORCIADO, "27850021",Departamento.MATEMATICAS,1990,35);
		pruebaTecnicaPWC.AgregarProfesor("Patricio", "Ferrant", EstadoCivil.SOLTERO, "22295714",Departamento.ARQUITECTURA,2000,43);
		pruebaTecnicaPWC.AgregarProfesor("Asia", "Abellán", EstadoCivil.CASADO, "28239158",Departamento.MATEMATICAS,2010,46);
		
		pruebaTecnicaPWC.AgregarPersonalDeServicio("Martín ", "Atenas", EstadoCivil.DIVORCIADO, "20944641",SeccionPersonalDeServicio.BIBLIOTECA,1995,34);
		pruebaTecnicaPWC.AgregarPersonalDeServicio("Macos", "Pinto", EstadoCivil.SOLTERO, "23033683",SeccionPersonalDeServicio.DECANATO,1994,54);
		pruebaTecnicaPWC.AgregarPersonalDeServicio("Ana", "Aguayo", EstadoCivil.CASADO, "34642746",SeccionPersonalDeServicio.DECANATO,1993,32);
		pruebaTecnicaPWC.AgregarPersonalDeServicio("Esmeralda", "Cabal", EstadoCivil.SOLTERO, "28764140",SeccionPersonalDeServicio.SECRETARIA,1997,32);
		pruebaTecnicaPWC.AgregarPersonalDeServicio("Bautista", "Navarro", EstadoCivil.CASADO, "21978103",SeccionPersonalDeServicio.SECRETARIA,1999,56);
		
		//Cambio de Estado Civil
		pruebaTecnicaPWC.CambiarEstadoCivil("21978103 ", EstadoCivil.DIVORCIADO);
		
		//Matriculacion de Estudiantes a un curso nuevo
		pruebaTecnicaPWC.MatricularEstudiante("41752796", "123");
		pruebaTecnicaPWC.MatricularEstudiante("34102493", "123");
		pruebaTecnicaPWC.MatricularEstudiante("43949422", "123");
		
		//Obtencion de Estudiantes de un curso
		List<Estudiante> listaCurso = pruebaTecnicaPWC.EstudiantesPorCurso("123");
		
		//Cambio de Departamento de un Profesor
		pruebaTecnicaPWC.CambiarDepartamento("22295714", Departamento.MATEMATICAS);
		
		//Obtencion de Profesores de un departamento
		List<Profesor> listaDepartamento = pruebaTecnicaPWC.ProfesoresPorDepartamento(Departamento.MATEMATICAS);
		
		//Traslado de seccion de un empleado de servicio
		pruebaTecnicaPWC.CambiarSeccion("21978103", SeccionPersonalDeServicio.DECANATO);
	}

}
