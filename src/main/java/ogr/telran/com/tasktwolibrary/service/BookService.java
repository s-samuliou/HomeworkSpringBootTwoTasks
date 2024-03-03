package ogr.telran.com.tasktwolibrary.service;

import ogr.telran.com.tasktwolibrary.entity.Book;

import javax.swing.*;
import java.util.List;

public interface BookService {

    Book getEarliestBook();

    List<Book> getBookByYearCreateBetween();

    List<Book> getAllBooks();

    Book getBookById(long id);

    Book createBook(Book book);

    void deleteBook(long id);
}
