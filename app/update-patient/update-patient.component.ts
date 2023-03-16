import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Patient } from 'model/patient';
import { PatientService } from 'service/patient.service';

@Component({
  selector: 'app-update-patient',
  templateUrl: './update-patient.component.html',
  styleUrls: ['./update-patient.component.css']
})
export class UpdatePatientComponent {
  patient: Patient;
  id:any;
  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private patientService: PatientService)
    {
      this.patient=new Patient();
    }
    updatePatient(patient:Patient)
    {
      let id=parseInt(patient.id);
      this.patientService.update(this.patient,id).subscribe(result=>{
        console.log("Update Patient"+result);
        this.gotoPatientList()
      });
    }
    gotoPatientList(){
      this.router.navigate(['../']);
    }
  

}
