package com.fastcampus.board.domain;

import java.time.LocalDateTime;

public class ArticleComment {
    private Long id;
    private String title;
    private String content;

    private LocalDateTime createAt;
    private String createBy;
    private LocalDateTime modifiedAt;
    private String modifiedBy;
}
