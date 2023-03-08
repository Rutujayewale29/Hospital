package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.model.Patient;
import com.example.repository.PatientRepository;
import com.example.service.PatientService;
@Repository
public class PatientServiceImpl implements PatientService
{
	@Autowired(required=true)
	PatientRepository patientRepository;
	public Patient addPatient(Patient patient) {
		// TODO Auto-generated method stub
		
		return patientRepository.save(patient);
	}
	public List<Patient> findAllPatient() {
		// TODO Auto-generated method stub
		return patientRepository.findAll();
	}
	public void deletePatient(int id) {
		// TODO Auto-generated method stub
		patientRepository.deleteById(id);
	}
	public Patient updatePatient(Patient patient) {
		// TODO Auto-generated method stub
		Patient _patient=patientRepository.findById(patient.getId()).get();
		_patient.setId(patient.getId());
		_patient.setName(patient.getName());
		_patient.setMobno(patient.getMobno());
		return patientRepository.save(_patient);
	}
	@Override
	public List<Patient> findByname(String name) {
		// TODO Auto-generated method stub
		return patientRepository.findByname(name);
	}
	@Override
	public List<Patient> findByemail(String email) {
		// TODO Auto-generated method stub
		return patientRepository.findByemail(email);
	}
	@Override
	public Patient findBytid(int id) {
		// TODO Auto-generated method stub
		return patientRepository.findById(id).get();
	}
	
}
