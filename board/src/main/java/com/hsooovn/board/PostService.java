package com.hsooovn.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    private final PostDao postDao;

    public PostService(@Autowired PostDao postDao) {
        this.postDao = postDao;
    }

    public void createPost(PostDto postDto) {
        this.postDao.createPost(postDto);
    }
}
