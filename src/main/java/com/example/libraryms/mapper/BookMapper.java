package com.example.libraryms.mapper;

import com.example.libraryms.dto.BookDto;
import com.example.libraryms.model.Book;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BookMapper {

    @Mapping(target = "authorId", source = "author.id")
    @Mapping(target = "authorName", source = "author.name")
    BookDto toDto(Book book);

    @Mapping(target = "author", ignore = true)  // автор устанавливается отдельно по ID
    Book toEntity(BookDto dto);

    List<BookDto> toDtoList(List<Book> books);

    void updateEntityFromDto(BookDto dto, @MappingTarget Book book);
}