import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Data } from '@angular/router';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class SingleSensorServiceService {

  private moistureurl = 'http://192.168.1.108:8080/moisture/getLastTenReadings';

  constructor(private http: HttpClient) { }

  getMoistureData(): Observable<Data[]> {
    return this.http.get<Data[]>(this.moistureurl);
  }
}
