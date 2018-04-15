package com.web.springangular.controller;

import com.web.springangular.db.entity.Posts;
import com.web.springangular.db.repository.PostsRepository;
import com.web.springangular.db.service.PostsService;
import com.web.springangular.domain.PostsMainResponseDto;
import com.web.springangular.domain.PostsSaveRequestDto;
import lombok.AllArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class WebRestController {

    private PostsService postsService;

    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }

    @PostMapping("/posts") // 게시판 등록
    public Long savePosts(@RequestBody PostsSaveRequestDto dto){
        return postsService.save(dto);
    }

    @GetMapping("/postLists") // 게시판 전체조회
    public List<PostsMainResponseDto> main(){
        return postsService.findAllDesc();
    }

    @DeleteMapping("/posts/{postsId}")
    public void deletedPosts(@PathVariable Long postsId){
        postsService.deletePosts(postsId);
    }

    @GetMapping("/posts/{postsId}")
    public Optional<Posts> getPost(@PathVariable Long postsId){
        return postsService.findPost(postsId);
    }

    @PutMapping("/posts/{postsId}")
    public Posts updatePost(@PathVariable Long postsId, @RequestBody Posts posts){
        return postsService.updatePost(postsId, posts);
    }

}
