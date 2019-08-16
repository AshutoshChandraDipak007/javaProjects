package com.example.philips.pack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.philips.pack.model.Patient;
import com.example.philips.pack.services.PatientService;


@RestController
@RequestMapping("api/")
public class PatientController {

	@Autowired
	PatientService patientService;

	@GetMapping("getPatients")
	public List<Patient> getListOfPatients() {
		
		return patientService.getListOfPatients();
	}

	@GetMapping("getPatient/{patientId}")
	public Patient getPatient(@PathVariable int patientId) {
		
		return patientService.getPatient(patientId);
	}

	@PostMapping("createPatient")
	public Patient createPatient(Patient patient) throws Exception {
		
		patientService.createPatient(patient);
		return patient;
	}
	@PutMapping("updatePatient")
	public Patient updatePatient(Patient patient) throws Exception {
		
		patientService.updatePatient(patient);
		return patient;
	}

	@DeleteMapping("deletePatient")
	public void deletePatient(int patientId) {
		
		patientService.deletePatient(patientId);
	}



	
	
	
}
