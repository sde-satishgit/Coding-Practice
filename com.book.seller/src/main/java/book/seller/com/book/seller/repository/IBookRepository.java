package book.seller.com.book.seller.repository;

import book.seller.com.book.seller.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepository extends JpaRepository <Book,Long> {
}
