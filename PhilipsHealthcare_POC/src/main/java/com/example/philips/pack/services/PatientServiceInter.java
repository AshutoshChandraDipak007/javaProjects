package com.example.philips.pack.services;

import java.util.List;

import com.example.philips.pack.model.Patient;

public interface PatientServiceInter {

	//public void save() throws Exception;
	public List<Patient> getListOfPatients();
	public Patient getPatient(int patientId);
	//public Patient createpatient(Patient patient);
	public Patient updatePatient(Patient patient);
	public void deletePatient(int patientId);
	Patient createPatient(Patient patient);
}
