package ieg.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employers")
public class Employer extends User {

	@NotNull
	@Column(name = "company_name")
	private String companyName;

	@NotNull
	@Column(name = "website_address")
	private String websiteAddress;

	@NotNull
	@Column(name = "phone_number")
	private String phoneNumber;

}
