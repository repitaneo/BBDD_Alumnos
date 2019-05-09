package com.marcos.go;

import java.util.ArrayList;

import com.marcos.controlador.AlumnoBean;
import com.marcos.modelo.AlumnosDataCreate;
import com.marcos.modelo.AlumnosDataRead;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		/* 
		 * Parte del Start que crea el READ del CRUD 
		 */
		AlumnosDataRead adr = new AlumnosDataRead();
		ArrayList<AlumnoBean> misAlumnos = adr.getAlumnos();
		System.out.println(misAlumnos);
		
		
		
		/* 
		 * parte del Start que crea el CREATE del CRUD 
		 */
		AlumnoBean alumnoInsertar = new AlumnoBean();
		alumnoInsertar.setNombre("Patata Abascal");
		alumnoInsertar.setDni("000666000");
		
		AlumnosDataCreate adc = new AlumnosDataCreate();
		adc.insert(alumnoInsertar);
		
		
		// nueva lectura de la BBDD
		System.out.println(adr.getAlumnos());
		
		
		
	}

}
