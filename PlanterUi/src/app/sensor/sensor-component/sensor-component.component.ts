import { Component, OnInit } from '@angular/core';
import { Sensor } from '../model/sensor';
import { SensorService } from '../service/sensor.service';

@Component({
  selector: 'app-sensor-component',
  templateUrl: './sensor-component.component.html',
  styleUrls: ['./sensor-component.component.css']
})
export class SensorComponentComponent implements OnInit {

  sensor!:Sensor;

  constructor(private sensorService:SensorService) { }

  ngOnInit(): void {
    this.sensorService.getAllSensorsInfo()
    .subscribe(s => this.sensor = s);
  }

}
