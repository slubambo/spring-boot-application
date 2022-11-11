package cerimp.model.general.memo;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import cerimp.model.audit.DateAudit;

@Entity
@Table(name = "group_receive")
public class GroupReceiver extends DateAudit {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_group_id", nullable = false)
	private UserGroup userGroup;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "memo_id", nullable = false)
	private Memo memo;

	public GroupReceiver() {
		super();
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

	public Memo getMemo() {
		return memo;
	}

	public void setMemo(Memo memo) {
		this.memo = memo;
	}

}
