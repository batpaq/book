package com.book.spring.springboot.demo.dao;

import com.book.spring.springboot.demo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
