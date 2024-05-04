package ido.backend.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Genre {
    @Id
    Long id;

    @Column(nullable = false)
    String name;

    @OneToMany(
            mappedBy = "genre",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    List<Track> tracks;

}
