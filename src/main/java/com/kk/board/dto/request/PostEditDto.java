package com.kk.board.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;

@Getter
public class PostEditDto {

    @NotBlank
    private String title;

    @NotBlank
    private String content;
}
