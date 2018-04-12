package com.web.springangular.db.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Optional;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
@Entity
public class Posts extends BaseTimeEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // GenerationType.IDENTITY...!!!
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }

    @Builder
    public Posts(Long id, String title, String content, String author){
        this.id = id;
        this.title = title;
        this.content = content;
        this.author = author;
    }

}
