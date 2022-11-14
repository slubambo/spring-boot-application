package application.model.general.profile;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import application.model.audit.DateAudit;

@Entity
@Table(name = "contact")
public class Contacts extends DateAudit {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Size(max = 100)
	private String value;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "contact_type_id", nullable = true)
	private ContactType contactType;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "contact_owner_id", nullable = true)
	private ContactOwner contactOwner;

	public Contacts() {
	}

	public Contacts(String value) {

		this.value = value;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public ContactType getContactType() {
		return contactType;
	}

	public void setContactType(ContactType contactType) {
		this.contactType = contactType;
	}

	public ContactOwner getContactOwner() {
		return contactOwner;
	}

	public void setContactOwner(ContactOwner contactOwner) {
		this.contactOwner = contactOwner;
	}

}
