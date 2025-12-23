package com.example.libraryms.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookDto {

    private Long id;

    private String title;

    private String isbn;

    private Integer publicationYear;

    private Long authorId;         // только ID автора (как в примере препода)
    private String authorName;     // имя автора для отображения (опционально)
}