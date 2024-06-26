package com.btistudy.board.domain;

import java.time.LocalDateTime;

public class Ex00_1_Article {
    private Long id; // 고유번호
    private String title; // 제목
    private String content; // 본문
    private String hashtag; // 해시태그


    // 메타데이터
    private LocalDateTime createdAt; // 생성일시
    private String createdBy; // 생성자
    private LocalDateTime modifiedAt; // 수정일시
    private String modifiedBy; // 수정자
}
