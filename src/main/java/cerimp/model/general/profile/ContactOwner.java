package cerimp.model.general.profile;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "contact_owner")
public class ContactOwner {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	@OneToMany(mappedBy = "contactOwner", fetch = FetchType.LAZY)
	private Set<Contacts> contacts;

	@OneToMany(mappedBy = "contactOwner", fetch = FetchType.LAZY)
	private Set<Person> person;

	@OneToMany(mappedBy = "contactOwner", fetch = FetchType.LAZY)
	private Set<AffiliatePerson> affiliatePerson;

	public ContactOwner() {

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

	public void setName(String name) {
		this.name = name;
	}

	public Set<Contacts> getContacts() {
		return contacts;
	}

	public void setContacts(Set<Contacts> contacts) {
		this.contacts = contacts;
	}

	public Set<Person> getPerson() {
		return person;
	}

	public void setPerson(Set<Person> person) {
		this.person = person;
	}

	public Set<AffiliatePerson> getAffiliatePerson() {
		return affiliatePerson;
	}

	public void setAffiliatePerson(Set<AffiliatePerson> affiliatePerson) {
		this.affiliatePerson = affiliatePerson;
	}

}
