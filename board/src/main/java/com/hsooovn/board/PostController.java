package com.hsooovn.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("post")
public class PostController {
    private final PostService postService;

    public PostController(@Autowired PostService postService) {
        this.postService = postService;
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void createPost(
            @Valid @RequestBody PostDto postDto
    ){
        this.postService.createPost(postDto);
    }

    @GetMapping("{id}")
    public PostDto readPost(
            @PathVariable("id") int id
    ){
        return this.postService.readPost(id);
    }

    @GetMapping("")
    public List<PostDto> readPostAll(){
        return this.postService.readPostAll();
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updatePost(
            @PathVariable("id") int id,
            @RequestBody PostDto postDto
    ){
        this.postService.updatePost(id, postDto);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deletePost(
            @PathVariable("id") int id
    ){
        this.postService.deletePost(id);
    }
}
