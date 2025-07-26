package book.seller.com.book.seller.service;

import book.seller.com.book.seller.model.Book;

import java.util.List;

public interface IBookService {
    Book saveBook(Book book);

    void deleteBook(Long bookId);

    List<Book> findAllBooks();
}
