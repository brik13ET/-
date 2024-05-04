package ido.backend.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Artist {

    @Id
    private Long id;

    @Column(nullable = false)
    private String name;

    @OneToMany(
            cascade = CascadeType.PERSIST,
            fetch = FetchType.LAZY
    )
    List<Album> albums;
}
