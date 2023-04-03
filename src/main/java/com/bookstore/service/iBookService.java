package com.bookstore.service;

import java.util.List;

import com.bookstore.entity.Book;

public interface iBookService {
	List<Book> getBooks();
    Book addBook(Book book);
}
