package org.tracker.issue.entities;

import java.util.Date;
import java.util.Map;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;

import org.springframework.data.annotation.Id;

public class Project {
	
	@Id
	private String id;
	@NotBlank(message="Title can not be null.")
	private String title;
	private String createdBy;
	private Date createdOn;
	@NotNull(message="Team members can not be null.")
	private Map<Role,String> teamMembers;
	
	
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
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String cretedBy) {
		this.createdBy = cretedBy;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	public Map<Role, String> getTeamMembers() {
		return teamMembers;
	}
	public void setTeamMembers(Map<Role, String> teamMembers) {
		this.teamMembers = teamMembers;
	}
	

	

}
