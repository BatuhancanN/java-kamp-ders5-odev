package kodlama.io.ders5.dataAccess.abstracts;

import kodlama.io.ders5.entities.concretes.Language;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguageRepository extends JpaRepository<Language, Integer>
{
}
