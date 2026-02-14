package com.kk.board.dto.response;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class PostCreateResponseDto {

    @NotBlank
    private String title;

    @NotBlank
    private String author;

    @NotBlank
    private String content;

    public PostCreateResponseDto(String title, String author, String content) {
        this.title = title;
        this.author = author;
        this.content = content;
    }
}
