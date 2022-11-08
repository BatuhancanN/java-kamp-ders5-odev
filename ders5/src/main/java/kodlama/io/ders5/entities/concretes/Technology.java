package kodlama.io.ders5.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "technologies")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Technology
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "technologyId")
    private int id;

    @Column(name = "technologyName")
    private String name;

    @ManyToOne
    @JoinColumn(name = "LanguageId")
    private Language language;
}
