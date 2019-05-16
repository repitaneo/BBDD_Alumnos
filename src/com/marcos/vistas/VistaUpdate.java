package com.marcos.vistas;

import java.util.ArrayList;
import java.util.Scanner;

import com.marcos.controlador.AlumnoBean;
import com.marcos.controlador.AlumnosBO;
import com.marcos.modelo.AlumnosDataDelete;
import com.marcos.modelo.AlumnosDataUpdate;

public class VistaUpdate {

	public void update(AlumnosBO lista) {

		Scanner scaner = new Scanner(System.in);
		
		System.out.println("¿a quien actualizo?\nIntroduce su posición");
		int opcion = scaner.nextInt();
		
		if((opcion>=0) && (opcion<lista.getCuantos())) {
		
			AlumnoBean alumnoActualizar = lista.getAlumnoPorPosicion(opcion);

			System.out.println("["+alumnoActualizar.getNombre()+"] ¿Nuevo Nombre?");
			String nombre = scaner.next();
			System.out.println("["+alumnoActualizar.getDni()+"] ¿Nuevo DNI?");
			String dni = scaner.next();
			
			
			if(nombre.length()>1) alumnoActualizar.setNombre(nombre);
			if(dni.length()>1) alumnoActualizar.setDni(dni);
			
			AlumnosDataUpdate adu = new AlumnosDataUpdate();
			adu.update(alumnoActualizar);

		}		
		
		
		
	}

}
