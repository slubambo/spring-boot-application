package cerimp.model.general.profile;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Type;

import cerimp.enums.general.Gender;
import cerimp.enums.general.MaritalStatus;
import cerimp.enums.general.ReligiousAffiliation;
import cerimp.model.audit.UserDateAudit;
import cerimp.model.general.files.FilesUpload;
import cerimp.model.general.location.Diocese;
import cerimp.model.general.location.District;

@Entity
@Table(name = "person", uniqueConstraints = { @UniqueConstraint(columnNames = { "contact_owner_id" }) })
public class Person extends UserDateAudit {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Size(max = 100)
	private String title;

	@NotBlank
	@Size(max = 100)
	private String surname;

	@NotBlank
	@Size(max = 100)
	@Column(name = "first_name")
	private String firstName;

	@Size(max = 100)
	@Column(name = "other_name")
	private String otherName;

	private Date dateOfBirth;

	@Size(max = 50)
	@Column(name = "nin_number")
	private String ninNumber;

	@Size(max = 300)
	@Type(type = "text")
	private String hobbies;

	private Gender gender;

	private MaritalStatus maritalStatus;

	private Integer numberOfChildren;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "profile_pic_id", nullable = true)
	private FilesUpload filesUpload;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "home_district_id", nullable = true)
	private District district;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "diocese_id", nullable = true)
	private Diocese diocese;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "contact_owner_id", nullable = true)
	private ContactOwner contactOwner;

	private ReligiousAffiliation religiousAffiliation;

	@OneToMany(mappedBy = "person", fetch = FetchType.LAZY)
	private Set<EmploymentBackground> employmentBackground;

	private String disabilityDescription;

	public Person() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getOtherName() {
		return otherName;
	}

	public void setOtherName(String otherName) {
		this.otherName = otherName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNinNumber() {
		return ninNumber;
	}

	public void setNinNumber(String ninNumber) {
		this.ninNumber = ninNumber;
	}

	public String getHobbies() {
		return hobbies;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public MaritalStatus getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(MaritalStatus maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public Integer getNumberOfChildren() {
		return numberOfChildren;
	}

	public void setNumberOfChildren(Integer numberOfChildren) {
		this.numberOfChildren = numberOfChildren;
	}

	public FilesUpload getFilesUpload() {
		return filesUpload;
	}

	public void setFilesUpload(FilesUpload filesUpload) {
		this.filesUpload = filesUpload;
	}

	public District getDistrict() {
		return district;
	}

	public void setDistrict(District district) {
		this.district = district;
	}

	public Diocese getDiocese() {
		return diocese;
	}

	public void setDiocese(Diocese diocese) {
		this.diocese = diocese;
	}

	public ContactOwner getContactOwner() {
		return contactOwner;
	}

	public void setContactOwner(ContactOwner contactOwner) {
		this.contactOwner = contactOwner;
	}

	public ReligiousAffiliation getReligiousAffiliation() {
		return religiousAffiliation;
	}

	public void setReligiousAffiliation(ReligiousAffiliation religiousAffiliation) {
		this.religiousAffiliation = religiousAffiliation;
	}

	public Set<EmploymentBackground> getEmploymentBackground() {
		return employmentBackground;
	}

	public void setEmploymentBackground(Set<EmploymentBackground> employmentBackground) {
		this.employmentBackground = employmentBackground;
	}

	public String getDisabilityDescription() {
		return disabilityDescription;
	}

	public void setDisabilityDescription(String disabilityDescription) {
		this.disabilityDescription = disabilityDescription;
	}

}
