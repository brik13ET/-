import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {environment} from "../../environments/environment";
import {Artist} from "../entity/artist";

@Injectable({
  providedIn: 'root'
})
export class ArtistService {

  constructor(private http: HttpClient) { }

  public create(dto: Artist)
  {
    return this.http.post<Artist>(`${environment.apiUrl}/artist/${dto.id}`, dto);
  }

  public getAll()
  {
    return this.http.get<Artist[]>(`${environment.apiUrl}/artist`);
  }

  public getOne(id: number)
  {
    return this.http.get<Artist>(`${environment.apiUrl}/artist/${id}`);
  }

  public update(dto: Artist)
  {
    return this.http.put<Artist>(`${environment.apiUrl}/artist/${dto.id}`, dto);
  }

  public delete(id: number)
  {
    return this.http.delete<void>(`${environment.apiUrl}/artist/${id}`);
  }

}
