package com.cracken.bookseller.service;

import com.cracken.bookseller.models.Book;

import java.util.List;

public interface I_BookService {
    Book saveBook(Book book);

    void deleteBook(Long bookId);


    List<Book> getAllBooks();
}
