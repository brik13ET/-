import {Component, OnInit} from '@angular/core';
import {Track} from "../../../entity/track";
import {Observable} from "rxjs";
import {TrackService} from "../../../service/track.service";
import {AsyncPipe} from "@angular/common";
import {TrackCardComponent} from "../../card/track-card/track-card.component";
import {AlbumService} from "../../../service/album.service";
import {ActivatedRoute, Params} from "@angular/router";

@Component({
  selector: 'app-track-list',
  standalone: true,
  imports: [
    AsyncPipe,
    TrackCardComponent
  ],
  templateUrl: './track-list.component.html',
  styleUrl: './track-list.component.css'
})
export class TrackListComponent implements OnInit {
  tracks$!: Observable<Track[]>;

  constructor(
    private service: TrackService,
    private albumService: AlbumService,
    private route: ActivatedRoute
  ) {
    route.params.subscribe(this.updateParams)
  }

  updateParams(value: Params)
  {
    if (value['id'])
    {
      let artist_id = this.albumService.getOne()
      this.service.getAll()
    }
  }

  ngOnInit(): void {
    this.route
    this.tracks$ = this.service.getAll();
  }

}
