import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Configs } from '../model/configs';
import { ConfigsService } from '../service/configs.service';

@Component({
  selector: 'app-config',
  templateUrl: './config.component.html',
  styleUrls: ['./config.component.css']
})
export class ConfigComponent implements OnInit {

  myForm!: FormGroup;

  constructor(private formBuilder: FormBuilder, private configsService:ConfigsService,private router: Router) { }

  ngOnInit() {
    this.myForm = this.formBuilder.group({
      name: ['', Validators.required],
      moistureStarter: ['', Validators.required],
      insolationStarter: ['', Validators.required],
      temperatureStarter: ['', Validators.required]
    });
  }

  onSubmit() {
    const formData = this.myForm.value;
    const myClassData = new Configs(formData.name, formData.moistureStarter, formData.insolationStarter, formData.temperatureStarter);
    this.configsService.submitMyForm(myClassData).subscribe();
    this.router.navigate(['/home']);
  }
}

