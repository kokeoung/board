package com.kk.board.mapper;

import com.kk.board.dto.request.PostCreateRequestDto;
import com.kk.board.dto.response.PostCreateResponseDto;
import com.kk.board.dto.response.PostEditResponseDto;
import com.kk.board.dto.response.PostGetResponseDto;
import com.kk.board.entity.Post;

public class PostMapper {

    private PostMapper() {};

    public static PostEditResponseDto toEditResponse(Post post) {
        return new PostEditResponseDto(
                post.getId(),
                post.getTitle(),
                post.getAuthor(),
                post.getContent(),
                post.getUpdatedAt()
        );
    }

    public static PostGetResponseDto toGetResponse(Post post) {
        return new PostGetResponseDto(
                post.getId(),
                post.getTitle(),
                post.getAuthor(),
                post.getContent(),
                post.getCreatedAt(),
                post.getUpdatedAt()
        );
    }

    public static PostCreateResponseDto toPostResponse(Post post) {
        return new PostCreateResponseDto(
                post.getTitle(),
                post.getAuthor(),
                post.getContent()
        );
    }
}
