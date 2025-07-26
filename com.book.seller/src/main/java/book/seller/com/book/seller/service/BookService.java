package book.seller.com.book.seller.service;

import book.seller.com.book.seller.model.Book;
import book.seller.com.book.seller.repository.IBookRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class BookService implements IBookService{


    private IBookRepository iBookRepository;

    public BookService(IBookRepository iBookRepository) {
        this.iBookRepository = iBookRepository;
    }

    @Override
    public Book saveBook(Book book){
      book.setCreateTime(LocalDateTime.now());
      return iBookRepository.save(book);
    }

    @Override
    public void deleteBook(Long bookId){
        iBookRepository.deleteById(bookId);
    }

    @Override
    public List<Book> findAllBooks(){
        return iBookRepository.findAll();
    }
}
