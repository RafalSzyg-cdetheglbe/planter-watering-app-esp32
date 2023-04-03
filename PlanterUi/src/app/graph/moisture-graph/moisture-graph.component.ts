import { Component, OnInit, ViewChild } from '@angular/core';
import { Chart, registerables } from 'chart.js';
import { SingleSensorServiceService } from '../single-sensor-service.service';

@Component({
  selector: 'app-moisture-graph',
  templateUrl: './moisture-graph.component.html',
  styleUrls: ['./moisture-graph.component.css'],
})
export class MoistureGraphComponent implements OnInit {

  @ViewChild('myChart') myChart: any;

  constructor(private singleSensorService:SingleSensorServiceService) {Chart.register(...registerables); }

  ngOnInit(): void {
    this.singleSensorService.getMoistureData().subscribe(data => {
      const values = data.map(item => item['value']);
      const dates = data.map(item => item['date']);
  
      const chartData = {
        labels: dates,
        datasets: [{
          label: 'Moisture in %',
          data: values,
          fill: true,
          borderColor: 'rgb(0, 0, 0)',
          tension: 0.1,
        }]
      };
  
      
      const chartOptions = {
        backgroundColor: 'rgb(	39, 174, 96)',
        responsive:true,
        scales: {
          y: {
            min: 0,
            max: 100,
            ticks: {
              stepSize: 10
            }
          },
          x: {
          display: false
          }
        },
        title: {
          display: true,
          text: 'Moisture Data Chart'
        },
        legend: {
          display: false,
          position: 'bottom'
        },
      };
      
      const myChart = new Chart(this.myChart.nativeElement, {
        type: 'line',
        data: chartData,
        options: chartOptions
      });
    });
  }
}
