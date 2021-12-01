package com.springboot.csvreaderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.csvreaderservice.model.Report;
import com.springboot.csvreaderservice.service.ReportService;


/**
 * This Controller expose an endpoint that returns a the given report
 */
@RestController
public class ReportContorller {
	
	@Autowired  
	ReportService reportService;  
	
	@GetMapping("/report")
	public Report getReport() {
		return reportService.getReport();
	}

}
