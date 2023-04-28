package com.bunne.book.springboot.web.dto;

import com.bunne.book.springboot.domain.posts.Posts;
import lombok.Getter;

import javax.persistence.Entity;

@Getter
public class PostsResponseDto {

    private Long id;
    private String title;
    private String content;
    private String author;

    public PostsResponseDto(Posts entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
    }
}
