import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ChosenconfigurationComponent } from './configs/chosenconfiguration/chosenconfiguration.component';
import { ConfigComponent } from './configs/config/config.component';
import { ConfigsListComponent } from './configs/configs-list/configs-list.component';
import { HomeComponent } from './home/home/home.component';

const routes: Routes = [
  { path: '', redirectTo: '/home', pathMatch: 'full' },
  { path: 'home', component: HomeComponent },
  { path: 'addConfig', component: ConfigComponent },
  { path: 'chosenConfig', component: ChosenconfigurationComponent },
  { path: 'allConfigs', component: ConfigsListComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
