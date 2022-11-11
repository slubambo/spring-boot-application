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
@Table(name = "county")

public class County {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "districtId", nullable = false)
	private District district;

	@OneToMany(mappedBy = "county", fetch = FetchType.LAZY)
	private Set<SubCounty> subCounty;

	public County() {

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

	public District getDistrict() {
		return district;
	}

	public void setDistrict(District district) {
		this.district = district;
	}

	public Set<SubCounty> getSubCounty() {
		return subCounty;
	}

	public void setSubCounty(Set<SubCounty> subCounty) {
		this.subCounty = subCounty;
	}

}