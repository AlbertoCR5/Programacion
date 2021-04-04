package ejercicio1;

import java.util.HashSet;

public class Equipo {

	private String nombre;
	private HashSet<Alumno> jugadores;
	
	public Equipo(String nombre) {
		this.nombre = nombre;
		jugadores = new HashSet<Alumno>();
	}
	
	public void incorporarAlumno(Alumno alumno) {
		
	}
	
	public void borrarAlumno(Alumno alumno) {
		
	}

	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", jugadores=" + jugadores + "]";
	}
	
	
}
