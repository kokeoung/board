package com.kk.board.dto.response;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Getter
@RequiredArgsConstructor
public class PostEditResponseDto {

    private Long id;
    private String title;
    private String author;
    private String content;
    private LocalDateTime updatedAt;

    public PostEditResponseDto(Long id, String title, String author, String content, LocalDateTime updatedAt) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.content = content;
        this.updatedAt = updatedAt;
    }
}
