package ieg.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "job_seeker_cv_educations")
public class EducationCV {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "school_name")
    private String schoolName;

    @Column(name = "department_name")
    private String departmentType;

    @Column(name = "start_name")
    private Date startDate;

    @Column(name = "graduation_date")
    private Date graduationDate;

    @ManyToOne()
    @JoinColumn(name = "job_seeker_id")
    private JobSeeker jobSeeker;

}
