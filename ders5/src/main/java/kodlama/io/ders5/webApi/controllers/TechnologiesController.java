package kodlama.io.ders5.webApi.controllers;

import kodlama.io.ders5.business.abstracts.TechnologyService;
import kodlama.io.ders5.business.requests.technology.CreateTechnologyRequest;
import kodlama.io.ders5.business.requests.technology.DeleteTechnologyRequest;
import kodlama.io.ders5.business.requests.technology.UpdateTechnologyRequest;
import kodlama.io.ders5.business.responses.technology.GetAllTechnologiesResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tech")
public class TechnologiesController {
    private TechnologyService technologyService;

    @Autowired
    public TechnologiesController(TechnologyService technologyService) {
        this.technologyService = technologyService;
    }

    @GetMapping("/getall")
    public List<GetAllTechnologiesResponse> getAll() {
        return technologyService.getAll();
    }

    @PostMapping("/add")
    public void add(CreateTechnologyRequest createTechnologyRequest) {
        this.technologyService.add(createTechnologyRequest);
    }

    @DeleteMapping("/delete")
    public void deleteById(DeleteTechnologyRequest deleteTechnologyRequest) {
        this.technologyService.delete(deleteTechnologyRequest);
    }

    @PutMapping("update")
    public void updateById(int id, int languageId, UpdateTechnologyRequest updateTechnologyRequest) {
        this.technologyService.update(id, languageId, updateTechnologyRequest);
    }

}
