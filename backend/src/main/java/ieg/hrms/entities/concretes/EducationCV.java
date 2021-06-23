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
@Table(name = "job_seekers_education_cv")
public class EducationCV {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "school_name")
    private String schoolName;

    @Column(name = "department_name")
    private String departmentName;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "end_date", nullable = true)
    private Date endDate;

    @ManyToOne()
    @JoinColumn(name = "job_seeker_id")
    private JobSeeker jobSeeker;

}
