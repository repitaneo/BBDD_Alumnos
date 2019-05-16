package com.marcos.controlador;

import java.util.ArrayList;

public class AlumnosBO {

	private ArrayList<AlumnoBean> lista;
	
	/*
	 * Variables si quiesiera usar otra forma de almacenamiento
	 * LEER mas abajo
	 * 
	private AlumnoBean lista[];
	private int cuantos;
	private int MAXIMO_ALUMNOS = 100;
	
	*/
	
	public AlumnosBO() {
		
		lista = new ArrayList<AlumnoBean>();
		
		
		/*
		 * Otra posible implementación sería con vectores
		 * Complica el funcionamiento porque los ArrayList
		 * ya tienen implementadas operaciones que me ahorro
		 * como programador
		 * 
		 * necesitaría la propia lista y saber cuantos
		 * alumnos llevo añadidos
		 * 
		lista = new AlumnoBean[MAXIMO_ALUMNOS];
		cuantos = 0;
		*/
	}
	
	
	
	public void addAlumno(AlumnoBean alumno) {
		
		lista.add(alumno);
	
		
		/*
		 * 
		 *Forma de añadir AlumnoBean a la estructura de datos
		 *de vector 
		 *
		lista[cuantos] = alumno;
		cuantos++;
		*/
	}
	
	
	
	public int getCuantos() {
		
		return lista.size();
	}
	
	
	
	
	public AlumnoBean getAlumnoPorPosicion(int posicion) {
		
		if((posicion>=0)&&(posicion<lista.size())) {
			
			return lista.get(posicion);
		}
		else return null;
	}
	
	
	
	
	
	
	public AlumnoBean getAlumnoPorId(int id) {

		int posicion = 0;
		while(posicion<lista.size()) {
			
			if(id==lista.get(posicion).getIdalumno()) {
				
				return  lista.get(posicion);
			}
			else {
				posicion++;
			}
		}
		return null;
	}	
	
	
	
	
	
}
