package com.bibliotek.springbootlibrary.dao;

import com.bibliotek.springbootlibrary.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
