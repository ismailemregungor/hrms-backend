package ieg.hrms.api.controllers;

import ieg.hrms.business.abstracts.JobSeekerService;
import ieg.hrms.core.utilities.results.DataResult;
import ieg.hrms.core.utilities.results.Result;
import ieg.hrms.entities.concretes.JobSeeker;
import ieg.hrms.entities.dtos.JobSeekerCVDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/jobSeekers")
public class JobSeekersController {

    private JobSeekerService jobSeekerService;

    @Autowired
    public JobSeekersController(JobSeekerService jobSeekerService) {
        super();
        this.jobSeekerService = jobSeekerService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody JobSeeker jobSeeker) {
        return this.jobSeekerService.add(jobSeeker);
    }

    @PostMapping("/update")
    public Result update(@RequestBody JobSeeker jobseeker) {
        return this.jobSeekerService.update(jobseeker);
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam("id") int id) {
        return this.jobSeekerService.delete(id);
    }

    @GetMapping("/getAll")
    public DataResult<List<JobSeeker>> getAll() {
        return this.jobSeekerService.getAll();
    }

    @GetMapping("/getById")
    public DataResult<JobSeeker> getById(@RequestParam("id") int id) {
        return this.jobSeekerService.getById(id);
    }

    @GetMapping("/getJobSeekerCVById")
    public DataResult<JobSeekerCVDto> getJobSeekerCVById(@RequestParam("id") int id) {
        return this.jobSeekerService.getJobSeekerCVById(id);
    }

    @GetMapping("/getJobSeekerByNationalIdNo")
    public DataResult<JobSeeker> getJobSeekerByNationalIdNo(@RequestParam("nationalIdNo") String nationalIdNo) {
        return this.jobSeekerService.getJobSeekerByNationalIdNo(nationalIdNo);
    }

}
