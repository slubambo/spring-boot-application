package cerimp.model.general.files;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import cerimp.enums.general.FileType;
import cerimp.model.User;
import cerimp.model.audit.UserDateAudit;
import cerimp.model.general.profile.AffiliatePerson;

@Entity
@Table(name = "user_profile_files")
public class UserProfileFile extends UserDateAudit {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String fileName;

	private FileType fileType;

	private String description;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "file_id", nullable = true)
	private FilesUpload filesUpload;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = true)
	private User user;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "affiliate_person_id", nullable = true)
	private AffiliatePerson affiliatePerson;

	public UserProfileFile() {
	}

	public UserProfileFile(String fileName, FileType fileType, String description) {
		super();
		this.fileName = fileName;
		this.fileType = fileType;
		this.description = description;
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

	public FileType getFileType() {
		return fileType;
	}

	public void setFileType(FileType fileType) {
		this.fileType = fileType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public FilesUpload getFilesUpload() {
		return filesUpload;
	}

	public void setFilesUpload(FilesUpload filesUpload) {
		this.filesUpload = filesUpload;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public AffiliatePerson getAffiliatePerson() {
		return affiliatePerson;
	}

	public void setAffiliatePerson(AffiliatePerson affiliatePerson) {
		this.affiliatePerson = affiliatePerson;
	}

}
