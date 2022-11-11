package cerimp.model.general.files;

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

import cerimp.enums.general.FileType;
import cerimp.enums.general.SectionDocumentOwner;
import cerimp.model.User;
import cerimp.model.audit.UserDateAudit;
import cerimp.model.general.memo.Memo;
import cerimp.model.general.profile.Person;

@Entity
@Table(name = "file")
public class FilesUpload extends UserDateAudit {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String fileName;

	private String fileType;

	private FileType type;

	@Column(name = "section_document_owner", nullable = true)
	private SectionDocumentOwner sectionDocumentOwner;

	@Column(name = "file_path")
	private String filePath;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = true)
	private User owner;

	private String fileSummary;

	@OneToMany(mappedBy = "filesUpload", fetch = FetchType.LAZY)
	private Set<UserProfileFile> userProfileFiles;

	@OneToMany(mappedBy = "filesUpload", fetch = FetchType.LAZY)
	private Set<Memo> memo;

	@OneToMany(mappedBy = "filesUpload", fetch = FetchType.LAZY)
	private Set<Person> person;

	public FilesUpload() {
	}

	public FilesUpload(String fileName, String fileType, String filePath) {

		this.fileName = fileName;
		this.fileType = fileType;
		this.filePath = filePath;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public FileType getType() {
		return type;
	}

	public void setType(FileType type) {
		this.type = type;
	}

	public SectionDocumentOwner getSectionDocumentOwner() {
		return sectionDocumentOwner;
	}

	public void setSectionDocumentOwner(SectionDocumentOwner sectionDocumentOwner) {
		this.sectionDocumentOwner = sectionDocumentOwner;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}

	public String getFileSummary() {
		return fileSummary;
	}

	public void setFileSummary(String fileSummary) {
		this.fileSummary = fileSummary;
	}

	public Set<UserProfileFile> getUserProfileFiles() {
		return userProfileFiles;
	}

	public void setUserProfileFiles(Set<UserProfileFile> userProfileFiles) {
		this.userProfileFiles = userProfileFiles;
	}

	public Set<Memo> getMemo() {
		return memo;
	}

	public void setMemo(Set<Memo> memo) {
		this.memo = memo;
	}

	public Set<Person> getPerson() {
		return person;
	}

	public void setPerson(Set<Person> person) {
		this.person = person;
	}

}
