package com.guilhermerocha.social_network.resources;

import com.guilhermerocha.social_network.domain.Post;
import com.guilhermerocha.social_network.services.PostService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(value = "posts")
@RequestMapping(value = "/posts")
public class PostResource {
    @Autowired
    private PostService postService;

    @ApiOperation(value = "Controller posts")
    @RequestMapping(value="/{id}", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Post> findById(@PathVariable String id) {
        Post obj = postService.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
