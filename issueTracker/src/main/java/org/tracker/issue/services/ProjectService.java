package org.tracker.issue.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tracker.issue.entities.Project;
import org.tracker.issue.repositories.ProjectRepository;

@Service
public class ProjectService {
	
	@Autowired
	private ProjectRepository projectRepository;
	
	public Project createProject(Project project)
	{		
		Project newProject = new Project();
		newProject.setTitle(project.getTitle());
		Date date = new Date(System.currentTimeMillis());
		newProject.setCreatedOn(date);
		newProject.setCreatedBy(project.getCreatedBy());
		newProject.setTeamMembers(project.getTeamMembers());
		return projectRepository.save(newProject);
		
	}

}
