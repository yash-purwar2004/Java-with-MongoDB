package com.example.joblisting.Controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.joblisting.Repository.PostRespository;
import com.example.joblisting.Repository.SearchRepository;
import com.example.joblisting.model.Post;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class PostController {

    @Autowired
    PostRespository repo;

    @Autowired
    SearchRepository srepo;

    @GetMapping("/posts")
    @CrossOrigin
    public List<Post> getAllPosts() {
        return repo.findAll();
    }

    @GetMapping("/posts/{text}")
    @CrossOrigin
    public List<Post> search(@PathVariable String text) {
        return srepo.findByText(text);
    }

    @PostMapping("/post")
    @CrossOrigin
    public Post addPost(@RequestBody Post post) {
        return repo.save(post);
    }
}

