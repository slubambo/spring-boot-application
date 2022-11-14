package application.model.general.memo;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "user_group")
public class Group {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	@Column(name = "group_name")
	private String groupName;

	@OneToMany(mappedBy = "group", fetch = FetchType.LAZY)
	private Set<GroupMember> groupMember;

	@OneToMany(mappedBy = "group", fetch = FetchType.LAZY)
	private Set<MemoGroup> MemoGroup;

	public Group(@NotNull String groupName) {
		super();
		this.groupName = groupName;
	}

	public Group() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Set<GroupMember> getGroupMember() {
		return groupMember;
	}

	public void setGroupMember(Set<GroupMember> groupMember) {
		this.groupMember = groupMember;
	}

}
