package com.marcos.vistas;

import java.util.ArrayList;
import java.util.Scanner;
import com.marcos.controlador.AlumnoBean;
import com.marcos.modelo.AlumnosDataDelete;

public class VistaDelete {

	public void delete(ArrayList<AlumnoBean> lista) {

		System.out.println("¿a quien borro?");
		Scanner scaner = new Scanner(System.in);
		int opcion = scaner.nextInt();
		
		if((opcion>=0) && (opcion<lista.size())) {
		
			AlumnoBean alumnoBorrar = lista.get(opcion);
		
			AlumnosDataDelete add = new AlumnosDataDelete();
			add.delete(alumnoBorrar);
		}
	}
}
