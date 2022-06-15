package com.hsooovn.board;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Setter
@Getter
@ToString
public class PostDto {
    private int id;

    @NotBlank
    @NotNull(message = "title not null")
    private String title;

    @NotBlank
    @Size(max = 40, message = "size under 40")
    private String content;

    @Size(min = 3, max = 10, message = "size between 3 -10")
    private String writer;

    private int boardId;

    private String userId;
}
