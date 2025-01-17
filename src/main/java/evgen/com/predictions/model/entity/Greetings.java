package evgen.com.predictions.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "greetings")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Greetings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "greetings_title")
    private String greetingsTitle;
}
