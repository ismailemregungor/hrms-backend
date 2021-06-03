package ieg.hrms.api.controllers;

import java.util.List;

import ieg.hrms.core.utilities.results.DataResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ieg.hrms.business.abstracts.JobPositionService;
import ieg.hrms.entities.concretes.JobPosition;

@RestController
@RequestMapping("/api/jobpositions")
public class JobPositionsController {

	private JobPositionService jobPositionService;

	@Autowired
	public JobPositionsController(JobPositionService jobPositionService) {
		super();
		this.jobPositionService = jobPositionService;
	}

	@GetMapping("/getByPositionName")
	public DataResult<List<JobPosition>> getByPositionName(@RequestParam String positionName){
		return this.jobPositionService.getByPositionName(positionName);
	}

}
