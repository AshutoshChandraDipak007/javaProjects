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

import com.example.philips.pack.model.Hospital;
import com.example.philips.pack.services.HospitalService;

@RestController
@RequestMapping("api")
public class HospitalController {
	
	@Autowired
	HospitalService hospitalService;
	
	@GetMapping("/getHospitals")
	public List<Hospital> getHospitalsList()
	{
		return hospitalService.getHospitalsList();
	}
	
	@GetMapping("/getHospital/{id}")
	public Optional<Hospital> getHospitals(@PathVariable int id)
	{
		return hospitalService.getHospitalsById(id);
	}
	
	@PostMapping("/createHospital")
	public List<Hospital> createHospital(@RequestBody Hospital hospital)
	{
		 hospitalService.createHospitals(hospital);
		 
		 return hospitalService.getHospitalsList();
	}
	@PutMapping("/updateHospital")
	public Hospital updateHospital(@RequestBody Hospital hospital)
	{
		 hospitalService.createHospitals(hospital);
		 return hospital;
	}
	
	@DeleteMapping("/deleteHospital/{id}")
	public void deleteHospitalByHid(@PathVariable int id)
	{
		hospitalService.deleteHospitalsById(id);
	}
}
