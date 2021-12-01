package com.springboot.csvreaderservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.csvreaderservice.model.Report;
import com.springboot.csvreaderservice.repository.ReportRepository;

/**
 * This Service class will have the controller needs for
 * get the report from DB. 
 */
@Service
public class ReportService {
	
	@Autowired  
	ReportRepository reportRepository;
	
	public Report getReport()   
	{
		return reportRepository.findById(1).isPresent() ? reportRepository.findById(1).get() : null  ;  
	}
	

	
	

}
