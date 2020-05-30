package com.guilhermerocha.social_network.resources;

import com.guilhermerocha.social_network.domain.Post;
import com.guilhermerocha.social_network.domain.User;
import com.guilhermerocha.social_network.repository.UserRepository;
import com.guilhermerocha.social_network.services.PostService;
import com.guilhermerocha.social_network.services.UserService;
import com.guilhermerocha.social_network.userDTO.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/users")
public class PostResource {
    @Autowired
    private PostService postService;

    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public ResponseEntity<Post> findById(@PathVariable String id) {
        Post obj = postService.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
