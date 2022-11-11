package cerimp.model.general.profile;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import cerimp.enums.general.ContactValidation;

@Entity
@Table(name = "contact_type")
public class ContactType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	@Size(max = 100)
	private String name;

	private ContactValidation contactValidation;

	@OneToMany(mappedBy = "contactType", fetch = FetchType.LAZY)
	private Set<Contacts> contacts;

	public ContactType() {

	}

	public ContactType(String name) {

		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public ContactValidation getContactValidation() {
		return contactValidation;
	}

	public void setContactValidation(ContactValidation contactValidation) {
		this.contactValidation = contactValidation;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Contacts> getContacts() {
		return contacts;
	}

	public void setContacts(Set<Contacts> contacts) {
		this.contacts = contacts;
	}

}
