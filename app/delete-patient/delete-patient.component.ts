import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Patient } from 'model/patient';
import { PatientService } from 'service/patient.service';

@Component({
  selector: 'app-delete-patient',
  templateUrl: './delete-patient.component.html',
  styleUrls: ['./delete-patient.component.css']
})
export class DeletePatientComponent {
patient: Patient;
constructor(
  private route:ActivatedRoute,
  private router: Router,
  private patientService: PatientService){
    this.patient=new Patient();
  }
  DeletePatient(pid:string){
    let id=parseInt(pid);
    this.patientService.delete(id).subscribe(result=>this.gotoPatientList());
  }
  gotoPatientList(){
    this.router.navigate(['../']);
  }
}
