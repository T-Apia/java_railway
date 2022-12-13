import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { Station } from "../models/station";
import { HttpClient } from '@angular/common/http';

@Injectable({
    providedIn: 'root'
})
export class StationService{
    private apiServerUrl = 'http://localhost:8080';

    constructor(private http: HttpClient) {}

    public getStations(): Observable<Station>{
        return this.http.get<Station>(`${this.apiServerUrl}/station/all`);
    }
    public addStation(station: Station): Observable<Station>{
        return this.http.post<Station>(`${this.apiServerUrl}/station/add`, station);
    }
    public updateStation(station: Station): Observable<Station>{
        return this.http.put<Station>(`${this.apiServerUrl}/station/update`, station);
    }
    public deleteStation(stationId: number): Observable<void>{
        return this.http.delete<void>(`${this.apiServerUrl}/station/delete/${stationId}`);
    }
}