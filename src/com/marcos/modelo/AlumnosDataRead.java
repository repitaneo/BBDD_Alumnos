package com.marcos.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.marcos.controlador.AlumnoBean;
import com.marcos.modelo.util.BDConect;

public class AlumnosDataRead {

	
	
	
	public ArrayList<AlumnoBean> getAlumnos() {
		
		
		ArrayList<AlumnoBean> listaDevolver = new ArrayList<AlumnoBean>();
		
		
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
	    		
	    		listaDevolver.add(alumno);
	    	}
       	}
       	catch(Exception e) {
       		
       		e.printStackTrace();
       	}
       	
       	return listaDevolver;
		
	}
	
	
	
/*		
		
		
		
       	
       	// ejeculo la sentencia
		try {
			stmt = conexion.prepareStatement("SELECT * FROM cines");
	       	ResultSet rs = stmt.executeQuery();
	       	while (rs.next()) {
	       		
	       		CineBean cine = new CineBean();
	       		cine.setIdCine(rs.getInt("idcines"));
	       		cine.setNombre(rs.getString("nombre"));
	       		cine.setResponsable(rs.getString("responsable"));
	       		cine.setTelefono(rs.getString("telefono"));
	       		cine.setDireccion(rs.getString("direccion"));
	       		
	       		
	       		PeliculasData peliculaData = new PeliculasData();
	       		peliculaData.getPeliculas(cine);
	       		
	       		devolver.add(cine);
	       	} 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return devolver;
	}

*/	
	
	

}
