package com.marcos.vistas;

import java.util.ArrayList;
import java.util.Scanner;
import com.marcos.controlador.AlumnoBean;
import com.marcos.controlador.AlumnosBO;
import com.marcos.modelo.AlumnosDataDelete;

public class VistaDelete {

	public void delete(AlumnosBO lista) {

		System.out.println("¿a quien borro?\nIntroduce su ID");
		Scanner scaner = new Scanner(System.in);
		int opcion = scaner.nextInt();
		
		//if((opcion>=0) && (opcion<lista.getCuantos())) {
		
		AlumnoBean alumnoBorrar = lista.getAlumnoPorId(opcion);
		
		if(alumnoBorrar!=null) {
			AlumnosDataDelete add = new AlumnosDataDelete();
			add.delete(alumnoBorrar);
		}
	}
}
