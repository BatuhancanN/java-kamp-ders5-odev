package kodlama.io.ders5.business.abstracts;

import kodlama.io.ders5.business.requests.technology.CreateTechnologyRequest;
import kodlama.io.ders5.business.requests.technology.DeleteTechnologyRequest;
import kodlama.io.ders5.business.requests.technology.UpdateTechnologyRequest;
import kodlama.io.ders5.business.responses.technology.GetAllTechnologiesResponse;

import java.util.List;

public interface TechnologyService
{

    List<GetAllTechnologiesResponse> getAll();

    void add(CreateTechnologyRequest createTechnologyRequest);

    void delete(DeleteTechnologyRequest deleteTechnologyRequest);

    void update(int id, int languageId, UpdateTechnologyRequest updateTechnologyRequest);
}
