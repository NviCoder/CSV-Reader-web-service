package com.springboot.csvreaderservice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.springboot.csvreaderservice.model.Report;

/**
 * This Class responsible on the integration to h2database.
 * H2 is one of the popular in-memory databases written in Java. 
 * H2 can be embedded in Java applications or run in the client-server mode.
 * https://www.h2database.com/html/main.html
 *
 */
public class DB {
	
	static final String JDBC_DRIVER = "org.h2.Driver";   
	static final String DB_URL = "jdbc:h2:mem:testdb";  
	   
	// Database credentials keys 
	static final String USER = "sa"; 
	static final String PASS = "";
	
	/**
	 * This function used to insert a given report to the DB.
	 * @param report The given report that we want to save. 
	 */
	public static void saveReport(Report report) {
		String sql =  "INSERT INTO REPORT ( ID, AVERAGE_AGES, FIRST_NAME_NULLS, LAST_NAME_NULLS, AGE_NULLS) "+
					  "VALUES(?,?,?,?,?)";
					
	    try (Connection conn = DriverManager.getConnection(DB_URL,USER,PASS); PreparedStatement prst = conn.prepareStatement(sql) ){  
	    	Class.forName(JDBC_DRIVER); 
	        
	    	prst.setInt(1,1);
	    	prst.setDouble(2, report.getAverageAges());
	    	prst.setInt(3, report.getFirstNameNulls());
	    	prst.setInt(4, report.getLastNameNulls());
	    	prst.setInt(5, report.getAgeNulls());
	    	
	    	prst.executeUpdate();  

	      }catch(SQLException se) { 
	         //Handle errors for JDBC 
	         se.printStackTrace(); 
	      } catch(Exception e) { 
	         //Handle errors for Class.forName 
	         e.printStackTrace(); 
	      } //end try 
	      
	}
}
