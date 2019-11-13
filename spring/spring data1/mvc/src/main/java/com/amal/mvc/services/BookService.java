package com.amal.mvc.services;
import org.springframework.stereotype.Service;

import com.amal.mvc.models.Book;
import com.amal.mvc.repositories.BookRepository;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {
 // adding the book repository as a dependency
	private final BookRepository bookRepository;
 
 public BookService(BookRepository bookRepository) {
     this.bookRepository = bookRepository;
 }
 // returns all the books
 public List<Book> allBooks() {
     return bookRepository.findAll();
 }
 // creates a book
 public Book createBook(Book b) {
     return bookRepository.save(b);
 }
 // retrieves a book
 public Book findBook(Long id) {
     Optional<Book> optionalBook = bookRepository.findById(id);
     if(optionalBook.isPresent()) {
         return optionalBook.get();
     } else {
         return null;
     }
 }
 public Book updateBook(Book b) {
     return bookRepository.save(b);

 }
 public Book deleteBook(long id) {
	 Book book;
	return bookRepository.deleteById(book.getId(id));
}
 public Book show(long id) {
	  Optional<Book> optionalBook = bookRepository.findById(id);
	     if(optionalBook.isPresent()) {
	         return optionalBook.get();
	     } else {
	         return null;
	     }
	   
 }
 
}
