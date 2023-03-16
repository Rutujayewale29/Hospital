import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Patient } from 'model/patient';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PatientService {
private patientUrl:string;
  constructor(private http: HttpClient) {
    this.patientUrl='http://localhost:1090/patient';
   }
   public findAll(): Observable<Patient[]>{
    return this.http.get<Patient[]>(this.patientUrl);
   }
   public save(patient: Patient){
    return this.http.post<Patient>(this.patientUrl,patient);
   }
   public update(patient: Patient,id:number):Observable<Object>{
    return this.http.put('${this.patientUrl}/${id}',patient);
   }
   public delete(id:number):Observable<Object>{
    return this.http.delete('${this.patientUrl}/${id}');
   }
}
