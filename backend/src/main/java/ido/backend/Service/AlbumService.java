package ido.backend.Service;


import ido.backend.Dto.AlbumDto;
import ido.backend.Repository.AlbumRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AlbumService {

    AlbumRepository repository;

    public AlbumDto create(AlbumDto albumDto) {
        var ent = AlbumDto.toEntity(albumDto);
        ent = repository.saveAndFlush(ent);
        var newDto = AlbumDto.toDto(ent);
        return newDto;
    }

    public List<AlbumDto> getAll()
    {
        return repository.findAll().stream().map(AlbumDto::toDto).toList();
    }
}
