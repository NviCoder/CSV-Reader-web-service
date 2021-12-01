package com.springboot.csvreaderservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.csvreaderservice.model.Report;
/**
 * This interface defines the base CRUD operations.
 *
 */
public interface ReportRepository extends CrudRepository<Report, Integer> {


}
