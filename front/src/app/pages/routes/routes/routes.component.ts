import { StationService } from './../../../services/station/station.service';
import { Component, Inject, OnInit } from '@angular/core';
import { Station } from 'src/app/models/station';
import { HttpErrorResponse } from '@angular/common/http';
import { FormControl } from '@angular/forms';
import { map, Observable, startWith } from 'rxjs';
import { MatDialog, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { NgZone } from '@angular/core';


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

  constructor(private StationService: StationService,
    public dialog: MatDialog,
    private zone: NgZone){}
  

  ngOnInit(): void {
      this.getStations();
      this.filteredOptions = this.myControl.valueChanges.pipe(
        startWith(''),
        map(value => this._filter(value || '')),
      );
      this.openSearch();
      
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
  public openSearch() {
    this.zone.run(() => {
      this.dialog.open(DialogDataExampleDialog, {
        data: {
          animal: 'panda',
        },
        width: '250px' 
      });
      console.log("This works!")
    });
  }
}

export interface DialogData {
  animal: 'panda' | 'unicorn' | 'lion';
}

@Component({
  selector: 'dialog',
  templateUrl: 'dialog.html',
})
export class DialogDataExampleDialog {
  constructor(@Inject(MAT_DIALOG_DATA) public data: DialogData) {}
}

