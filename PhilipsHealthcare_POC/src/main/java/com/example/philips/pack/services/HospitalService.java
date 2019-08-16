package com.example.philips.pack.services;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.philips.pack.model.Hospital;
import com.example.philips.pack.repository.HospitalRepository;

@Service
public class HospitalService implements HospitalServiceInter{

	@Autowired
	HospitalRepository hospitalRepository;
	
	@PostConstruct
	public void  saveDummyHospitalRecords()
	{
			List<Hospital> hospitalList=new ArrayList<Hospital>();
			hospitalList.add(new Hospital("Manipal Hospitals","Heart Hospital",1));
			hospitalList.add(new Hospital("St. John's Medical college","General Hospital",2));
			hospitalList.add(new Hospital("Maruti Hospitals","General Hospital",3));
			hospitalList.add(new Hospital("Health India Hospitals","Hospital ",4));
			hospitalList.add(new Hospital("Indira Gandhi Institute Of Child Health Hospital","Children's Hospital",1));
			hospitalList.add(new Hospital("Fortis Hospital","Private Hospital",2));
			hospitalRepository.saveAll(hospitalList);
	}
	
	
	public List<Hospital> getHospitalsList()
	{
		return hospitalRepository.findAll();
		
	}
	public Optional<Hospital> getHospitalsById(int id)
	{
		return hospitalRepository.findById(id);
	}
	public Hospital createHospitals(Hospital hospital)
	{
		 hospitalRepository.save(hospital);
		 return hospital;
	}
	
	public Hospital updateHospitals(Hospital hospital)
	{
		 hospitalRepository.save(hospital);
		 return hospital;
	}
	public void deleteHospitalsById(int id)
	{
		 hospitalRepository.deleteById(id);
	}
	
	
}
