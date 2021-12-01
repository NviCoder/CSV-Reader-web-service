package com.springboot.csvreaderservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * This Class is the template/ model for our report
 *
 */
@Entity

@Table
public class Report {
	
	@Id
	@Column
	private int id;
	@Column
	private double averageAges;
	@Column
	private int firstNameNulls;
	@Column
	private int lastNameNulls;
	@Column
	private int ageNulls;
	
	
	public Report() {}
	
	public Report(int id, double averageAges, int[]numberOfNullsPerColumn) {
		this.id = id;
		this.averageAges = averageAges;
		this.firstNameNulls = numberOfNullsPerColumn[0];
		this.lastNameNulls = numberOfNullsPerColumn[1];
		this.ageNulls = numberOfNullsPerColumn[2];
	}




	@Override
	public String toString() {
		return "Report [id=" + id + ", averageAges=" + averageAges + ", firstNameNulls=" + firstNameNulls
				+ ", lastNameNulls=" + lastNameNulls + ", ageNulls=" + ageNulls + "]";
	}

	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public double getAverageAges() {
		return averageAges;
	}




	public void setAverageAges(int averageAges) {
		this.averageAges = averageAges;
	}




	public int getFirstNameNulls() {
		return firstNameNulls;
	}




	public void setFirstNameNulls(int firstNameNulls) {
		this.firstNameNulls = firstNameNulls;
	}




	public int getLastNameNulls() {
		return lastNameNulls;
	}




	public void setLastNameNulls(int lastNameNulls) {
		this.lastNameNulls = lastNameNulls;
	}




	public int getAgeNulls() {
		return ageNulls;
	}




	public void setAgeNulls(int ageNulls) {
		this.ageNulls = ageNulls;
	}



}
