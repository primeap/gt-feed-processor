package com.tandf.informa.ecommerce.gt.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_PRODUCTS")
public class Products implements Serializable {

	private static final long serialVersionUID = 5588091043435281176L;
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	@Column(name = "ID")
	private Long id;
	@Column(name = "NAME", insertable = true, length = 50, nullable = false, unique = false, updatable = true)
	private String name;
	@Column(name = "ISBN", insertable = true, length = 13, nullable = false, unique = true, updatable = true)
	private String isbn;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

}
