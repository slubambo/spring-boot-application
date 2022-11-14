package application.model.general.memo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import application.model.audit.DateAudit;

@Entity
@Table(name = "memo_broadcast")
public class MemoBroadcast extends DateAudit {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "memo_id", nullable = false)
	private Memo memo;

	@NotNull
	@Column(name = "broadcast_type")
	private int broadcastType;

	public MemoBroadcast() {

	}

	public MemoBroadcast(@NotNull int broadcastType) {
		super();
		this.broadcastType = broadcastType;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Memo getMemo() {
		return memo;
	}

	public void setMemo(Memo memo) {
		this.memo = memo;
	}

	public int getBroadcastType() {
		return broadcastType;
	}

	public void setBroadcastType(int broadcastType) {
		this.broadcastType = broadcastType;
	}

}
