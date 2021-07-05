package ieg.hrms.entities.dtos;

import ieg.hrms.entities.concretes.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobSeekerCVDto {

    private JobSeeker jobSeeker;
    private List<EducationCV> educationCV;
    private List<ExperienceCV> experienceCV;
    private List<SkillCV> skillCV;
    private List<LanguageCV> languageCV;
    private List<LinkCV> linkCV;
    private List<CoverLetterCV> coverLetterCV;
    private List<ImageCV> imageCV;

}
