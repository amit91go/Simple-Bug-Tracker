package org.tracker.issue.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.tracker.issue.entities.Project;

public interface ProjectRepository extends MongoRepository<Project,String>{

}
