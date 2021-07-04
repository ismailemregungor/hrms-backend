package ieg.hrms.entities.concretes;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@PrimaryKeyJoinColumn(name = "user_id")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "job_seekers")
public class JobSeeker extends User {

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "national_id_no")
    private String nationalIdNo;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @JsonIgnore
    @OneToMany(mappedBy = "jobSeeker")
    private List<EducationCV> educationCV;

    @JsonIgnore
    @OneToMany(mappedBy = "jobSeeker")
    private List<ExperienceCV> experienceCV;

    @JsonIgnore
    @OneToMany(mappedBy = "jobSeeker")
    private List<SkillCV> skillCV;

    @JsonIgnore
    @OneToMany(mappedBy = "jobSeeker")
    private List<LanguageCV> languageCV;

    @JsonIgnore
    @OneToMany(mappedBy = "jobSeeker")
    private List<LinkCV> linkCV;

    @JsonIgnore
    @OneToMany(mappedBy = "jobSeeker")
    private List<CoverLetterCV> coverLetterCV;

    @JsonIgnore
    @OneToMany(mappedBy = "jobSeeker")
    private List<ImageCV> imageCV;

}
