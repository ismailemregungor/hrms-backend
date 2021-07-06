package ieg.hrms.business.concretes;

import ieg.hrms.business.abstracts.JobSeekerService;
import ieg.hrms.core.utilities.results.DataResult;
import ieg.hrms.core.utilities.results.Result;
import ieg.hrms.core.utilities.results.SuccessDataResult;
import ieg.hrms.core.utilities.results.SuccessResult;
import ieg.hrms.dataAccess.abstracts.*;
import ieg.hrms.entities.concretes.JobSeeker;
import ieg.hrms.entities.dtos.JobSeekerCVDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class JobSeekerManager implements JobSeekerService {

    private JobSeekerDao jobSeekerDao;
    private EducationCVDao educationCVDao;
    private ExperienceCVDao experienceCVDao;
    private SkillCVDao skillCVDao;
    private LanguageCVDao languageCVDao;
    private LinkCVDao linkCVDao;
    private CoverLetterCVDao coverLetterCVDao;
    private ImageCVDao imageCVDao;

    @Autowired
    public JobSeekerManager(JobSeekerDao jobSeekerDao, EducationCVDao educationCVDao, ExperienceCVDao experienceCVDao, SkillCVDao skillCVDao, LanguageCVDao languageCVDao, LinkCVDao linkCVDao, CoverLetterCVDao coverLetterCVDao, ImageCVDao imageCVDao) {
        super();
        this.jobSeekerDao = jobSeekerDao;
        this.educationCVDao = educationCVDao;
        this.experienceCVDao = experienceCVDao;
        this.skillCVDao = skillCVDao;
        this.languageCVDao = languageCVDao;
        this.linkCVDao = linkCVDao;
        this.coverLetterCVDao = coverLetterCVDao;
        this.imageCVDao = imageCVDao;
    }

    @Override
    public Result add(JobSeeker jobSeeker) {
        this.jobSeekerDao.save(jobSeeker);
        return new SuccessResult("Job Seeker has added.");
    }

    @Override
    public Result update(JobSeeker jobSeeker) {
        this.jobSeekerDao.save(jobSeeker);
        return new SuccessResult("Job Seeker has updated.");
    }

    @Override
    public Result delete(int id) {
        this.jobSeekerDao.deleteById(id);
        return new SuccessResult("Job Seeker has deleted.");
    }

    @Override
    public DataResult<List<JobSeeker>> getAll() {
        return new SuccessDataResult<List<JobSeeker>>(this.jobSeekerDao.findAll());
    }

    @Override
    public DataResult<JobSeeker> getById(int id) {
        return new SuccessDataResult<JobSeeker>(this.jobSeekerDao.getById(id));
    }

    @Override
    public DataResult<JobSeeker> getJobSeekerByNationalIdNo(String nationalIdNo) {
        return new SuccessDataResult<JobSeeker>(this.jobSeekerDao.getJobSeekerByNationalIdNo(nationalIdNo));
    }

    @Override
    public DataResult<JobSeekerCVDto> getJobSeekerCVById(int id) {

        JobSeeker jobSeeker = this.jobSeekerDao.getById(id);
        JobSeekerCVDto jobSeekerCVDto = new JobSeekerCVDto();
        jobSeekerCVDto.setEducationCV(jobSeeker.getEducationCV());
        jobSeekerCVDto.setExperienceCV(jobSeeker.getExperienceCV());
        jobSeekerCVDto.setLanguageCV(jobSeeker.getLanguageCV());
        jobSeekerCVDto.setSkillCV(jobSeeker.getSkillCV());
        jobSeekerCVDto.setLinkCV(jobSeeker.getLinkCV());
        jobSeekerCVDto.setCoverLetterCV(jobSeeker.getCoverLetterCV());
        jobSeekerCVDto.setImageCV(jobSeeker.getImageCV());
        return new SuccessDataResult<JobSeekerCVDto>(jobSeekerCVDto);
    }
}
