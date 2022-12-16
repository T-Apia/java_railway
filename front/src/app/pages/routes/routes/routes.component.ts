import { StationService } from './../../../services/station/station.service';
import { Component, OnInit } from '@angular/core';
import { Station } from 'src/app/models/station';
import { HttpErrorResponse } from '@angular/common/http';
import { FormControl } from '@angular/forms';
import { map, Observable, startWith } from 'rxjs';

@Component({
  selector: 'app-routes',
  templateUrl: './routes.component.html',
  styleUrls: ['./routes.component.css']
})
export class RoutesComponent implements OnInit {

  public stations: Station[] = [];
  myControl = new FormControl('');
  options: string[] = ['Madrid', 'Barcelona', 'Granada'];
  filteredOptions: Observable<string[]> | undefined;

  constructor(private StationService: StationService){}

  ngOnInit(): void {
      this.getStations();
      this.filteredOptions = this.myControl.valueChanges.pipe(
        startWith(''),
        map(value => this._filter(value || '')),
      );
      
  }
  public _filter(value: string): string[] {
    const filterValue = value.toLowerCase();

    return this.options.filter(option => option.toLowerCase().includes(filterValue));
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
