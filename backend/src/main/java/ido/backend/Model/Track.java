package ido.backend.Model;

import jakarta.persistence.*;
import lombok.*;

import java.time.Duration;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Track {
    @Id
    Long id;

    @Column(nullable = false)
    String name;

    @Column(nullable = false)
    Duration duration;

    @ManyToOne(optional = false, targetEntity = Genre.class, cascade = CascadeType.PERSIST)
    Genre genre;

    @ManyToOne(optional = false, targetEntity = Album.class, cascade = CascadeType.PERSIST)
    @JoinColumn(nullable = false, unique = true, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT))
    Album album;

}
