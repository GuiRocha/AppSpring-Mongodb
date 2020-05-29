package com.guilhermerocha.social_network.services;

import com.guilhermerocha.social_network.domain.Post;
import com.guilhermerocha.social_network.repository.PostRepository;
import com.guilhermerocha.social_network.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Optional;

@Service
public class PostService {
    @Autowired
    PostRepository postRepository;

    @GetMapping
    public Optional<Post> findById(String id){
        Optional<Post> post = postRepository.findById(id);
        if (post == null){
            throw new ObjectNotFoundException("Objeto não encotrado");
        }
        return post;
    }
}
