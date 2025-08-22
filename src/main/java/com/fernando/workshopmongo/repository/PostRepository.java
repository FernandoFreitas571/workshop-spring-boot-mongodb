package com.fernando.workshopmongo.repository;

import com.fernando.workshopmongo.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface PostRepository extends MongoRepository<Post, String> {
}
