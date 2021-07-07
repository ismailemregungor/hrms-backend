package ieg.hrms.api.controllers;

import ieg.hrms.business.abstracts.ImageCVService;
import ieg.hrms.business.abstracts.JobSeekerService;
import ieg.hrms.core.utilities.results.DataResult;
import ieg.hrms.core.utilities.results.Result;
import ieg.hrms.entities.concretes.ImageCV;
import ieg.hrms.entities.concretes.JobSeeker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;

@RestController
@RequestMapping("/api/jobSeekerImagesCV")
public class ImagesCVController {

    private ImageCVService imageCVService;
    private JobSeekerService jobSeekerService;

    @Autowired
    public ImagesCVController(ImageCVService imageCVService, JobSeekerService jobSeekerService) {
        super();
        this.imageCVService = imageCVService;
        this.jobSeekerService = jobSeekerService;
    }

    @PostMapping(value = "/add")
    public Result add(@RequestParam(value = "id") int id, @RequestParam(value = "multipartFile") MultipartFile multipartFile) {
        JobSeeker jobSeeker = this.jobSeekerService.getById(id).getData();
        ImageCV imageForCV = new ImageCV();
        imageForCV.setJobSeeker(jobSeeker);
        return this.imageCVService.add(imageForCV, multipartFile);
    }

    @PostMapping("/update")
    public Result update(@RequestBody ImageCV imageCV) {
        return this.imageCVService.update(imageCV);
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam("id") int id) {
        return this.imageCVService.delete(id);
    }

    @GetMapping("/getAll")
    public DataResult<List<ImageCV>> getAll() {
        return this.imageCVService.getAll();
    }

    @GetMapping("/getById")
    public DataResult<ImageCV> getById(@RequestParam("id") int id) {
        return this.imageCVService.getById(id);
    }

    @GetMapping("/getByJobSeekerId")
    public DataResult<ImageCV> getByJobSeekerId(@RequestParam int id) {
        return this.imageCVService.getByJobSeekerId(id);
    }

}
