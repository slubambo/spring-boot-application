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

import cerimp.enums.general.ChildType;
import cerimp.enums.general.KinRelationshipType;
import cerimp.enums.general.MarriageType;
import cerimp.enums.general.RelationshipType;
import cerimp.model.audit.DateAudit;
import cerimp.model.general.files.UserProfileFile;
import cerimp.model.general.location.Country;

@Entity
@Table(name = "affiliate_person")
public class AffiliatePerson extends DateAudit {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "other_name")
	private String otherName;

	@Column(name = "date_of_birth")
	private Date dob;

	private String nationality;

	@Column(name = "identity_number")
	private String identityNumber;

	@Column(name = "kin_relationship_type")
	private KinRelationshipType kinRelationshipType;

	@Column(name = "child_type")
	private ChildType childType;

	@Column(name = "insurance")
	private ChildType insurance;

	@Column(name = "marriage_type")
	private MarriageType marriageType;

	@Column(name = "relationship_type")
	private RelationshipType relationshipType;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "contact_owner_id", nullable = true)
	private ContactOwner contactOwner;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "country_id", nullable = true)
	private Country country;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "person_id", nullable = true)
	private Person person;

	@OneToMany(mappedBy = "affiliatePerson", fetch = FetchType.LAZY)
	private Set<UserProfileFile> userProfileFiles;

	public AffiliatePerson() {

	}

	public AffiliatePerson(String firstName, String otherName, RelationshipType relationshipType) {

		this.firstName = firstName;
		this.otherName = otherName;
		this.relationshipType = relationshipType;
	}

	public AffiliatePerson(String firstName, String otherName, String nationality) {
		this.firstName = firstName;
		this.otherName = otherName;
		this.nationality = nationality;
	}

	public AffiliatePerson(String firstName, String otherName) {

		this.firstName = firstName;
		this.otherName = otherName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}

	public KinRelationshipType getKinRelationshipType() {
		return kinRelationshipType;
	}

	public void setKinRelationshipType(KinRelationshipType kinRelationshipType) {
		this.kinRelationshipType = kinRelationshipType;
	}

	public ChildType getChildType() {
		return childType;
	}

	public void setChildType(ChildType childType) {
		this.childType = childType;
	}

	public ChildType getInsurance() {
		return insurance;
	}

	public void setInsurance(ChildType insurance) {
		this.insurance = insurance;
	}

	public MarriageType getMarriageType() {
		return marriageType;
	}

	public void setMarriageType(MarriageType marriageType) {
		this.marriageType = marriageType;
	}

	public RelationshipType getRelationshipType() {
		return relationshipType;
	}

	public void setRelationshipType(RelationshipType relationshipType) {
		this.relationshipType = relationshipType;
	}

	public ContactOwner getContactOwner() {
		return contactOwner;
	}

	public void setContactOwner(ContactOwner contactOwner) {
		this.contactOwner = contactOwner;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Set<UserProfileFile> getUserProfileFiles() {
		return userProfileFiles;
	}

	public void setUserProfileFiles(Set<UserProfileFile> userProfileFiles) {
		this.userProfileFiles = userProfileFiles;
	}

}
