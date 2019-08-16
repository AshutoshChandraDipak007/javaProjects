package com.example.philips.pack.services;

import java.util.List;
import java.util.Optional;

import com.example.philips.pack.model.Hospital;

public interface HospitalServiceInter {

	public void  saveDummyHospitalRecords();
	public List<Hospital> getHospitalsList();
	public Optional<Hospital> getHospitalsById(int id);
	public Hospital createHospitals(Hospital hospital);
	public Hospital updateHospitals(Hospital hospital);
	public void deleteHospitalsById(int id);
	
}
