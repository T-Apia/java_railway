import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AccountComponent } from './pages/account/account/account.component';
import { HomeComponent } from './pages/home/home/home.component';
import { ResultComponent } from './pages/result/result.component';
import { RoutesComponent } from './pages/routes/routes/routes.component';

const routes: Routes = [
  { path: 'home', component: HomeComponent},
  { path: 'routes', component: RoutesComponent },
  { path: 'account', component: AccountComponent },
  { path: 'result', component: ResultComponent }
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

