package com.example.skillconnect.repository;

import com.example.skillconnect.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {
}
