import { Component, OnInit } from '@angular/core';
import { Patient } from 'model/patient';
import { PatientService } from 'service/patient.service';

@Component({
  selector: 'app-patient-list',
  templateUrl: './patient-list.component.html',
  styleUrls: ['./patient-list.component.css']
})
export class PatientListComponent implements OnInit{
  patient!:Patient[];
  constructor(private patientService: PatientService)
  {
    
  }
  ngOnInit() {
    this.patientService.findAll().subscribe(data =>{
      this.patient=data;
    })
  }

}
