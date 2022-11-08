package kodlama.io.ders5.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Table(name = "languages")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Language
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "languageName")
    private String name;

    @OneToMany(mappedBy = "language")
    private List<Technology> technology;
}
