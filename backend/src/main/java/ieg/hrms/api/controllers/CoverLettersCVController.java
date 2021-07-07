package ieg.hrms.api.controllers;

import ieg.hrms.business.abstracts.CoverLetterCVService;
import ieg.hrms.core.utilities.results.DataResult;
import ieg.hrms.core.utilities.results.Result;
import ieg.hrms.entities.concretes.CoverLetterCV;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/jobSeekerCoverLettersCV")
public class CoverLettersCVController {

    private CoverLetterCVService coverLetterCVService;

    @Autowired
    public CoverLettersCVController(CoverLetterCVService coverLetterCVService) {
        super();
        this.coverLetterCVService = coverLetterCVService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody CoverLetterCV coverLetterCV) {
        return this.coverLetterCVService.add(coverLetterCV);
    }

    @PostMapping("/update")
    public Result update(@RequestBody CoverLetterCV coverLetterCV) {
        return this.coverLetterCVService.update(coverLetterCV);
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam("id") int id) {
        return this.coverLetterCVService.delete(id);
    }

    @GetMapping("/getAll")
    public DataResult<List<CoverLetterCV>> getAll() {
        return this.coverLetterCVService.getAll();
    }

    @GetMapping("/getById")
    public DataResult<CoverLetterCV> getById(@RequestParam("id") int id) {
        return this.coverLetterCVService.getById(id);
    }
}
