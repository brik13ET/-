import {Component, Input} from '@angular/core';
import {Track} from "../../../entity/track";
import {Album} from "../../../entity/album";
import {RouterLink} from "@angular/router";

@Component({
  selector: 'app-track-card',
  standalone: true,
  imports: [
    RouterLink
  ],
  templateUrl: './track-card.component.html',
  styleUrl: './track-card.component.css'
})
export class TrackCardComponent {
  @Input() track!: Track;
  @Input() album!: Album;

}
