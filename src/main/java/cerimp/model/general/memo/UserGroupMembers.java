package cerimp.model.general.memo;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import cerimp.enums.general.MemoArchive;
import cerimp.model.User;

@Entity
@Table(name = "user_group_member")
public class UserGroupMembers {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_group_id", nullable = false)
	private UserGroup userGroup;

	private MemoArchive status;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = false)
	private User user;

	public UserGroupMembers() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UserGroup getMemoUserGroup() {
		return userGroup;
	}

	public void setMemoUserGroup(UserGroup userGroup) {
		this.userGroup = userGroup;
	}

	public UserGroup getUserGroup() {
		return userGroup;
	}

	public void setUserGroup(UserGroup userGroup) {
		this.userGroup = userGroup;
	}

	public MemoArchive getStatus() {
		return status;
	}

	public void setStatus(MemoArchive status) {
		this.status = status;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
