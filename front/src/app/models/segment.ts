export interface Station {
    id: number;
    name: string;
    distance: number;
    duration: number;
    route: number;
    station_from: number[]; 
    station_to: number[]
}