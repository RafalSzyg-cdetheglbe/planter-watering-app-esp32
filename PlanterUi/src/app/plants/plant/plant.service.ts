import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PlantService {

  constructor(private http: HttpClient) { }


  getPlants(): Observable<any> {
    return this.http.get("http://192.168.1.108:8080/plants/getPlants");
  }
}
