package com.example.philips.pack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.philips.pack.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer> {

}
