package cerimp.model.general.memo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import cerimp.enums.general.MemoArchive;
import cerimp.enums.general.MemoStatus;
import cerimp.model.User;
import cerimp.model.audit.DateAudit;

@Entity
@Table(name = "memo_receiver")

public class MemoReceiver extends DateAudit {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne(fetch = FetchType.LAZY)
	private User user;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "memo_id", nullable = false)
	private Memo memo;

	private MemoArchive memoArchive;

	private MemoArchive deleteMemo;

	@Column(name = "status")
	private MemoStatus status;

	public MemoReceiver() {

	}

	public MemoStatus getStatus() {
		return status;
	}

	public void setStatus(MemoStatus status) {
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Memo getMemo() {
		return memo;
	}

	public MemoArchive getDeleteMemo() {
		return deleteMemo;
	}

	public void setDeleteMemo(MemoArchive deleteMemo) {
		this.deleteMemo = deleteMemo;
	}

	public void setMemo(Memo memo) {
		this.memo = memo;
	}

	public MemoArchive getMemoArchive() {
		return memoArchive;
	}

	public void setMemoArchive(MemoArchive memoArchive) {
		this.memoArchive = memoArchive;
	}

}
