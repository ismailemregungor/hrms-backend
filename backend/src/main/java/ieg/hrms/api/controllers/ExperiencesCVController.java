package ieg.hrms.api.controllers;

import ieg.hrms.business.abstracts.ExperienceCVService;
import ieg.hrms.core.utilities.results.DataResult;
import ieg.hrms.core.utilities.results.Result;
import ieg.hrms.entities.concretes.ExperienceCV;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/jobSeekerExperiencesCV")
public class ExperiencesCVController {

    private ExperienceCVService experienceCVService;

    @Autowired
    public ExperiencesCVController(ExperienceCVService experienceCVService) {
        super();
        this.experienceCVService = experienceCVService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody ExperienceCV experienceCV) {
        return this.experienceCVService.add(experienceCV);
    }

    @PostMapping("/update")
    public Result update(@RequestBody ExperienceCV experienceCV) {
        return this.experienceCVService.update(experienceCV);
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam("id") int id) {
        return this.experienceCVService.delete(id);
    }

    @GetMapping("/getAll")
    public DataResult<List<ExperienceCV>> getAll() {
        return this.experienceCVService.getAll();
    }

    @GetMapping("/getById")
    public DataResult<ExperienceCV> getById(@RequestParam int id) {
        return this.experienceCVService.getById(id);
    }

    @GetMapping("/getByJobSeekerId")
    public DataResult<List<ExperienceCV>> getByJobSeekerId(@RequestParam int id) {
        return this.experienceCVService.getByJobSeekerId(id);
    }

    @GetMapping("/getByJobSeekerIdOrderByEndAtDesc")
    public DataResult<List<ExperienceCV>> getByJobSeekerIdOrderByEndAtDesc(@RequestParam("id") int id) {
        return this.experienceCVService.getByJobSeekerIdOrderByEndAtDesc(id);
    }

}
