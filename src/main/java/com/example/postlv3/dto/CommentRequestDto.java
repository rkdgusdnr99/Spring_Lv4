package com.example.postlv3.dto;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CommentRequestDto {
    private Long postid;
    private String contents;
}