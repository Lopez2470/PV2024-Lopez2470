package ar.edu.unju.fi.model;

public class Materia {
	private String codigo;
	private String nombre;
	
	//Constructor por defecto
	public Materia() {
	}

	//Constructor parametrizado
	public Materia(String codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}

	//Getters - Setters
	public String getCodigo() {
		return codigo;
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

	@Override
	public String toString() {
		return "Materia [codigo=" + codigo + ", nombre=" + nombre + "]";
	}	
}
