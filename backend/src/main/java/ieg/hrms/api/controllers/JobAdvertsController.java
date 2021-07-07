package ieg.hrms.api.controllers;

import ieg.hrms.business.abstracts.JobAdvertService;
import ieg.hrms.core.utilities.results.DataResult;
import ieg.hrms.core.utilities.results.Result;
import ieg.hrms.entities.concretes.JobAdvert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/jobAdverts")
public class JobAdvertsController {

    private JobAdvertService jobAdvertService;

    @Autowired
    public JobAdvertsController(JobAdvertService jobAdvertService) {
        super();
        this.jobAdvertService = jobAdvertService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody JobAdvert jobAdvert) {
        return this.jobAdvertService.add(jobAdvert);
    }

    @PostMapping("/update")
    public Result update(@RequestBody JobAdvert jobAdvert) {
        return this.jobAdvertService.add(jobAdvert);
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam("id") int id) {
        return this.jobAdvertService.delete(id);
    }

    @GetMapping("/getAll")
    public DataResult<List<JobAdvert>> getAll() {
        return this.jobAdvertService.getAll();
    }

    @GetMapping("/getById")
    public DataResult<JobAdvert> getById(@RequestParam int id) {
        return this.jobAdvertService.getById(id);
    }

    @PostMapping("/changeActiveToPassive")
    public Result changeActiveToPassive(@RequestParam int id) {
        return this.jobAdvertService.changeActiveToPassive(id);
    }

    @GetMapping("/getActiveJobAdverts")
    public DataResult<List<JobAdvert>> getActiveJobAdverts() {
        return this.jobAdvertService.getActiveJobAdverts();
    }

    @GetMapping("/getActiveJobAdvertsByDate")
    public DataResult<List<JobAdvert>> getActiveJobAdvertsByDate() {
        return this.jobAdvertService.getActiveJobAdvertsByDate();
    }

    @GetMapping("/getActiveJobAdvertsByEmployer")
    public DataResult<List<JobAdvert>> getActiveJobAdvertsByEmployer(@RequestParam int id) {
        return this.jobAdvertService.getActiveJobAdvertsByEmployer(id);
    }
}
