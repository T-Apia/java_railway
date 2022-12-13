import { Station } from './models/station';
import { StationService } from './services/station.service';
import { Component, OnInit } from '@angular/core';
import { HttpErrorResponse } from '@angular/common/http';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'railway-front';

  public stations: Station[];

  constructor(private stationService: StationService) {}

  ngOnInit(): void {
      this.getStations();
  }

  public getStations(): void {
    this.stationService.getStations().subscribe((response) => {
        this.stations = response
      }),
      (error: HttpErrorResponse) => {
        alert(error.message)
      };
    
  }
}
