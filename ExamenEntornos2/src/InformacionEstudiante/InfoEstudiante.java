package InformacionEstudiante;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class InfoEstudiante {
	private Asignatura espaņol;
	private Asignatura Ingles;
	private Estudiante e1;

	public static void main(String[] args) {
		Estudiante alumno = new Estudiante("H2O", "Juanito", "hombre");
		
		System.out.println("codigo: "+alumno.codigo+ " " +alumno.nombre+" Espaņol final: "+promediarEspaņol() +" sexo: "+alumno.sexo);
		System.out.println("codigo: "+alumno.codigo+ " " +alumno.nombre+" Ingles final: "+promediarIngles() +" sexo: "+alumno.sexo);
		System.out.println("promedio Definitiva Final: "+promediarSemestre());
	}
	
	
	
	public static double promediarEspaņol() {
		Asignatura espaņol = new Asignatura(2.5, 3.5);
		double promedioEs = (espaņol.nota1+espaņol.nota1)/2;
		return promedioEs;
	}
	public static double promediarIngles() {
		Asignatura ingles = new Asignatura(4.5, 3.4);
		double promedioIn = (ingles.nota1+ingles.nota1)/2;
		return promedioIn;
	}
	public static double promediarSemestre() {
		double fin = (promediarEspaņol()+promediarIngles())/2;
		return fin;
	}
	
	
}
