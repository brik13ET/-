package ido.backend.Dto;

import ido.backend.Model.Album;
import ido.backend.Repository.AlbumRepository;
import ido.backend.Repository.ArtistRepository;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
public class AlbumDto {
    Long id;

    String name;

    LocalDate release;

    List<Long> trackList;

    Long artistId;

    private static ArtistRepository artistRepository;

    public static AlbumDto toDto(Album ent)
    {
        return AlbumDto.builder()
                .id(ent.getId())
                .name(ent.getName())
                .release(ent.getRelease())
                .trackList(
                        ent.getTrackList()
                                .stream().map( t -> t.getId())
                                .toList()
                )
                .artistId(ent.getArtist().getId())
                .build();
    }

    public static Album toEntity(AlbumDto dto)
    {
        var ret = Album.builder();
        if (dto.getId()         != null)
            ret.id(dto.getId());
        if (dto.getName()       != null)
            ret.name(dto.getName());
        if (dto.getRelease()    != null)
            ret.release(dto.getRelease());
        if (dto.getArtistId()   != null && artistRepository.existsById(dto.getArtistId()))
            ret.artist(artistRepository.findById(dto.getArtistId()).get());
        return ret.build();
    }


}
