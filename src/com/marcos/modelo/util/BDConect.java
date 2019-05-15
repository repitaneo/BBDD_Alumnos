package com.marcos.modelo.util;

import java.sql.Connection;
import java.sql.DriverManager;


public class BDConect {

	private static Connection conexion = null;
	
	
	
	private BDConect() {
		
		String user ="root";
		String pass = "P@ssword";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dbURL = "jdbc:mysql://localhost:3306/pruebas" 
				    + "?verifyServerCertificate=true" 
				    + "&useSSL=false"
				    + "&allowPublicKeyRetrieval=true"
				    + "&serverTimezone=UTC"
				    + "&requireSSL=false";
            conexion = DriverManager.getConnection(dbURL, user, pass);
		} 
		catch (Exception ex) {
            ex.printStackTrace();
        } 			
	}
	
	
	
	
	public static Connection getConexion() {
	
		if(conexion==null) {
			
			new BDConect();
		}
		
		return conexion;
	}
	
	
	
	
}
