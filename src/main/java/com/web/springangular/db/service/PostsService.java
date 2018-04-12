package com.web.springangular.db.service;

import com.web.springangular.db.entity.Posts;
import com.web.springangular.db.repository.PostsRepository;
import com.web.springangular.domain.PostsMainResponseDto;
import com.web.springangular.domain.PostsSaveRequestDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class PostsService {

    private PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto dto){
        return postsRepository.save(dto.toEntity()).getId();
    }

    @Transactional(readOnly = true)
    public List<PostsMainResponseDto> findAllDesc() {
        return postsRepository.findAllDesc()
                .map(PostsMainResponseDto::new)
                .collect(Collectors.toList());
    }

    @Transactional
    public void deletePosts(Long postsId){
        postsRepository.deleteById(postsId);
    }

    @Transactional
    public Optional<Posts> findPost(Long postsId){
        return postsRepository.findById(postsId);
    }



}
