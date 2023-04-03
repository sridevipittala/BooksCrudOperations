package com.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.entity.Book;
import com.bookstore.repository.iBookStoreRepository;

@Service
public class BookService implements iBookService {
	@Autowired
	iBookStoreRepository bookStoreRepository;
	@Override
	public List<Book> getBooks() {
		return (List<Book>) bookStoreRepository.findAll();
		
	}

	@Override
	public Book addBook(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

}
