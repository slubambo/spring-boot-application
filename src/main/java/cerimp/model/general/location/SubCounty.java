package cerimp.model.general.location;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "subCounty")

public class SubCounty {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	private String code;

	@OneToMany(mappedBy = "subCounty", fetch = FetchType.LAZY)
	private Set<Parish> parish;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "countyId", nullable = false)
	private County county;

	public SubCounty() {
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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Set<Parish> getParish() {
		return parish;
	}

	public void setParish(Set<Parish> parish) {
		this.parish = parish;
	}

	public County getCounty() {
		return county;
	}

	public void setCounty(County county) {
		this.county = county;
	}

}