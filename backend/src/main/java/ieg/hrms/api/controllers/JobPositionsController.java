package ieg.hrms.api.controllers;

import java.util.List;

import ieg.hrms.core.utilities.results.DataResult;
import ieg.hrms.core.utilities.results.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ieg.hrms.business.abstracts.JobPositionService;
import ieg.hrms.entities.concretes.JobPosition;

@RestController
@RequestMapping("/api/jobPositions")
public class JobPositionsController {

    private JobPositionService jobPositionService;

    @Autowired
    public JobPositionsController(JobPositionService jobPositionService) {
        super();
        this.jobPositionService = jobPositionService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody JobPosition jobPosition) {
        return this.jobPositionService.add(jobPosition);
    }

    @PostMapping("/update")
    public Result update(@RequestBody JobPosition jobPosition) {
        return this.jobPositionService.update(jobPosition);
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam("id") int id) {
        return this.jobPositionService.delete(id);
    }

    @GetMapping("/getAll")
    public DataResult<List<JobPosition>> getAll() {
        return this.jobPositionService.getAll();
    }

    @GetMapping("/getById")
    public DataResult<JobPosition> getById(@RequestParam("id") int id) {
        return this.jobPositionService.getById(id);
    }

    @GetMapping("/getByPositionName")
    public DataResult<JobPosition> getByPositionName(@RequestParam("positionName") String positionName) {
        return this.jobPositionService.getByPositionName(positionName);
    }
}
