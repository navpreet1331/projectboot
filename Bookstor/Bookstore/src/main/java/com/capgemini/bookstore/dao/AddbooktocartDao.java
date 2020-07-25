package com.capgemini.bookstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.bookstore.entity.Addbooktocart;

@Repository
public interface AddbooktocartDao extends JpaRepository<Addbooktocart, Integer>{

}