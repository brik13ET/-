import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {environment} from "../../environments/environment";
import {Album} from "../entity/album";

@Injectable({
  providedIn: 'root'
})
export class AlbumService {

  constructor(private http: HttpClient) { }

  public create(dto: Album)
  {
    return this.http.post<Album>(`${environment.apiUrl}/${dto.artist_id}/album`, dto);
  }

  public getAll(artist: number)
  {
    return this.http.get<Album[]>(`${environment.apiUrl}/${artist}/album`);
  }

  public getOne(artist: number, album: number)
  {
    return this.http.get<Album>(`${environment.apiUrl}/${artist}/album/${album}`);
  }

  public update(dto: Album)
  {
    return this.http.put<Album>(`${environment.apiUrl}/${dto.artist_id}/album/${dto.id}`, dto);
  }

  public delete(artist: number, album: number)
  {
    return this.http.delete<void>(`${environment.apiUrl}/${artist}/album/${album}`);
  }

}
