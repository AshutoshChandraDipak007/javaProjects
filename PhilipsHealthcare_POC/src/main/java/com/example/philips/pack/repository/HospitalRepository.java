package com.example.philips.pack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.philips.pack.model.Hospital;

public interface HospitalRepository extends JpaRepository<Hospital,Integer> {

}
