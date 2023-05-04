package com.cracken.bookseller.Repository;

import com.cracken.bookseller.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface I_BookRepository extends JpaRepository<Book, Long> {


}
