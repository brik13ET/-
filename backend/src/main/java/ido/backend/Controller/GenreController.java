package ido.backend.Controller;

import ido.backend.Dto.TrackDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/genre")
public class GenreController {

    @GetMapping()
    public Map<Integer, String> getAll()
    {
        return Collections.emptyMap();
    }

    @GetMapping("{id}")
    public Map.Entry<Integer, String> getOne(@PathVariable(name = "id") Long id)
    {
        return null;
    }

    @GetMapping("{id}/tracks")
    public List<TrackDto> getTracks(@PathVariable(name = "id") Long id)
    {
        return Collections.emptyList();
    }
}
