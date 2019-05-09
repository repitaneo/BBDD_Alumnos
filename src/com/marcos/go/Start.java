package com.marcos.go;

import java.util.ArrayList;

import com.marcos.controlador.AlumnoBean;
import com.marcos.modelo.AlumnosDataRead;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		AlumnosDataRead adr = new AlumnosDataRead();
		ArrayList<AlumnoBean> misAlumnos = adr.getAlumnos();
		
		
		System.out.println(misAlumnos);
	}

}
