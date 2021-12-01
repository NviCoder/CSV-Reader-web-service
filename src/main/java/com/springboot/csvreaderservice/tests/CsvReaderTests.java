package com.springboot.csvreaderservice.tests;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.springboot.csvreaderservice.csvReader;
import com.springboot.csvreaderservice.model.Report;

public class CsvReaderTests {
	
		@Test
	    void testCsvFileWithoutAges() {
			Report report1 = csvReader.readCsvfile("testsFiles/test1.csv");
			
			assertEquals(report1.getAverageAges(),0);
			assertEquals(report1.getAgeNulls(),0);
			assertEquals(report1.getFirstNameNulls(),0);
			assertEquals(report1.getLastNameNulls(),0);
	    }
		@Test
	    void testEmptyCsvFile() {
			Report report2 = csvReader.readCsvfile("testsFiles/test2.csv");
			
			assertEquals(report2.getAverageAges(),0);
			assertEquals(report2.getAgeNulls(),0);
			assertEquals(report2.getFirstNameNulls(),0);
			assertEquals(report2.getLastNameNulls(),0);
	    }
		
}

