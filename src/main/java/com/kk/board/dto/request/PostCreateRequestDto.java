package com.kk.board.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class PostCreateRequestDto {

    @NotBlank
    private String title;

    @NotBlank
    private String author;

    @NotBlank
    private String content;
}
