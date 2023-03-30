package com.bookstore.repository;

import org.springframework.data.repository.CrudRepository;

import com.bookstore.entity.Book;

public interface iBookStoreRepository extends CrudRepository<Book,String> {

}
