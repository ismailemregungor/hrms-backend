package ieg.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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

}
