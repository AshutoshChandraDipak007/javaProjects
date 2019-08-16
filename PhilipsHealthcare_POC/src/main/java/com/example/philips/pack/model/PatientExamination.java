package com.example.philips.pack.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table
@JsonIgnoreProperties(value= {"dateOfBirth","weight","height"})
public class PatientExamination {
	 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer examId;
	private Date examDate;
	@JsonIgnore
	private String name;
	private Date dateOfBirth;
	private String descriptions;
	private float weight;
	private float height;
	
	public PatientExamination() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public PatientExamination(Date examDate, String name, Date dateOfBirth, String descriptions,float weight, float height) 
	{
		this.examDate = examDate;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.descriptions = descriptions;
		this.weight = weight;
		this.height = height;
		
	}

	public Date getExamDate() {
		return examDate;
	}

	public void setExamDate(Date examDate) {
		this.examDate = examDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getDescriptions() {
		return descriptions;
	}

	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	
	
}
