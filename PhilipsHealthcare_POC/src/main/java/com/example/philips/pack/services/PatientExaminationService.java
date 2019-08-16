package com.example.philips.pack.services;

import java.util.List;
import java.util.Optional;

import com.example.philips.pack.model.PatientExamination;

public interface PatientExaminationService 
{
	//public void  saveDummyPatientExaminationRecords();
	public List<PatientExamination> getPatientExaminationList();
	public Optional<PatientExamination> getPatientExaminationById(int id);
	public PatientExamination createPatientExamination(PatientExamination hospital);
	public PatientExamination updatePatientExamination(PatientExamination hospital);
	public void deletePatientExaminationById(int id);
	
}
