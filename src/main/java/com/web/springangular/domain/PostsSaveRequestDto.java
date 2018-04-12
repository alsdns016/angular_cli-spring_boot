package com.web.springangular.domain;

import com.web.springangular.db.entity.Posts;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PostsSaveRequestDto {

    private String title;
    private String content;
    private String author;
    private Long id;

    public Posts toEntity(){
        return Posts.builder()
                .title(title)
                .content(content)
                .author(author)
                .build();
    }

    public Posts toUpdate(){
        return Posts.builder()
                .id(id)
                .title(title)
                .content(content)
                .author(author)
                .build();
    }

}
