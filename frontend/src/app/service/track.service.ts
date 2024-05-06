import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Track} from "../entity/track";
import {environment} from "../../environments/environment";
import {Album} from "../entity/album";

@Injectable({
  providedIn: 'root'
})
export class TrackService {

  constructor(private http: HttpClient) { }

  public create(album: Album, dto: Track)
  {
    return this.http.post<Track>(`${environment.apiUrl}/artist/${album.artist_id}/album/${album.id}/track`, dto);
  }

  public getAll(album: Album)
  {
    return this.http.get<Track[]>(`${environment.apiUrl}/artist/${album.artist_id}/album/${album.id}/track`);
  }

  public getOne(album: Album,id: number)
  {
    return this.http.get<Track>(`${environment.apiUrl}/artist/${album.artist_id}/album/${album.id}/track/${id}`);
  }

  public update(album: Album,dto: Track)
  {
    return this.http.put<Track>(`${environment.apiUrl}/artist/${album.artist_id}/album/${album.id}/track/${dto.id}`, dto);
  }

  public delete(album: Album,id: number)
  {
    return this.http.delete<void>(`${environment.apiUrl}/artist/${album.artist_id}/album/${album.id}/track/${id}`);
  }

}
