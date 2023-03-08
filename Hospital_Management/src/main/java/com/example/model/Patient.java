package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="patient_data")
public class Patient 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
 private int id;
 private String name;
 private long mobno;
 private String email;
 
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Patient() {
	
	// TODO Auto-generated constructor stub
}

public Patient(int id, String name, long mobno) {
	super();
	this.id = id;
	this.name = name;
	this.mobno = mobno;
	
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getMobno() {
	return mobno;
}
public void setMobno(long mobno) {
	this.mobno = mobno;
}
 
}
