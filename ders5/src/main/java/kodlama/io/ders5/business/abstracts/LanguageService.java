package kodlama.io.ders5.business.abstracts;
import kodlama.io.ders5.business.requests.language.CreateLanguageRequest;
import kodlama.io.ders5.business.requests.language.DeleteLanguageRequest;
import kodlama.io.ders5.business.requests.language.UpdateLanguageRequest;
import kodlama.io.ders5.business.responses.language.GetAllLanguagesResponse;
import kodlama.io.ders5.business.responses.language.GetByIdLanguagesResponse;

import java.util.List;

public interface LanguageService {
    List<GetAllLanguagesResponse> getAll();

    GetByIdLanguagesResponse getById(int id);

    void add(CreateLanguageRequest createLanguageRequest);
    void delete(DeleteLanguageRequest deleteLanguageRequest);
    void update(int id, UpdateLanguageRequest UpdatelanguageRequest);
}
