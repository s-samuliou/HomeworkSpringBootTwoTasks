package ogr.telran.com.tasktwolibrary.service;

import ogr.telran.com.tasktwolibrary.entity.Author;

import java.util.List;
import java.util.Optional;

public interface AuthorService {

    List<Optional[]> getBooksAndAuthors();

    Optional[] getAuthorsWithMostCountOfBooks();

    List<Author> getAllAuthors();

    Author getAuthorById(long id);

    Author createAuthor(Author author);

    void deleteAuthor(long id);
}
