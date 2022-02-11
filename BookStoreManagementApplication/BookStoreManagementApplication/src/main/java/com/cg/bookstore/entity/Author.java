package com.cg.entity;

import java.util.Objects;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

public class Author {
	
	@Id
	@SequenceGenerator(name="mylogic",initialValue=100,allocationSize=1)
	@GeneratedValue(strategy=GenerationType.AUTO,generator="mylogic")
	private int id;
	
	private String name;
	
	private String email;
	
	private int no_of_books; //unique count of books published by author
	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public int getNo_of_books() {
		return no_of_books;
	}



	public void setNo_of_books(int no_of_books) {
		this.no_of_books = no_of_books;
	}



	public Author() {
		
	}

	

	public Author(String name, String email, int no_of_books) {
		super();
		this.name = name;
		this.email = email;
		this.no_of_books = no_of_books;
	}



	public Author(int id, String name, String email, int no_of_books) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.no_of_books = no_of_books;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(email, id, name, no_of_books);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Author other = (Author) obj;
		return Objects.equals(email, other.email) && id == other.id && Objects.equals(name, other.name)
				&& no_of_books == other.no_of_books;
	}
}
