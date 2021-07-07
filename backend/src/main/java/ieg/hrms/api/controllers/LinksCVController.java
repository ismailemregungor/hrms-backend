package ieg.hrms.api.controllers;

import ieg.hrms.business.abstracts.LinkCVService;
import ieg.hrms.core.utilities.results.DataResult;
import ieg.hrms.core.utilities.results.Result;
import ieg.hrms.entities.concretes.LinkCV;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/jobSeekerLinksCV")
public class LinksCVController {

    private LinkCVService linkCVService;

    @Autowired
    public LinksCVController(LinkCVService linkCVService) {
        super();
        this.linkCVService = linkCVService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody LinkCV linkCV) {
        return this.linkCVService.add(linkCV);
    }

    @PostMapping("/update")
    public Result update(@RequestBody LinkCV linkCV) {
        return this.linkCVService.update(linkCV);
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam("id") int id) {
        return this.linkCVService.delete(id);
    }

    @GetMapping("/getAll")
    public DataResult<List<LinkCV>> getAll() {
        return this.linkCVService.getAll();
    }

    @GetMapping("/getById")
    public DataResult<LinkCV> getById(@RequestParam("id") int id) {
        return this.linkCVService.getById(id);
    }

    @GetMapping("/getByJobSeekerId")
    public DataResult<List<LinkCV>> getByJobSeekerId(@RequestParam int id) {
        return this.linkCVService.getByJobSeekerId(id);
    }


}
