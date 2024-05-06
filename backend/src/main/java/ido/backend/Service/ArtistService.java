package ido.backend.Service;


import ido.backend.Dto.ArtistDto;
import ido.backend.Repository.ArtistRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ArtistService {
    ArtistRepository repository;

    public List<ArtistDto> getAll() {
        return repository.findAll().stream().map(ArtistDto::toDto).toList();
    }
}
