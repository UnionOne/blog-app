package com.github.union.blog.dto;

/**
 * Created by union on 7/05/16.
 */

public class PostModel {

    private String name;
    private String description;
    private String content;
    private String author;

    public PostModel() {
        super();
        // default constructor
    }

    public PostModel(String name, String description, String content, String author) {
        this.name = name;
        this.description = description;
        this.content = content;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "PostModel{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", content='" + content + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}