package com.fernando.workshopmongo.repository;

import com.fernando.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface UserRepository extends MongoRepository<User, String> {
}
