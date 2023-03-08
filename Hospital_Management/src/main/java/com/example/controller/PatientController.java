package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Patient;
import com.example.service.PatientService;

@RestController
public class PatientController 
{
	@Autowired(required=true)
    PatientService patientService;
	@PostMapping("/patient")
	public Patient addPatient(@RequestBody Patient patient)
	{
		System.out.println(patient.getName());
		return patientService.addPatient(patient);
	}
	@GetMapping("/patient")
	public List<Patient> findAllPatient()
	{
		return patientService.findAllPatient();
	}
	@GetMapping("/patient/{id}")
	public Patient findByid(@PathVariable int id)
	{
		return patientService.findBytid(id);
	}
	@GetMapping("/patient/api/{name}")
	public List<Patient> findByname(@PathVariable String name)
	{
		return patientService.findByname(name);
	}
	@GetMapping("/patient/Email/{email}")
	public List<Patient> findByemail(@PathVariable String email)
	{
		return patientService.findByemail(email);
	}
	@DeleteMapping("/patient/{id}")
	public String deletePatient(@PathVariable int id)
	{
		patientService.deletePatient(id);
		return "Patient is deleted";	
	}
	@PutMapping("/patient")
	public Patient updatePatient(@RequestBody Patient patient)
	{
		
		return patientService.updatePatient(patient);
		
	}
}
