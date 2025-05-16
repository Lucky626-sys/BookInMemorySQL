//（資料存取介面）定義對書籍資料的存取方式（CRUD 操作），但不包含實作
package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Book;

public interface BookRepository {
	List<Book> findAllBooks();
	Optional<Book> getBookById(Integer id);
	boolean addBook(Book book);
	boolean updateBook(Integer id, Book book);
	boolean deleteBook(Integer id);
}