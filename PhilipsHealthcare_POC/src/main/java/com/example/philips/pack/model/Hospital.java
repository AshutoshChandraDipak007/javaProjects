package com.example.philips.pack.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name="Hospital")
@Entity
public class Hospital {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer hospitalId;
	private String Name;
	private String description;
	private Integer doctorId;
	
	@OneToMany(cascade=CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="hospitalId",referencedColumnName="hospitalId")
	private List<Patient> patient;
	
	
	public List<Patient> getPatient() {
		return patient;
	}


	public Integer getDoctorId() {
		return doctorId;
	}


	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}


	public void setPatient(List<Patient> patient) {
		this.patient = patient;
	}


	public Hospital() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hospital(String name, String description, Integer doctorId) {
		super();
		Name = name;
		this.description = description;
		this.doctorId = doctorId;
	}


	public Integer getHospitalId() {
		return hospitalId;
	}


	public void setHospitalId(Integer hospitalId) {
		this.hospitalId = hospitalId;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	@Override
	public String toString() {
		return "Hospital [hospitalId=" + hospitalId + ", Name=" + Name + ", description=" + description + "]";
	}
	
	
	
	
	
}
