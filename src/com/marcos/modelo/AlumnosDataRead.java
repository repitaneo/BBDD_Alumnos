package com.marcos.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.marcos.controlador.AlumnoBean;
import com.marcos.controlador.AlumnosBO;
import com.marcos.modelo.util.BDConect;

public class AlumnosDataRead {

	
	
	
	public AlumnosBO getAlumnos() {
		
		
		AlumnosBO listaDevolver = new AlumnosBO();
		
		
		// preparo la conexion
		Connection conexion = BDConect.getConexion(); 
       	PreparedStatement stmt;
	
       	try {
       		
       		//  configuro una query SQL
			stmt = conexion.prepareStatement("SELECT * FROM alumnos");
			// ejecuto la query
	       	ResultSet resultadoSQL = stmt.executeQuery();
	       	

	       	// recorrer el resultado
	    	while (resultadoSQL.next()) {
	    		
		       	AlumnoBean alumno = new AlumnoBean();
	    		alumno.setIdalumno(resultadoSQL.getInt("idalumno"));
	    		alumno.setNombre(resultadoSQL.getString("nombre"));
	    		alumno.setDni(resultadoSQL.getString("dni"));
	    		
	    		listaDevolver.addAlumno(alumno);
	    	}
       	}
       	catch(Exception e) {
       		
       		e.printStackTrace();
       	}
       	
       	return listaDevolver;
	}
	
}
