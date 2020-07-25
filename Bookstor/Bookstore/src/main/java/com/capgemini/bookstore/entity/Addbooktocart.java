package com.capgemini.bookstore.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name="Addbooktocart")
@DynamicUpdate(true)
@DynamicInsert(true)
public class Addbooktocart {
	@Id
	@Column(name="addbooktocart_id")
	private Integer addbooktocartId;
	
	@Column(name="name")
	private String Bookname;
	
	@Column(name="email")
	private String email;
	
		public Integer getAddbooktocartId() {
		return addbooktocartId;
	}

	public void setAddbooktocartId(Integer addbooktocartId) {
		this.addbooktocartId = addbooktocartId;
	}

	public String getBookname() {
		return Bookname;
	}

	public void setBookname(String Bookname) {
		this.Bookname = Bookname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

	
	
	
	public Addbooktocart(int addbooktocartId,String Bookname,String email) {
		super();
		this.addbooktocartId = addbooktocartId;
		this.Bookname = Bookname;
		this.email = email;
		
	}
	
	public Addbooktocart() {
		super();
	}
	
	@Override
	public String toString() {
		return "Addbooktocart[addbooktocartId=" + addbooktocartId +", Bookname=" + Bookname +", email=" + email ;
	}
}
