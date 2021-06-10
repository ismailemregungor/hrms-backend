package ieg.hrms.dataAccess.abstracts;

import ieg.hrms.entities.concretes.JobAdvert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface JobAdvertDao extends JpaRepository<JobAdvert, Integer> {

    JobAdvert getById(int id);

    @Query("From JobAdvert  where isJobPositionActive = true")
    List<JobAdvert> getAllOpenJobAdverts();

    @Query("From JobAdvert where isJobPositionActive = true Order By creationDate Desc")
    List<JobAdvert> getAllOpenJobAdvertsByDate();

    @Query("From JobAdvert where isJobPositionActive = true and employer_id =:id")
    List<JobAdvert> getAllOpenJobAdvertsByEmployer(int id);


}
