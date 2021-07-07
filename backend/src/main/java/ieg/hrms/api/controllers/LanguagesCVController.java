package ieg.hrms.api.controllers;

import ieg.hrms.business.abstracts.LanguageCVService;
import ieg.hrms.core.utilities.results.DataResult;
import ieg.hrms.core.utilities.results.Result;
import ieg.hrms.entities.concretes.LanguageCV;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/jobSeekerLanguagesCV")
public class LanguagesCVController {

    private LanguageCVService languageCVService;

    @Autowired
    public LanguagesCVController(LanguageCVService languageCVService) {
        super();
        this.languageCVService = languageCVService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody LanguageCV languageCV) {
        return this.languageCVService.add(languageCV);
    }

    @PostMapping("/update")
    public Result update(@RequestBody LanguageCV languageCV) {
        return this.languageCVService.update(languageCV);
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam("id") int id) {
        return this.languageCVService.delete(id);
    }

    @GetMapping("/getAll")
    public DataResult<List<LanguageCV>> getAll() {
        return this.languageCVService.getAll();
    }

    @GetMapping("/getById")
    public DataResult<LanguageCV> getById(@RequestParam("id") int id) {
        return this.languageCVService.getById(id);
    }

    @GetMapping("/getByJobSeekerId")
    public DataResult<List<LanguageCV>> getByJobSeekerId(@RequestParam int id) {
        return this.languageCVService.getByJobSeekerId(id);
    }

}
