package ido.backend.Dto;

import ido.backend.Model.Artist;
import lombok.*;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
public class ArtistDto {
    private Long id;

    private String name;

    List<Long> albumIds;

    public static ArtistDto toDto(Artist ent)
    {
        return ArtistDto.builder()
                .id(ent.getId())
                .name(ent.getName())
                .albumIds(
                        ent.getAlbums()
                                .stream().map( t -> t.getId())
                                .toList()
                )
                .build();
    }

    public static Artist toEntity(ArtistDto dto) {
        var ret = Artist.builder();
        if (dto.getId() != null)
            ret.id(dto.getId());
        if (dto.getName() != null)
            ret.name(dto.getName());
        return ret.build();
    }
}
