import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './pages/home/home/home.component';
import { RoutesComponent } from './pages/routes/routes/routes.component';

const routes: Routes = [
  { path: 'home', component: HomeComponent},
  { path: 'routes', component: RoutesComponent }
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
