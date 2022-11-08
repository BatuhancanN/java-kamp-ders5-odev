package kodlama.io.ders5.business.concretes;

import kodlama.io.ders5.business.abstracts.TechnologyService;
import kodlama.io.ders5.business.requests.technology.CreateTechnologyRequest;
import kodlama.io.ders5.business.requests.technology.DeleteTechnologyRequest;
import kodlama.io.ders5.business.requests.technology.UpdateTechnologyRequest;
import kodlama.io.ders5.business.responses.technology.GetAllTechnologiesResponse;
import kodlama.io.ders5.dataAccess.abstracts.LanguageRepository;
import kodlama.io.ders5.dataAccess.abstracts.TechnologyRepository;
import kodlama.io.ders5.entities.concretes.Language;
import kodlama.io.ders5.entities.concretes.Technology;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TechnologyManager implements TechnologyService
{
    private TechnologyRepository technologyRepository;
    private LanguageRepository languageRepository;

    @Autowired
    public TechnologyManager(TechnologyRepository technologyRepository, LanguageRepository languageRepository) {
        this.technologyRepository = technologyRepository;
        this.languageRepository = languageRepository;
    }

    @Override
    public List<GetAllTechnologiesResponse> getAll() {
        List<Technology> technologies = technologyRepository.findAll();
        List<GetAllTechnologiesResponse> responses = new ArrayList<>();

        for(Technology technology: technologies) {
            GetAllTechnologiesResponse response = new GetAllTechnologiesResponse();

            response.setName(technology.getName());
            response.setLanguageName(technology.getLanguage().getName());

            responses.add(response);
        }
        return responses;
    }

    @Override
    public void add(CreateTechnologyRequest createTechnologyRequest) {
        Technology technology = new Technology();
        Language language = languageRepository.findById(createTechnologyRequest.getLangugageId()).get();

        technology.setName(createTechnologyRequest.getName());
        technology.setLanguage(language);
        technologyRepository.save(technology);
    }

    @Override
    public void delete(DeleteTechnologyRequest deleteTechnologyRequest) {
        technologyRepository.deleteById(deleteTechnologyRequest.getId());
    }

    @Override
    public void update(int id, int languageId, UpdateTechnologyRequest updateTechnologyRequest) {
        Technology technology = technologyRepository.findById(id).get();
        Language language = languageRepository.findById(languageId).get();

        technology.setName(updateTechnologyRequest.getName());
        technology.setLanguage(language);
        technologyRepository.save(technology);
    }
}
