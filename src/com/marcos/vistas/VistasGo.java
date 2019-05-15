package com.marcos.vistas;

import java.util.ArrayList;
import java.util.Scanner;

import com.marcos.controlador.AlumnoBean;
import com.marcos.modelo.AlumnosDataRead;

public class VistasGo {

	public void start() {

		
		int opcion;
		do {
			
			AlumnosDataRead adr = new AlumnosDataRead();
			ArrayList<AlumnoBean> lista = adr.getAlumnos();
			
			System.out.println("\n\n");
			int i = 0;
			for(AlumnoBean alumno:lista) {
				
				System.out.print("["+(i++)+"] ");
				System.out.print(alumno.getNombre()+" ");
				System.out.println(alumno.getDni());
			}
			
			System.out.println("\n\nWelcome!!!\n");
			System.out.println("1) Create");
			System.out.println("2) Update");
			System.out.println("3) Delete");
			System.out.println("\n____________________");
			System.out.println("0) Exit");
			
			Scanner scaner = new Scanner(System.in);
			opcion = scaner.nextInt();
			
			
			switch(opcion) {
			
				case 1:
						VistaCreate vc = new VistaCreate();
						vc.create();
						break;
				case 2: 
						VistaUpdate vu = new VistaUpdate();
						vu.update(lista);
						break;					
				case 3: 
						VistaDelete vd = new VistaDelete();
						vd.delete(lista);
			}
		}while(opcion!=0);
		
		
	}

}
