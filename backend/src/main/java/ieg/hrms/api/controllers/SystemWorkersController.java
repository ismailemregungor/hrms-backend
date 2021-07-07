package ieg.hrms.api.controllers;

import ieg.hrms.business.abstracts.SystemWorkerService;
import ieg.hrms.core.utilities.results.DataResult;
import ieg.hrms.core.utilities.results.Result;
import ieg.hrms.entities.concretes.SystemWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/systemWorkers")
public class SystemWorkersController {

    private SystemWorkerService systemWorkerService;

    @Autowired
    public SystemWorkersController(SystemWorkerService systemWorkerService) {
        super();
        this.systemWorkerService = systemWorkerService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody SystemWorker systemWorker) {
        return this.systemWorkerService.add(systemWorker);
    }

    @PostMapping("/update")
    public Result update(@RequestBody SystemWorker systemWorker) {
        return this.systemWorkerService.update(systemWorker);
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam("id") int id) {
        return this.systemWorkerService.delete(id);
    }

    @GetMapping("/getAll")
    public DataResult<List<SystemWorker>> getAll() {
        return this.systemWorkerService.getAll();
    }

    @GetMapping("/getById")
    public DataResult<SystemWorker> getById(@RequestParam("id") int id) {
        return this.systemWorkerService.getById(id);
    }

}
