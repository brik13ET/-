import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Genre} from "../entity/genre";
import {Track} from "../entity/track";
import {environment} from "../../environments/environment";

@Injectable({
  providedIn: 'root'
})
export class GenreService {


  constructor(private http: HttpClient) {
  }

  public getAll() {
    return this.http.get<Genre[]>(`${environment.apiUrl}/genre`);
  }

  public getOne(id: number) {
    return this.http.get<Genre>(`${environment.apiUrl}/genre/${id}`);
  }

  public getTracks(id: number) {
    return this.http.get<Track[]>(`${environment.apiUrl}/genre/${id}/tracks`);
  }

}
