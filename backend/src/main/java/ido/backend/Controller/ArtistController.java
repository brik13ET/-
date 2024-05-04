package ido.backend.Controller;

import ido.backend.Dto.ArtistDto;
import ido.backend.Service.ArtistService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/artist")
@AllArgsConstructor
public class ArtistController {

    private ArtistService service;
    @PostMapping()
    ResponseEntity<ArtistDto> create(@RequestBody ArtistDto artistDto)
    {
        return ResponseEntity.ofNullable(null);
    }

    @PutMapping()
    ResponseEntity<ArtistDto> update(@RequestBody ArtistDto artistDto)
    {
        return ResponseEntity.ofNullable(null);
    }

    @GetMapping("{artistId}")
    ResponseEntity<ArtistDto> getById()
    {
        return ResponseEntity.ofNullable(null);
    }

    @GetMapping()
    ResponseEntity<List<ArtistDto>> getAll()
    {
        return new ResponseEntity(service.getAll(), HttpStatus.OK);
    }

    @DeleteMapping()
    ResponseEntity<Boolean> deleteById()
    {
        return ResponseEntity.ofNullable(null);
    }
}
