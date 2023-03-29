import { CommonModule } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ChosenconfigurationComponent } from './configs/chosenconfiguration/chosenconfiguration.component';
import { ConfigComponent } from './configs/config/config.component';
import { HomeComponent } from './home/home/home.component';
import { ConfigsListComponent } from './configs/configs-list/configs-list.component';


@NgModule({
  declarations: [
    AppComponent,
     ConfigComponent,
     HomeComponent,
     ChosenconfigurationComponent,
     ConfigsListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    CommonModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
