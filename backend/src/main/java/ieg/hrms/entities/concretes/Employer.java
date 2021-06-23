package ieg.hrms.entities.concretes;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import java.util.List;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "jobAdverts"})
@EqualsAndHashCode(callSuper = false)
@PrimaryKeyJoinColumn(name = "user_id")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employers")
public class Employer extends User {

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "website_address")
    private String websiteAddress;

    @Column(name = "phone_number")
    private String phoneNumber;

    @OneToMany(mappedBy = "employer")
    private List<JobAdvert> jobAdverts;

}
