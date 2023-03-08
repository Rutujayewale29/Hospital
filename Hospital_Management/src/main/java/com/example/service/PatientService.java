package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.model.Patient;

@Service
public interface PatientService
{
 Patient addPatient(Patient patient);
 List<Patient> findAllPatient();
 void deletePatient(int id);
 Patient updatePatient(Patient patient);
 Patient findBytid(int id);
 List<Patient> findByname(String name);
 List<Patient> findByemail(String email);
}
