package com.cg.bookstore.entity;

import javax.persistence.Embeddable;
import javax.persistence.Column;
import javax.persistence.Id;

@Embeddable
public class Book {

	@Id
	@Column(name="book_id")
	private Integer id;
	@Column(name="title")
	private String title;
	@Column(name="author")
	private String author;
	@Column(name="price")
	private Double price;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author
				+ ", price=" + price + "]";
	}

}