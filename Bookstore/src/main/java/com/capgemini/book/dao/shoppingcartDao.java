package com.capgemini.book.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.book.entity.shoppingcartDao;

public interface shoppingcartDao extends JpaRepository<shoppingcart, Integer> {

}
