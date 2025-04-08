package com.example.skillconnect.service;

import com.example.skillconnect.model.Post;
import com.example.skillconnect.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    // Create Post
    public Post createPost(Post post) {
        return postRepository.save(post);
    }

    // Get All Posts
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    // Get Single Post by ID
    public Optional<Post> getPostById(String id) {
        return postRepository.findById(id);
    }

    // Update Post
    public Post updatePost(String id, Post postDetails) {
        Post post = postRepository.findById(id).orElseThrow(() -> new RuntimeException("Post not found"));
        post.setTitle(postDetails.getTitle());
        post.setContent(postDetails.getContent());
        return postRepository.save(post);
    }

    // Delete Post
    public void deletePost(String id) {
        Post post = postRepository.findById(id).orElseThrow(() -> new RuntimeException("Post not found"));
        postRepository.delete(post);
    }
}
