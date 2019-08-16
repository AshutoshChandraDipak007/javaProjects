package com.example.philips.pack.services;

import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.philips.pack.model.PatientExamination;
import com.example.philips.pack.repository.PatientExaminationRepository;

@Service
public class PatientExamServiceImplementation implements PatientExaminationService {

	@Autowired
	PatientExaminationRepository examRepository;

	@PostConstruct
	public void saveDummyPatientExaminationRecords() throws Exception {
		//List<PatientExamination> list = new ArrayList<PatientExamination>();
		
		//DateFormat df = new SimpleDateFormat("MM-dd-yyyy");
		java.util.Date dt = new java.util.Date();
		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String d1 = sdf.format(dt);
		sdf.parse(d1);
		// PatientExamination exam= new PatientExamination(77770,
		// sdf.parse(d1),"harish",sdf.parse(d1),"diebaties",564.89F,7654.90F,9000);
		PatientExamination patientDetails = new PatientExamination();
		//patientDetails.setPatientId(9000);
		
		patientDetails.setDateOfBirth(sdf.parse(d1));
		patientDetails.setExamDate(sdf.parse(d1));
		patientDetails.setName("Harish");
		patientDetails.setWeight(76.30F);
		patientDetails.setHeight(6.5F);
		
		PatientExamination patientDetails1 = new PatientExamination();
		//patientDetails.setPatientId(9000);
		
		patientDetails1.setDateOfBirth(sdf.parse(d1));
		patientDetails1.setExamDate(sdf.parse(d1));///
		patientDetails1.setName("Harish");
		patientDetails1.setWeight(76.30F);
		patientDetails1.setHeight(6.5F);
		
		examRepository.save(patientDetails);
		examRepository.save(patientDetails1);

	}

	@Override
	public List<PatientExamination> getPatientExaminationList() {
		// TODO Auto-generated method stub
		return examRepository.findAll();
	}

	@Override
	public Optional<PatientExamination> getPatientExaminationById(int examId) {

		return examRepository.findById(examId);
	}

	@Override
	public PatientExamination createPatientExamination(PatientExamination patientExam) {

		return examRepository.save(patientExam);
	}

	@Override
	public PatientExamination updatePatientExamination(PatientExamination patientExam) {

		return examRepository.save(patientExam);
	}

	@Override
	public void deletePatientExaminationById(int id) {

		examRepository.deleteById(id);
	}

}
