import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class SensorService {
  

  constructor(private http: HttpClient) { }


  getAllSensorsInfo(): Observable<any> {
    return this.http.get("http://192.168.1.108:8080/sensors/getAllSensorInfo");
  }
}
