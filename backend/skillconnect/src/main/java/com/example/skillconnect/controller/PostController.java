package com.example.skillconnect.controller;

import com.example.skillconnect.model.Post;
import com.example.skillconnect.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/posts")
public class PostController {

    @Autowired
    private PostService postService;

    // Create Post
    @PostMapping
    public Post createPost(@RequestBody Post post) {
        return postService.createPost(post);
    }

    // Get All Posts
    @GetMapping
    public List<Post> getAllPosts() {
        return postService.getAllPosts();
    }

    // Get Single Post by ID
    @GetMapping("/{id}")
    public Optional<Post> getPostById(@PathVariable String id) {
        return postService.getPostById(id);
    }

    // Update Post
    @PutMapping("/{id}")
    public Post updatePost(@PathVariable String id, @RequestBody Post postDetails) {
        return postService.updatePost(id, postDetails);
    }

    // Delete Post
    @DeleteMapping("/{id}")
    public void deletePost(@PathVariable String id) {
        postService.deletePost(id);
    }
}
