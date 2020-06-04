package com.guilhermerocha.social_network.controller;

import com.guilhermerocha.social_network.model.Post;
import com.guilhermerocha.social_network.services.PostService;
import com.guilhermerocha.social_network.util.URL;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URLDecoder;
import java.util.List;

@RestController
@Api(value = "posts")
@RequestMapping(value = "/posts")
public class PostController {

    @Autowired
    private PostService postService;

    @ApiOperation(value = "Busca posts por id")
    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public ResponseEntity<Post> findById(@PathVariable String id) {
        Post obj = postService.findById(id);
        return ResponseEntity.ok().body(obj);
    }
    @RequestMapping(value="/titlesearch", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity <List<Post>> findByTitle(@RequestParam(value = "text", defaultValue = "") String text) {
        text = URL.descodeParam(text);
        List<Post> list  = postService.findByTitle(text);
        return ResponseEntity.ok().body(list);
    }

}
