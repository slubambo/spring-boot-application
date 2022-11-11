package cerimp.model.general.memo;

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

import cerimp.enums.general.MemoArchive;
import cerimp.model.User;

@Entity
@Table(name = "user_group", uniqueConstraints = {
		@UniqueConstraint(columnNames = { "user_id", "group_name" }) })
public class UserGroup {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	@Size(min = 5)
	@Column(name = "group_name")
	private String groupName;

	private MemoArchive status;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = false)
	private User user;

	@OneToMany(mappedBy = "userGroup", fetch = FetchType.LAZY)
	private Set<UserGroupMembers> userGroupMembers;

	@OneToMany(mappedBy = "userGroup", fetch = FetchType.LAZY)
	private Set<GroupReceiver> groupReceiver;

	public UserGroup() {

	}

	public MemoArchive getStatus() {
		return status;
	}

	public void setStatus(MemoArchive status) {
		this.status = status;
	}

	public Set<UserGroupMembers> getUserGroupMembers() {
		return userGroupMembers;
	}

	public void setUserGroupMembers(Set<UserGroupMembers> userGroupMembers) {
		this.userGroupMembers = userGroupMembers;
	}

	public Set<GroupReceiver> getGroupReceiver() {
		return groupReceiver;
	}

	public void setGroupReceiver(Set<GroupReceiver> groupReceiver) {
		this.groupReceiver = groupReceiver;
	}

	public UserGroup(String groupName) {
		this.groupName = groupName;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Set<UserGroupMembers> getMemoGroupMember() {
		return userGroupMembers;
	}

	public void setMemoGroupMember(Set<UserGroupMembers> userGroupMembers) {
		this.userGroupMembers = userGroupMembers;
	}

	public Set<GroupReceiver> getMemoGroupReceive() {
		return groupReceiver;
	}

	public void setMemoGroupReceive(Set<GroupReceiver> groupReceiver) {
		this.groupReceiver = groupReceiver;
	}

}
