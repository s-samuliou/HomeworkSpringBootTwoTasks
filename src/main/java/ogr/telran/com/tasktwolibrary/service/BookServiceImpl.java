package ogr.telran.com.tasktwolibrary.service;

import ogr.telran.com.tasktwolibrary.entity.Book;
import ogr.telran.com.tasktwolibrary.repositiry.BookJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookJpaRepository repository;

    @Override
    public Book getEarliestBook() {
        return repository.getTopByOrderByYearCreateAsc();
    }

    @Override
    public List<Book> getBookByYearCreateBetween() {
        return repository.findBooksByYearCreateBetween(1800, 1900);
    }

    @Override
    public List<Book> getAllBooks() {
        return repository.findAll();
    }

    @Override
    public Book getBookById(long id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public Book createBook(Book book) {
        return repository.save(book);
    }

    @Override
    public void deleteBook(long id) {
        repository.deleteById(id);
    }
}
