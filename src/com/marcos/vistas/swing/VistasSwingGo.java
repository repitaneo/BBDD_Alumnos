package com.marcos.vistas.swing;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


import com.marcos.vistas.swing.listeners.BotonCrearListener;

public class VistasSwingGo {

	public void start() {

		
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("huevo");
		modelo.addColumn("zapato");
		modelo.addRow(new Object[]{"huevo1","zapato1"});
		modelo.addRow(new Object[]{"huevo2","zapato2"});
		
		JTable tabla = new JTable();
		tabla.setModel(modelo);
		
		
		JButton botonCrear = new JButton("crear");
		
		
		JFrame marco = new JFrame();
		marco.setBounds(300, 300, 500, 400);
		marco.setTitle("Pruebas con tablas");
		marco.setTitle("Datos de tabla");
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setLayout(new BorderLayout());

		marco.getContentPane().add(tabla, BorderLayout.CENTER);
		marco.getContentPane().add(botonCrear, BorderLayout.SOUTH);
		marco.setVisible(true);
		
	}

}
