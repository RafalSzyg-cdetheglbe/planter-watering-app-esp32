import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Configs } from '../model/configs';
import { ConfigsService } from '../service/configs.service';

@Component({
  selector: 'app-configs-list',
  templateUrl: './configs-list.component.html',
  styleUrls: ['./configs-list.component.css']
})
export class ConfigsListComponent implements OnInit {

configs!:any[];


  constructor(private configService:ConfigsService,private router:Router) { }

  ngOnInit(): void {
    this.configService.getAllnConfiguration().subscribe(config=>
      {this.configs=config})
      console.log('Config data:', this.configs);
  }

  chooseConfig(config: any) {
    this.configService.chooseConfiguration(config).subscribe();
    this.router.navigate(['/home']);
    };

}

