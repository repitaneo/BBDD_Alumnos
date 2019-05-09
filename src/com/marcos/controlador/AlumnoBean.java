package com.marcos.controlador;

public class AlumnoBean {

	private int idalumno;
	private String nombre;
	private String dni;
	
	
	
	
	
	
	
	
	public int getIdalumno() {
		return idalumno;
	}
	public void setIdalumno(int idalumno) {
		this.idalumno = idalumno;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
	
	@Override
	public String toString() {
		return "[" + idalumno + "," + nombre + "," + dni + "]";
	}
	
	
	
	
}
