package com.example.libraryms.service;

import com.example.libraryms.dto.AuthorDto;

import java.util.List;

public interface AuthorService {
    List<AuthorDto> getAll();
    AuthorDto getAuthorByID(long id);
    AuthorDto addAuthor(AuthorDto authorDto);
    AuthorDto updateAuthor(Long id, AuthorDto authorDto);
    Boolean deleteAuthor(Long id);
}
