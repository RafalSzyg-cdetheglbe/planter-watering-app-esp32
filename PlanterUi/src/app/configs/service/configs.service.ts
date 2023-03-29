import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Configs } from '../model/configs';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class ConfigsService {

  private apiUrl = 'http://192.168.1.108:8080/configs/addConfig'; // Replace with your backend API URL

  constructor(private http: HttpClient) { }

  submitMyForm(configsData: Configs): Observable<any> {
    return this.http.post(this.apiUrl, configsData);
  }

  getChosenConfiguration(): Observable<any> {

    return this.http.get("http://192.168.1.108:8080/configuration/getCurrentConfiguration");
  }

  getAllnConfiguration(): Observable<any> {

    return this.http.get("http://192.168.1.108:8080/configs/getAllConfigurations");
  }

  chooseConfiguration(configsData:Configs): Observable<any>{
    console.log(configsData);
    return this.http.post("http://192.168.1.108:8080/configuration/changeConfiguration", configsData);
  } 
}
