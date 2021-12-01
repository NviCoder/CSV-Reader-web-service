package com.springboot.csvreaderservice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import com.springboot.csvreaderservice.model.Report;

/**
 * This class used to read CSV file and get his statistics. 
 *
 */
public class csvReader {
	
	public static int[]numberOfNullsPerColumn = new int[]{0,0,0};
	public static int sumOfAges = 0;
	public static int averageAge = 0;
	public static int numberOfRows = 0;

	/**
	 * This function reads CSV file row by row.
	 * 
	 */
	public static Report readCsvfile(String path) {
		
		
		String file = path;
		BufferedReader reader = null;
		String line = "";
	  
		try {
			reader = new BufferedReader(new FileReader(file));
			String headerLine = reader.readLine();// skip the headLine row.
			
			while((line = reader.readLine()) != null) {
				
				String[] rowData = line.split(",");
				handleDataFromRow(rowData);
			    numberOfRows++;
			   }
		  }
		  catch(Exception e) {
		   e.printStackTrace();
		  }
		  finally {  
			  try {
			    reader.close();
			   } catch (IOException e) {
			    // TODO Auto-generated catch block
			    e.printStackTrace();
			   }
		  }		
		
		return (new Report(1, sumOfAges/numberOfRows, numberOfNullsPerColumn));
	 }
	
	/**
	  * This function gets a CSV file row and taking out the data for the 
	  * statistics.
	  * @param rowData
	  */
	 public static void handleDataFromRow(String[] rowData) {
		 
		 //[0] first name, [1] lastName, [2] age
		for(int i = 0; i < rowData.length; i++) {
			
			if(rowData[i].equals("Null")) {
				 numberOfNullsPerColumn[i] += 1;
			 }
			
			if(i == 2) {
				 int currentRowAge = rowData[i].equals("") || rowData[i].equals("Null") ? 0 : Integer.parseInt(rowData[i]);
				 sumOfAges += currentRowAge;
			 }
		}
		 	 
		 
	 }
	 
	}


