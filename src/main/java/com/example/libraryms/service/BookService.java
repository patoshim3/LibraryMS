package com.example.libraryms.service;

import com.example.libraryms.dto.BookDto;
import java.util.List;

public interface BookService {

    List<BookDto> getAll();

    BookDto getById(Long id);

    void addBook(BookDto dto);

    void updateBook(Long id, BookDto dto);

    boolean deleteBook(Long id);
}
