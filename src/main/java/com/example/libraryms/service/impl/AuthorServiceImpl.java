package com.example.libraryms.service.impl;

import com.example.libraryms.dto.AuthorDto;
import com.example.libraryms.mapper.AuthorMapper;
import com.example.libraryms.model.Author;
import com.example.libraryms.repository.AuthorRepository;
import com.example.libraryms.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {
    private final AuthorRepository authorRepository;
    private final AuthorMapper authorMapper;

    @Override
    public List<AuthorDto> getAll() {
        return authorMapper.toDtoList(authorRepository.findAll());
    }

    @Override
    public AuthorDto getAuthorByID(long id) {
        return authorMapper.toDto(authorRepository.findById(id).orElse(null));
    }

    @Override
    public AuthorDto addAuthor(AuthorDto authorDto) {
        return authorMapper.toDto(authorRepository.save(authorMapper.toEntity(authorDto)));
    }

    @Override
    public AuthorDto updateAuthor(Long id, AuthorDto authorDto) {
        Author author = authorMapper.toEntity(authorDto);
        Author updateAuthor = authorRepository.findById(id).orElse(null);
        updateAuthor.setName(author.getName());
        updateAuthor.setAuthorBiography(author.getAuthorBiography());
        return authorMapper.toDto(authorRepository.save(updateAuthor));
    }

    @Override
    public Boolean deleteAuthor(Long id) {
        if (authorRepository.existsById(id)){
            authorRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
