import { Component, Inject, OnInit } from '@angular/core';
import { HttpErrorResponse } from '@angular/common/http';
import { FormControl } from '@angular/forms';
import { map, Observable, startWith } from 'rxjs';
import { MatDialog, MAT_DIALOG_DATA } from '@angular/material/dialog';


@Component({
  selector: 'app-routes',
  templateUrl: './routes.component.html',
  styleUrls: ['./routes.component.css']
})
export class RoutesComponent implements OnInit {

  myControl = new FormControl('');
  options: string[] = ['Madrid', 'Barcelona', 'Granada'];
  filteredOptions: Observable<string[]> | undefined;

  constructor(
    public dialog: MatDialog){}
  

  ngOnInit(): void {
      this.filteredOptions = this.myControl.valueChanges.pipe(
        startWith(''),
        map(value => this._filter(value || '')),
      );      
  }
  public _filter(value: string): string[] {
    const filterValue = value.toLowerCase();

    return this.options.filter(option => option.toLowerCase().includes(filterValue));
  }


}

