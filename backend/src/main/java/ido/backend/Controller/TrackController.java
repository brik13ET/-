package ido.backend.Controller;

import ido.backend.Dto.TrackDto;
import ido.backend.Service.TrackService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/artist/{artistId}/album/{albumId}/track")
@AllArgsConstructor
public class TrackController {

    private TrackService service;

    @PostMapping()
    ResponseEntity<TrackDto> create(@RequestBody TrackDto trackDto)
    {
        return ResponseEntity.ofNullable(null);
    }

    @PutMapping()
    ResponseEntity<TrackDto> update(@RequestBody TrackDto trackDto)
    {
        return ResponseEntity.ofNullable(null);
    }

    @GetMapping()
    ResponseEntity<List<TrackDto>> getById()
    {
        return ResponseEntity.ofNullable(null);
    }

    @GetMapping("{trackId}")
    ResponseEntity<List<TrackDto>> getByAll()
    {
        return ResponseEntity.ofNullable(null);
    }

    @DeleteMapping()
    ResponseEntity<Boolean> deleteById()
    {
        return ResponseEntity.ofNullable(null);
    }
}
