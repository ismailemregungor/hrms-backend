package ieg.hrms.entities.concretes;

import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "jobAdverts"})
@Data
@NoArgsConstructor
@AllArgsConstructor
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

}
