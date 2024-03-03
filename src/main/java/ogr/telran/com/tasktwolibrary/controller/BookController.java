package ogr.telran.com.tasktwolibrary.controller;

import ogr.telran.com.tasktwolibrary.entity.Book;
import ogr.telran.com.tasktwolibrary.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    BookServiceImpl service;

    @GetMapping("/betweenYears")
    public List<Book> getBookByYearCreatedBetween() {
        return service.getBookByYearCreateBetween();
    }

    @GetMapping("/earliestBook")
    public Book getEarliestBook() {
        return service.getEarliestBook();
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return service.getAllBooks();
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable("id") long id) {
        return service.getBookById(id);
    }

    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return service.createBook(book);
    }

    @DeleteMapping("/{id}")
    public void deleteAuthor(@PathVariable("id") long id) {
        service.deleteBook(id);
    }
}
