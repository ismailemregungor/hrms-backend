package ieg.hrms.api.controllers;

import ieg.hrms.business.abstracts.EducationCVService;
import ieg.hrms.core.utilities.results.DataResult;
import ieg.hrms.core.utilities.results.Result;
import ieg.hrms.entities.concretes.EducationCV;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/jobSeekerEducationsCV")
public class EducationsCVController {

    private EducationCVService educationCVService;

    @Autowired
    public EducationsCVController(EducationCVService educationCVService) {
        super();
        this.educationCVService = educationCVService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody EducationCV educationCV) {
        return this.educationCVService.add(educationCV);
    }

    @PostMapping("/update")
    public Result update(@RequestBody EducationCV educationCV) {
        return this.educationCVService.update(educationCV);
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam("id") int id) {
        return this.educationCVService.delete(id);
    }

    @GetMapping("/getAll")
    public DataResult<List<EducationCV>> getAll() {
        return this.educationCVService.getAll();
    }

    @GetMapping("/getById")
    public DataResult<EducationCV> getById(@RequestParam int id) {
        return this.educationCVService.getById(id);
    }

    @GetMapping("/getByJobSeekerId")
    public DataResult<List<EducationCV>> getByJobSeekerId(@RequestParam int id) {
        return this.educationCVService.getByJobSeekerId(id);
    }

    @GetMapping("/getByJobSeekerIdOrderByEndAtDesc")
    public DataResult<List<EducationCV>> getByJobSeekerIdOrderByEndAtDesc(@RequestParam("id") int id) {
        return this.educationCVService.getByJobSeekerIdOrderByEndDateDesc(id);
    }
}
