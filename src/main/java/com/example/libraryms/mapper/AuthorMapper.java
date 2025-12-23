package com.example.libraryms.mapper;

import com.example.libraryms.dto.AuthorDto;
import com.example.libraryms.model.Author;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AuthorMapper{
    AuthorDto toDto(Author author);
    Author toEntity(AuthorDto authorDto);
    List<AuthorDto> toDtoList(List<Author> authorList);

}
