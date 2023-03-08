package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Patient;

public interface PatientRepository extends JpaRepository<Patient,Integer> 
{
 public List<Patient> findByname(String name);
 public List<Patient> findByemail(String email);
}
