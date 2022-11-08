package kodlama.io.ders5.webApi.controllers;

import kodlama.io.ders5.business.abstracts.LanguageService;
import kodlama.io.ders5.business.requests.language.CreateLanguageRequest;
import kodlama.io.ders5.business.requests.language.DeleteLanguageRequest;
import kodlama.io.ders5.business.requests.language.UpdateLanguageRequest;
import kodlama.io.ders5.business.responses.language.GetAllLanguagesResponse;
import kodlama.io.ders5.business.responses.language.GetByIdLanguagesResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lang")
public class LanguagesControllers {
    private LanguageService languageService;

    @Autowired
    public LanguagesControllers(LanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping("/getall")
    public List<GetAllLanguagesResponse> getAll() {
        return languageService.getAll();
    }

    @GetMapping("/{id}")
    public GetByIdLanguagesResponse getById(int id) {
        return languageService.getById(id);
    }

    @PostMapping("/add")
    public void add(CreateLanguageRequest createLanguageRequest) {
        this.languageService.add(createLanguageRequest);
    }

    @DeleteMapping("/delete")
    public void delete(DeleteLanguageRequest deleteLanguageRequest) {
        this.languageService.delete(deleteLanguageRequest);
    }

    @PutMapping("/update")
    public void update(int id, UpdateLanguageRequest updateLanguageRequest) {
        this.languageService.update(id, updateLanguageRequest);
    }
}
