package com.cg.bookstore.service;

import java.util.List;

import com.cg.bookstore.entity.Book;
import com.cg.bookstore.repository.BookRepo;
import com.cg.bookstore.repository.BookRepoImpl;

public class BookServiceImpl implements BookService {

	private BookRepoImpl repo;

	public BookServiceImpl() {
		repo = new BookRepoImpl();
	}

	@Override
	public Book getBookById(int id) {
		return repo.getBookById(id);
	}

	@Override
	public List<Book> getBookByTitle(String title) {
		return repo.getBookByTitle(title);
	}

	@Override
	public Long getBookCount() {
		return repo.getBookCount();
	}

	@Override
	public List<Book> getAuthorBooks(String author) {
		return repo.getAuthorBooks(author);
	}

	@Override
	public List<Book> getAllBooks() {
		return repo.getAllBooks();
	}
	
	@Override
	public List<Book> getBooksInPriceRange(double low, double high){
		return repo.getBooksInPriceRange(low, high);
	}
}
