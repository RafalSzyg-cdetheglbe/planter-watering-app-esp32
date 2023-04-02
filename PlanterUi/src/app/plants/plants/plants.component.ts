import { Component, OnInit } from '@angular/core';
import { Plant } from '../plant';
import { PlantService } from '../plant/plant.service';
import { ConfigsService } from 'src/app/configs/service/configs.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-plants',
  templateUrl: './plants.component.html',
  styleUrls: ['./plants.component.css']
})
export class PlantsComponent implements OnInit {

plants!:any;

  constructor(private plantService:PlantService, private configService:ConfigsService, private router:Router) { }

  ngOnInit(): void {
    this.plantService.getPlants().subscribe(plant=>
      {this.plants=plant});
  }

  chooseConfig(config: any) {
    this.configService.chooseConfiguration(config).subscribe();
    this.router.navigate(['/home']);
    };

}
