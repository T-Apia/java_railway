import { RouteService } from './../../services/route/route.service';
import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Route } from 'src/app/models/route';

@Component({
  selector: 'app-result',
  templateUrl: './result.component.html',
  styleUrls: ['./result.component.css']
})
export class ResultComponent implements OnInit {
  public routes: Route[] = [];
  constructor(private RouteService: RouteService) {}


  ngOnInit(): void {
      this.getRoutes();
  }

  public getRoutes(): void {
    this.RouteService.getRoutes().subscribe(
      (response: Route[]) => 
      
      {
        this.routes = response;
        console.log(response)
      },
      (error: HttpErrorResponse) =>{
        alert(error.message);
      }
    )
  }

}
