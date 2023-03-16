import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DeletePatientComponent } from './delete-patient/delete-patient.component';
import { PatientFormComponent } from './patient-form/patient-form.component';
import { PatientListComponent } from './patient-list/patient-list.component';
import { UpdatePatientComponent } from './update-patient/update-patient.component';

const routes: Routes = [
  {path: 'patient',component:PatientListComponent},
  {path:'addpatient',component:PatientFormComponent},
  {path:'updatepatient',component:UpdatePatientComponent},
  {path:'deletepatient',component:DeletePatientComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
