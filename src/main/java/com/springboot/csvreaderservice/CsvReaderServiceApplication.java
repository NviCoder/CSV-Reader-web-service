package com.springboot.csvreaderservice;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.springboot.csvreaderservice.model.Report;


@SpringBootApplication
public class CsvReaderServiceApplication {
	
	
	public static void main(String[] args) {
		
		SpringApplication.run(CsvReaderServiceApplication.class, args);
		
		//Read the CSV file
		Report report = csvReader.readCsvfile("users.csv");
		//Save To DB
		DB.saveReport(report);
		
		System.out.println("The Report is ready!");
		System.out.println("Get the report by opening your browser on: http://localhost:8080/report");
		
	}

}
