package ogr.telran.com.tasktwolibrary.controller;

import ogr.telran.com.tasktwolibrary.entity.Author;
import ogr.telran.com.tasktwolibrary.service.AuthorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/authors")
public class AuthorController {

    @Autowired
    AuthorServiceImpl service;

    @GetMapping("/authorsBooks")
    public List<Optional[]> getBooksAndAuthors() {
       return service.getBooksAndAuthors();
    }

    @GetMapping("/countOfBooks")
    public Optional[] getAuthorWithMostCountOfBooks() {
        return service.getAuthorsWithMostCountOfBooks();
    }

    @GetMapping
    public List<Author> getAllAuthors() {
        return service.getAllAuthors();
    }

    @GetMapping("/{id}")
    public Author getAuthorById(@PathVariable("id") long id) {
        return service.getAuthorById(id);
    }

    @PostMapping
    public Author createAuthor(@RequestBody Author author) {
        return service.createAuthor(author);
    }

    @DeleteMapping("/{id}")
    public void deleteAuthor(@PathVariable("id") long id) {
        service.deleteAuthor(id);
    }
}
