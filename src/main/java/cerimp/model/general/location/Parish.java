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
@Table(name = "parish")
public class Parish {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	private String code;

	@OneToMany(mappedBy = "parish", fetch = FetchType.LAZY)
	private Set<Village> village;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "subCountyId", nullable = false)
	private SubCounty subCounty;

	public Parish() {

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

	public Set<Village> getVillage() {
		return village;
	}

	public void setVillage(Set<Village> village) {
		this.village = village;
	}

	public SubCounty getSubCounty() {
		return subCounty;
	}

	public void setSubCounty(SubCounty subCounty) {
		this.subCounty = subCounty;
	}

}
