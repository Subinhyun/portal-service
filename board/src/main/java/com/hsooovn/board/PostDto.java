package com.hsooovn.board;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Setter
@Getter
@ToString
public class PostDto {
    private int id;

    @NotBlank
    @NotNull(message = "title not null")
    private String title;

    @NotBlank
    private String content;

    private String writer;

    public PostDto(int i, String title, String content, String writer) {
    }
}
