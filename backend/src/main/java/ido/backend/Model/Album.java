package ido.backend.Model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Album {
    @Id
    Long id;

    @Column(nullable = false)
    String name;

    @Column(nullable = false)
    LocalDate release;

    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "album"
    )
    List<Track> trackList;

    @ManyToOne
    Artist artist;



}
