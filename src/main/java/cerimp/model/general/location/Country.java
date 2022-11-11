package cerimp.model.general.location;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "country")

public class Country {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String countryCode;

	private String countryName;

	private String nationality;

	private String dialCode;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "country", orphanRemoval = true, fetch = FetchType.LAZY)
	private Set<District> district;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "country", orphanRemoval = true, fetch = FetchType.LAZY)
	private Set<Diocese> diocese;

	public Country(String country_name, String countryCode) {
		this.countryName = country_name;
		this.countryCode = countryCode;

	}

	public Country() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCountry_name() {
		return countryName;
	}

	public void setCountry_name(String country_name) {
		this.countryName = country_name;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getDialCode() {
		return dialCode;
	}

	public void setDialCode(String dialCode) {
		this.dialCode = dialCode;
	}

	public Set<District> getDistrict() {
		return district;
	}

	public void setDistrict(Set<District> district) {
		this.district = district;
	}

	public Set<Diocese> getDiocese() {
		return diocese;
	}

	public void setDiocese(Set<Diocese> diocese) {
		this.diocese = diocese;
	}

}
