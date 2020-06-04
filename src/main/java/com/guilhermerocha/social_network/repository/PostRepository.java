package com.guilhermerocha.social_network.repository;

import com.guilhermerocha.social_network.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
    List<Post> findAllByTitleContainingIgnoreCase(String text);
}
