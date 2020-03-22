package org.tracker.issue.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.tracker.issue.entities.User;

public interface UserRepository extends MongoRepository<User,String>{

}
