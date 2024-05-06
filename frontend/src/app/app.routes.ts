import { Routes } from '@angular/router';
import {ArtistListComponent} from "./component/list/artist-list/artist-list.component";
import {AlbumListComponent} from "./component/list/album-list/album-list.component";
import {TrackListComponent} from "./component/list/track-list/track-list.component";

export const routes: Routes = [
  { path: '',        component: ArtistListComponent },
  { path: 'artists', component: ArtistListComponent },
  { path: 'albums',  component: AlbumListComponent  },
  { path: 'tracks',  component: TrackListComponent  },

  // { path: 'artists', component: AlbumListComponent  , outlet: 'dock' },
  // { path: 'albums',  component: TrackListComponent  , outlet: 'dock' },
  // { path: 'tracks',  component: ArtistListComponent , outlet: 'dock' },

  { path: 'artists/:id', component: ArtistListComponent },
  { path: 'albums/:id',  component: AlbumListComponent  },
  { path: 'tracks/:id',  component: TrackListComponent  },

  { path: 'artists/:id', component: AlbumListComponent  , outlet: 'dock' },
  { path: 'albums/:id',  component: TrackListComponent  , outlet: 'dock' },
  { path: 'tracks/:id',  component: ArtistListComponent , outlet: 'dock' },

  { path: '*',        redirectTo: '/', pathMatch: "full"},
];
