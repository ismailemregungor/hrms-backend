package ieg.hrms.dataAccess.abstracts;

import ieg.hrms.entities.concretes.JobSeeker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobSeekerDao extends JpaRepository<JobSeeker, Integer> {

    JobSeeker getById(int id);

    JobSeeker getJobSeekerByNationalIdNo(String nationalIdNo);

}
