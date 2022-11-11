package cerimp.model.general.memo;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.Type;

import cerimp.enums.general.MemoArchive;
import cerimp.enums.general.MemoStatus;
import cerimp.enums.general.MemoType;
import cerimp.model.User;
import cerimp.model.audit.UserDateAudit;
import cerimp.model.general.files.FilesUpload;

@Entity
@Table(name = "memo")
public class Memo extends UserDateAudit {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	private String subject;

	@OneToOne
	private User user;

	@Type(type = "text")
	private String body;

	@Type(type = "text")
	private String receiver;

	private MemoStatus status;

	private MemoArchive senderArchive;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "file_id", nullable = true)
	private FilesUpload filesUpload;

	@OneToOne(fetch = FetchType.LAZY)
	private Memo memo; // self referencing (threading)

	private MemoType type;

	@OneToMany(mappedBy = "memo", fetch = FetchType.LAZY)
	private Set<MemoBroadcast> memoBroadcast;

	@OneToMany(mappedBy = "memo", fetch = FetchType.LAZY)
	private Set<MemoReceiver> memoReceiver;

	@OneToMany(mappedBy = "memo", fetch = FetchType.LAZY)
	private Set<GroupReceiver> groupReceiver;

	@OneToMany(mappedBy = "memo", fetch = FetchType.LAZY)
	private Set<MemoGroup> memoGroup;

	@OneToMany(mappedBy = "memo", fetch = FetchType.LAZY)
	private Set<MemoAttachment> memoAttachment;

	public Memo() {

	}

	public Memo(String subject, String body, MemoStatus status, MemoType type) {
		super();
		this.subject = subject;
		this.body = body;
		this.status = status;
		this.type = type;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public MemoStatus getStatus() {
		return status;
	}

	public void setStatus(MemoStatus status) {
		this.status = status;
	}

	public MemoArchive getSenderArchive() {
		return senderArchive;
	}

	public void setSenderArchive(MemoArchive senderArchive) {
		this.senderArchive = senderArchive;
	}

	public FilesUpload getFilesUpload() {
		return filesUpload;
	}

	public void setFilesUpload(FilesUpload filesUpload) {
		this.filesUpload = filesUpload;
	}

	public Memo getMemo() {
		return memo;
	}

	public void setMemo(Memo memo) {
		this.memo = memo;
	}

	public MemoType getType() {
		return type;
	}

	public void setType(MemoType type) {
		this.type = type;
	}

	public Set<MemoBroadcast> getMemoBroadcast() {
		return memoBroadcast;
	}

	public void setMemoBroadcast(Set<MemoBroadcast> memoBroadcast) {
		this.memoBroadcast = memoBroadcast;
	}

	public Set<MemoReceiver> getMemoReceiver() {
		return memoReceiver;
	}

	public void setMemoReceiver(Set<MemoReceiver> memoReceiver) {
		this.memoReceiver = memoReceiver;
	}

	public Set<GroupReceiver> getGroupReceiver() {
		return groupReceiver;
	}

	public void setGroupReceiver(Set<GroupReceiver> groupReceiver) {
		this.groupReceiver = groupReceiver;
	}

	public Set<MemoGroup> getMemoGroup() {
		return memoGroup;
	}

	public void setMemoGroup(Set<MemoGroup> memoGroup) {
		this.memoGroup = memoGroup;
	}

	public Set<MemoAttachment> getMemoAttachment() {
		return memoAttachment;
	}

	public void setMemoAttachment(Set<MemoAttachment> memoAttachment) {
		this.memoAttachment = memoAttachment;
	}

}
