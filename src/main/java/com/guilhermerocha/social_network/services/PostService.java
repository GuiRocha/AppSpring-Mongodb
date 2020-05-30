package com.guilhermerocha.social_network.services;

import com.guilhermerocha.social_network.domain.Post;
import com.guilhermerocha.social_network.repository.PostRepository;
import com.guilhermerocha.social_network.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {
    @Autowired
    PostRepository postRepository;

    public Post findById(String id) {
        Optional<Post> obj = postRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
}
