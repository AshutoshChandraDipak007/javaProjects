package com.example.philips.pack.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.philips.pack.model.PatientExamination;
import com.example.philips.pack.services.PatientExamServiceImplementation;

@RestController
@RequestMapping("api/")
public class PatientExamController {
	
	@Autowired
	PatientExamServiceImplementation patientExamServiceImp;
	
	@GetMapping("getPatientExams")
	public List<PatientExamination> getPatientExaminationList()
	{
		return patientExamServiceImp.getPatientExaminationList();
		
	}
	
	@GetMapping("getPatientExam/{id}")
	public Optional<PatientExamination> getPatientExaminationById(@PathVariable int id)
	{
		return patientExamServiceImp.getPatientExaminationById(id);
		
	}
	
	@PostMapping("createPatientExam")
	public PatientExamination createPatientExamination(@RequestBody PatientExamination exam)
	{
		  patientExamServiceImp.createPatientExamination(exam);
		  return exam;
	}
	@PutMapping("updatePatientExam")
	public PatientExamination updatePatientExamination(@RequestBody PatientExamination exam)
	{
		  patientExamServiceImp.createPatientExamination(exam);
		  return exam;
	}
	
	@DeleteMapping("deletePatientExam/{id}")
	public void deletePatientExamination(@PathVariable int id)
	{
		  patientExamServiceImp.deletePatientExaminationById(id);
	}

}
