import { Component } from '@angular/core';
import {MatDialog} from '@angular/material/dialog';

@Component({
  selector: 'app-account',
  templateUrl: './account.component.html',
  styleUrls: ['./account.component.css']
})
export class AccountComponent {
  constructor(public dialog: MatDialog) {}

  openDialog() {
    this.dialog.open(DialogElementsExampleDialog);
  }

}


@Component({
  selector: 'example-dialog',
  templateUrl: './example-dialog.html',
})
export class DialogElementsExampleDialog {}

