package ido.backend.Dto;

import lombok.*;

import java.time.Duration;

@Data
@Builder
@AllArgsConstructor
public class TrackDto {
    Long id;

    String name;

    Duration duration;

    Long genreId;

    Long album;
}
