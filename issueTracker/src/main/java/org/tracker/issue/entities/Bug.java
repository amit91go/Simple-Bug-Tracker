package org.tracker.issue.entities;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;

import org.springframework.data.annotation.Id;

public class Bug {
	
	@Id
	private String id;
	@NotBlank(message="Title can not be null.")
	private String title;
	@NotBlank(message="Description can not be null.")
	private String description;
	@NotNull(message="Status can not be null.")
	private Status status;
	@NotBlank(message="AssignedTo can not be null.")
	private String assignedTo;
	@NotBlank(message="Project can not be null.")
	private String fromProject; 
	private Date createdOn;
	private String createdBy;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public String getAssignedTo() {
		return assignedTo;
	}
	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}
	public String getFromProject() {
		return fromProject;
	}
	public void setFromProject(String fromProject) {
		this.fromProject = fromProject;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	
	
	
}
