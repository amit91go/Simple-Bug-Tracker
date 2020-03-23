package org.tracker.issue.controllers;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.tracker.issue.entities.Project;
import org.tracker.issue.entities.Role;
import org.tracker.issue.services.ProjectService;

@RestController
public class ProjectController {
	
	@Autowired
	private ProjectService projectService;

	
	/*@PostMapping("/projects")
	@ResponseStatus(HttpStatus.CREATED)
	public Project createProject(@Valid @RequestBody Project jsonProject) {		
		return projectService.createProject(jsonProject);		
	}*/
	
	@PostMapping("/projects")
	@ResponseStatus(HttpStatus.CREATED)	
	public Project createProject() {
		Project jsonProject = new Project();
		jsonProject.setTitle("title");
		jsonProject.setCreatedBy("5e781053fbdd4b183c5692a4");
		Map<Role,String> teamMembers = new HashMap<Role,String>();
		teamMembers.put(Role.Manager, "5e781053fbdd4b183c5692a4");
		teamMembers.put(Role.Developer, "5e78105cfbdd4b183c5692a5");
		teamMembers.put(Role.Tester, "5e78ff744891d41977e60c9b");
		jsonProject.setTeamMembers(teamMembers);
		return projectService.createProject(jsonProject);		
	}


}
