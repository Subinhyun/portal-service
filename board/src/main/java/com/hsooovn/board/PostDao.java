package com.hsooovn.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PostDao {
    private final PostRepository postRepository;

    public PostDao(@Autowired PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public void createPost(PostDto postDto) {
        PostEntity postEntity = new PostEntity();
        postEntity.setTitle(postDto.getTitle());
        postEntity.setContent(postDto.getContent());
        postEntity.setWriter(postDto.getWriter());
        this.postRepository.save(postEntity);
    }
}
