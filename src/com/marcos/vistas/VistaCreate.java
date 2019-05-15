package com.marcos.vistas;

import java.util.Scanner;

import com.marcos.controlador.AlumnoBean;
import com.marcos.modelo.AlumnosDataCreate;
import com.marcos.modelo.AlumnosDataDelete;

public class VistaCreate {

	public void create() {

		// recogida de datos
		Scanner scaner = new Scanner(System.in);

		System.out.println("¿Nombre?");
		String nombre = scaner.nextLine();
		System.out.println("¿DNI?");
		String dni = scaner.nextLine();
		
		
		AlumnoBean nuevoAlumno = new AlumnoBean();
		nuevoAlumno.setNombre(nombre);
		nuevoAlumno.setDni(dni);
		
		AlumnosDataCreate add = new AlumnosDataCreate();
		add.insert(nuevoAlumno);
	}

}
