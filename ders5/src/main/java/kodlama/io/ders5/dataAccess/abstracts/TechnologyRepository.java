package kodlama.io.ders5.dataAccess.abstracts;

import kodlama.io.ders5.entities.concretes.Technology;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechnologyRepository extends JpaRepository<Technology, Integer>
{
}
