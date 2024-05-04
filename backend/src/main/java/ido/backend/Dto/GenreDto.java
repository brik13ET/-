package ido.backend.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
public class GenreDto {
    Long id;

    String name;

    List<Long> trackIds;
}
