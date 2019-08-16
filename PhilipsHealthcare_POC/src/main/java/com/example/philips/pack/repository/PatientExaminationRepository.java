package com.example.philips.pack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.philips.pack.model.PatientExamination;

public interface PatientExaminationRepository extends JpaRepository<PatientExamination,Integer> {

}
