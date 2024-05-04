package ido.backend.Controller;

import ido.backend.Dto.AlbumDto;
import ido.backend.Service.AlbumService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/artist/{artistId}/album")
@AllArgsConstructor
public class AlbumController {

    private AlbumService service;

    @PostMapping()
    ResponseEntity<AlbumDto> create(@PathVariable(name = "artistId") Long artistId, @RequestBody AlbumDto albumDto)
    {
        return ResponseEntity.ofNullable(service.create(albumDto));
    }

    @PutMapping()
    ResponseEntity<AlbumDto> update(@PathVariable(name = "artistId") Long artistId, @RequestBody AlbumDto albumDto)
    {
        return ResponseEntity.ofNullable(null);
    }

    @GetMapping("/{albumId}")
    ResponseEntity<AlbumDto> getById(@PathVariable(name = "artistId") Long artistId, @PathVariable(name = "id") Long id)
    {
        return ResponseEntity.ofNullable(null);
    }

    @GetMapping()
    ResponseEntity<List<AlbumDto>> getByAll(@PathVariable(name = "artistId") Long artistId)
    {
        return ResponseEntity.ofNullable(service.getAll());
    }

    @DeleteMapping()
    ResponseEntity<Boolean> deleteById(@PathVariable(name = "artistId") Long artistId)
    {
        return ResponseEntity.ofNullable(null);
    }
}
