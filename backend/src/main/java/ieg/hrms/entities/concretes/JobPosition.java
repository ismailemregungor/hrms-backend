package ieg.hrms.entities.concretes;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "jobAdverts"})
@Data
@NoArgsConstructor
@Entity
@Table(name = "job_positions")
public class JobPosition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "position_name")
    private String positionName;

    @OneToMany(mappedBy = "jobPosition")
    private List<JobAdvert> jobAdvert;

    public JobPosition(String positionName, List<JobAdvert> jobAdvert) {
        super();
        this.positionName = positionName;
        this.jobAdvert = jobAdvert;
    }

}
