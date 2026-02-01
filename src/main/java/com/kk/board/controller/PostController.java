package com.kk.board.controller;

import com.kk.board.entity.Post;
import com.kk.board.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @PostMapping("/write")
    public Post createPost(@RequestBody Post post) {
        return postService.savePost(post);
    }

    @GetMapping("/list")
    public List<Post> selectAllPosts() {
        return postService.selectAllPosts();
    }
}
