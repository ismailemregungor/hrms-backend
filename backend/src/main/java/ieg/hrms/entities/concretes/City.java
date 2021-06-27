package ieg.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.List;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "jobAdverts"})
@NoArgsConstructor
@Data
@Entity
@Table(name = "cities")
public class City {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "city_name")
    private String cityName;

    @OneToMany(mappedBy = "city")
    private List<JobAdvert> jobAdvert;

    public City(String cityName, List<JobAdvert> jobAdvert) {
        super();
        this.cityName = cityName;
        this.jobAdvert = jobAdvert;
    }

}
