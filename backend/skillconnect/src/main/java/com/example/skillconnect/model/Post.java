package com.example.skillconnect.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "posts") // This tells Spring Data MongoDB to treat this as a MongoDB collection.
public class Post {

    @Id
    private String id; // In MongoDB, the ID is typically a String (ObjectId), not Long.

    private String title;
    private String content;

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Setter for title
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter for content
    public String getContent() {
        return content;
    }

    // Setter for content
    public void setContent(String content) {
        this.content = content;
    }

    // You can also add constructors if needed
    public Post(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
