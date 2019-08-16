package com.example.philips.pack.services;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.philips.pack.model.Patient;
import com.example.philips.pack.repository.PatientRepository;

@Service
public class PatientService implements PatientServiceInter {
	
	@Autowired
	PatientRepository patientRepository;

	@PostConstruct
	public void save() throws Exception {
		List<Patient> list=new ArrayList<Patient>();
		//DateFormat df = new SimpleDateFormat("MM-dd-yyyy");
		java.util.Date dt = new java.util.Date();

		java.text.SimpleDateFormat sdf = 
		     new java.text.SimpleDateFormat("19920822");

		String d1 = sdf.format(dt);
		sdf.parse(d1);
		
		list.add(new Patient("Ashutosh",sdf.parse(d1),"Male",1));
		list.add(new Patient("Dipak chaurasiya", sdf.parse(d1),"Male",1));
		list.add(new Patient("rajan singh", sdf.parse(d1),"Male",1));
		list.add(new Patient("Manoj pajpay", sdf.parse(d1),"Male",1));
		list.add(new Patient("Hash Kumar", sdf.parse(d1),"Male",2));
		list.add(new Patient("Ashutosh",sdf.parse(d1),"Male",2));
		list.add(new Patient("Manshi chaudhari", sdf.parse(d1),"Female",2));
		list.add(new Patient("Anshika parihar", sdf.parse(d1),"Female",3));
		list.add(new Patient("Manoj pajpay", sdf.parse(d1),"Male",3));
		list.add(new Patient("Hash Kumar", sdf.parse(d1),"Male",3));
		list.add(new Patient("Dipak chaurasiya", sdf.parse(d1),"Male",2));
		list.add(new Patient("rajan singh", sdf.parse(d1),"Male",4));
		list.add(new Patient("Pratima dubey", sdf.parse(d1),"Female",2));
		list.add(new Patient("Pooja singh", sdf.parse(d1),"FeMale",4));
		list.add(new Patient("Dipak chaurasiya", sdf.parse(d1),"Male",4));
		list.add(new Patient("Radhika Avasthi", sdf.parse(d1),"Female",4));
		list.add(new Patient("Manoj pajpay", sdf.parse(d1),"Male",4));
		list.add(new Patient("Khusbu Kumari", sdf.parse(d1),"FeMale",5));
		patientRepository.saveAll(list);
	}

	@Override
	public List<Patient> getListOfPatients() {
		// TODO Auto-generated method stub
		return patientRepository.findAll();
	}

	@Override
	public Patient getPatient(int patientId) {
			Patient patient=new Patient();
		                                                          
		   // patient.setAge(age);
		    List<Patient> list= patientRepository.findAll();
		    for(Patient patient1:list)
		    {
		    	if(patient1.getPatientId().equals(patientId))
		    	{
		    		patient=patient1;
		    		 DateFormat formatter = new SimpleDateFormat("yyyyMMdd");                           
		 		    int d1 = Integer.parseInt(formatter.format(patient.getDateOfBirth()));                            
		 		    int d2 =20190122;// Integer.parseInt(formatter.format("20190122"));                          
		 		    int age = (d2 - d1) / 10000;
		    		patient.setAge(age);
		    	}
		    }
		  return patient;
	}

	@Override
	public Patient createPatient(Patient patient) {
		// TODO Auto-generated method stub
		 patientRepository.save(patient);
		 return patient;
	}

	@Override
	public Patient updatePatient(Patient patient) {
		// TODO Auto-generated method stub
		 patientRepository.save(patient);
		 return patient;
	}

	@Override
	public void deletePatient(int patientId) {
		// TODO Auto-generated method stub
		patientRepository.deleteById(patientId);
		
	}


	

}
