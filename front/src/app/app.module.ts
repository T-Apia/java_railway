import { StationService } from './services/station/station.service';
import { NgModule, Component } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {platformBrowserDynamic} from '@angular/platform-browser-dynamic';
import { RouterModule, Routes } from '@angular/router';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { ToolbarComponent } from './components/toolbar/toolbar/toolbar.component';

import { MatToolbarModule } from  '@angular/material/toolbar';
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





@NgModule({
  declarations: [
    AppComponent,
    ToolbarComponent,
    HomeComponent,
    RoutesComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatToolbarModule,
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
    MatSelectModule
  ],
  providers: [
    AppComponent, HttpClientModule
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }


