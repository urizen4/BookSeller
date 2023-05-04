package com.cracken.bookseller.service;

import com.cracken.bookseller.Repository.I_BookRepository;
import com.cracken.bookseller.models.Book;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class BookService implements  I_BookService{

    private final I_BookRepository bookRepository;

    public BookService(I_BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book saveBook(Book book)
    {
     book.setCreatedAt(LocalDateTime.now());
     return bookRepository.save(book);
    }

    @Override
    public void deleteBook(Long bookId){

        bookRepository.deleteById(bookId);
    }

    @Override
    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }
}
