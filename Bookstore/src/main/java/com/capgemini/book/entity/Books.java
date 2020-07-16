package com.capgemini.book.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Entity;

@Entity
@Table(name="Books_details")
public class Books {
	
	@Id
	@Column(name="Book_id",length=6)
	Integer bookid;
	String bookname;
	String bookgenre;
	
	
	
	public Integer getBookid() {
		return bookid;
	}

	public void setBookid(Integer bookid) {
		this.bookid = bookid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getBookgenre() {
		return bookgenre;
	}

	public void setBookgenre(String bookgenre) {
		this.bookgenre = bookgenre;
	}

	public Integer getbookid() {
		return bookid;
	}

	public void setCustomerid(Integer bookid) {
		this.bookid = bookid;
	}

	

}