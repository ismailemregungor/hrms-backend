package ieg.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "job_seekers_cover_letter_cv")
public class CoverLetterCV {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "content")
    private String content;

    public CoverLetterCV(String content, int jobSeekerId) {
        super();
        this.content = content;
        this.jobSeeker.setId(jobSeekerId);
    }

    @ManyToOne()
    @JsonIgnore
    @JoinColumn(name = "job_seeker_id")
    private JobSeeker jobSeeker;

}
