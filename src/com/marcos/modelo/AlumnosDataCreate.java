package com.marcos.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.marcos.controlador.AlumnoBean;
import com.marcos.modelo.util.BDConect;


public class AlumnosDataCreate {

	
	
	public void insert(AlumnoBean alumnoInsertar) {
	
		Connection conexion = BDConect.getConexion(); 
       	PreparedStatement stmt;
       	
       	String sql = 	"INSERT INTO alumnos(nombre,dni)"+
       					" VALUES ('"+alumnoInsertar.getNombre()+
       					"','"+alumnoInsertar.getDni()+"')";	
       	
       	//System.out.println(sql);
       	
		try {
			stmt = conexion.prepareStatement(sql);
	       	stmt.execute();
	       	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
