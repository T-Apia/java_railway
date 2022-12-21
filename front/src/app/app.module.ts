import { StationService } from './services/station/station.service';
import { NgModule, Component } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {platformBrowserDynamic} from '@angular/platform-browser-dynamic';
import { RouterModule, Routes } from '@angular/router';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { MatToolbarModule } from  '@angular/material/toolbar';
import { MatTooltipModule } from  '@angular/material/tooltip';

import { MatCommonModule } from '@angular/material/core';
import { MatIconModule } from '@angular/material/icon';
import { MatSidenavModule } from '@angular/material/sidenav';
import { MatMenuModule } from '@angular/material/menu';
import { MatButtonModule } from '@angular/material/button';

import { MatListModule } from '@angular/material/list';
import { MatTableModule } from '@angular/material/table';
import { HomeComponent } from './pages/home/home/home.component';
import { RoutesComponent } from './pages/routes/routes/routes.component';
import { HttpClientModule } from '@angular/common/http';
import { MatCardModule } from '@angular/material/card';
import { MatFormFieldModule } from '@angular/material/form-field';
import {MatInputModule} from '@angular/material/input';
import {MatAutocompleteModule} from '@angular/material/autocomplete';
import {MatDatepickerModule} from '@angular/material/datepicker';
import {MatNativeDateModule} from '@angular/material/core';
import {MatGridListModule} from '@angular/material/grid-list';
import {MatSelectModule} from '@angular/material/select';
import {MatDialogModule, MAT_DIALOG_DATA} from '@angular/material/dialog';
import {MatButtonToggleModule} from '@angular/material/button-toggle';
import {MatSnackBarModule} from '@angular/material/snack-bar';
import { AccountComponent } from './pages/account/account/account.component';
import { ResultComponent } from './pages/result/result.component';




@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    RoutesComponent,
    AccountComponent,
    ResultComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatToolbarModule,
    MatTooltipModule,
    MatCommonModule,
    MatIconModule,
    MatSidenavModule,
    MatButtonModule,
    MatMenuModule,
    MatListModule,
    MatTableModule,
    HttpClientModule,
    MatCardModule,
    MatFormFieldModule,
    FormsModule,
    ReactiveFormsModule,
    MatInputModule,
    MatAutocompleteModule,
    MatDatepickerModule,
    MatNativeDateModule,
    MatGridListModule,
    MatSelectModule,
    MatDialogModule,
    MatButtonToggleModule,
    MatSnackBarModule
  ],
  providers: [
    AppComponent, HttpClientModule
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }


