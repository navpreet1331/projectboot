package com.capgemini.book.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.book.entity.Books;

public interface BooksDao extends JpaRepository<Books, Integer> {

}
