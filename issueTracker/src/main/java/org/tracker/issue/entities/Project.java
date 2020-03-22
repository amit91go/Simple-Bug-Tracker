package org.tracker.issue.entities;

import java.util.Date;
import java.util.Map;

public class Project {
	
	private String id;
	private String title;
	private String cretedBy;
	private Date createdOn;
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
	public String getCretedBy() {
		return cretedBy;
	}
	public void setCretedBy(String cretedBy) {
		this.cretedBy = cretedBy;
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
