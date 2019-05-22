package InformacionEstudiante;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Asignatura {
	
	double nota1;
	double nota2;
	public Asignatura(double nota1, double nota2) {
		super();
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	

}