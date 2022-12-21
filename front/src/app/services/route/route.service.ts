import { Route } from './../../models/route';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class RouteService {

  private apiServerUrl = 'http://localhost:8080';
  
  private httpOptions = {
    headers: new HttpHeaders({
      'Authorization': 'Basic ' + btoa('admin:admin')
    })
  };

  constructor(private http: HttpClient) { }

  public getRoutes(): Observable<Route[]>{
    return this.http.get<Route[]>(`${this.apiServerUrl}/route/all`, this.httpOptions);
  }
  public addRoute(route: Route): Observable<Route>{
    return this.http.post<Route>(`${this.apiServerUrl}/route/add`, route);
  }
  public updateRoute(route: Route): Observable<Route>{
    return this.http.put<Route>(`${this.apiServerUrl}/route/update`, route);
  }
  public deleteRoute(routeId: number): Observable<void>{
    return this.http.delete<void>(`${this.apiServerUrl}/route/delete/${routeId}`);
  }
}
