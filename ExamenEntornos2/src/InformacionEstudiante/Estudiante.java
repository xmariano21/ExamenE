package InformacionEstudiante;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Estudiante {
	String codigo;	
	String nombre;
	String sexo;
	public String getCodigo() {
		return codigo;
	}
	public Estudiante(String codigo, String nombre, String sexo) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.sexo = sexo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

}
