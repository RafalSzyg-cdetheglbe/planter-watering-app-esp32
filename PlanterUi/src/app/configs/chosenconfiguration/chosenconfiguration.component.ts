import { Component, OnInit } from '@angular/core';
import { Configs } from '../model/configs';
import { ConfigsService } from '../service/configs.service';

@Component({
  selector: 'app-chosenconfiguration',
  templateUrl: './chosenconfiguration.component.html',
  styleUrls: ['./chosenconfiguration.component.css'],
})
export class ChosenconfigurationComponent implements OnInit {

  config!: Configs;

  constructor(private configService:ConfigsService) { }

  ngOnInit(): void {
    this.configService.getChosenConfiguration().subscribe(config=>
    {this.config=config})
    console.log('Config data:', this.config);
  }

}
