package com.library.api.service;

import com.library.api.entity.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface BookService {

    Book save(Book book);

    Optional<Book> getById(Long id);

    Book update(Book book);

    void delete(Book book);

    Page<Book> find(Book filter, Pageable pageRequest);

    Optional<Book> getBookByIsbn(String isbn);
}
