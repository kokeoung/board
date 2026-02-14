package com.kk.board.service;

import com.kk.board.dto.request.PostEditDto;
import com.kk.board.dto.response.PostEditResponseDto;
import com.kk.board.dto.response.PostGetResponseDto;
import com.kk.board.entity.Post;
import com.kk.board.mapper.PostMapper;
import com.kk.board.repository.PostRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class PostService {

    private final PostRepository postRepository;

    public Post savePost(Post post) {
        return postRepository.save(post);
    }

    public List<Post> selectAllPosts() {
        return postRepository.findAll();
    }

    public PostGetResponseDto selectOne(Long postId) {
        Post post = postRepository.findById(postId)
                .orElseThrow(() -> new RuntimeException("게시글을 찾을 수 없습니다."));

        return PostMapper.toGetResponse(post);
    }

    public PostEditResponseDto editPosts(Long postId, PostEditDto editDto) {
        Post post = postRepository.findById(postId)
                .orElseThrow(() -> new RuntimeException("게시글을 찾을 수 없습니다."));

        post.update(editDto.getTitle(), editDto.getContent());

        return PostMapper.toEditResponse(post);
    }
}
