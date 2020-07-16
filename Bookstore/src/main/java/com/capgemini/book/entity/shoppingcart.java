package com.capgemini.book.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;


@Entity
@Table(name="shoppingcart_table")
public class shoppingcart {

	@Id
	@Column(name="numberofbooks",length=6)
	Integer numberofbooks;

	public Integer getNumberofbooks() {
		return numberofbooks;
	}

	public void setNumberofbooks(Integer numberofbooks) {
		this.numberofbooks = numberofbooks;
	}
	
	
	
	
}
