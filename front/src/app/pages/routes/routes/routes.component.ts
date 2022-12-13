import { StationService } from './../../../services/station/station.service';
import { Component, OnInit } from '@angular/core';
import { Station } from 'src/app/models/station';
import { HttpErrorResponse } from '@angular/common/http';


@Component({
  selector: 'app-routes',
  templateUrl: './routes.component.html',
  styleUrls: ['./routes.component.css']
})
export class RoutesComponent implements OnInit {

  public stations: Station[] = [];

  constructor(private StationService: StationService){}

  ngOnInit(): void {
      this.getStations();
  }

  public getStations(): void {
    this.StationService.getStations().subscribe(
      (response: Station[]) => 
      
      {
        this.stations = response;
        console.log(response)
      },
      (error: HttpErrorResponse) =>{
        alert(error.message);
      }
    )
  }

}
