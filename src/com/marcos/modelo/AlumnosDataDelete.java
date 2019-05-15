package com.marcos.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.marcos.controlador.AlumnoBean;
import com.marcos.modelo.util.BDConect;

public class AlumnosDataDelete {

	public void delete(AlumnoBean alumnoBorrar) {

		
		Connection conexion = BDConect.getConexion(); 
       	PreparedStatement stmt;
       	
       	String sql = 	"DELETE "
       					+ "FROM alumnos "
       					+ "WHERE idalumno="+alumnoBorrar.getIdalumno();
       	
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
