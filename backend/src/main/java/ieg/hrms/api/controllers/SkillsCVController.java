package ieg.hrms.api.controllers;

import ieg.hrms.business.abstracts.SkillCVService;
import ieg.hrms.core.utilities.results.DataResult;
import ieg.hrms.core.utilities.results.Result;
import ieg.hrms.entities.concretes.SkillCV;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/jobSeekerSkillsCV")
public class SkillsCVController {

    private SkillCVService skillCVService;

    @Autowired
    public SkillsCVController(SkillCVService skillCVService) {
        super();
        this.skillCVService = skillCVService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody SkillCV skillCV) {
        return this.skillCVService.add(skillCV);
    }

    @PostMapping("/update")
    public Result update(@RequestBody SkillCV skillCV) {
        return this.skillCVService.update(skillCV);
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam("id") int id) {
        return this.skillCVService.delete(id);
    }

    @GetMapping("/getAll")
    public DataResult<List<SkillCV>> getAll() {
        return this.skillCVService.getAll();
    }

    @GetMapping("/getById")
    public DataResult<SkillCV> getById(@RequestParam("id") int id) {
        return this.skillCVService.getById(id);
    }

    @GetMapping("/getByJobSeekerId")
    public DataResult<List<SkillCV>> getByJobSeekerId(@RequestParam int id) {
        return this.skillCVService.getByJobSeekerId(id);
    }

}
