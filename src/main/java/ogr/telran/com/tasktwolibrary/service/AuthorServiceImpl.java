package ogr.telran.com.tasktwolibrary.service;

import ogr.telran.com.tasktwolibrary.entity.Author;
import ogr.telran.com.tasktwolibrary.repositiry.AuthorJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    AuthorJpaRepository repository;

    @Override
    public List<Optional[]> getBooksAndAuthors() {
        return repository.getAuthorBy();
    }

    @Override
    public Optional[] getAuthorsWithMostCountOfBooks() {
        List<Optional[]> authors = repository.findAuthorWithMostBooks();

        return authors.getFirst();
    }

    @Override
    public List<Author> getAllAuthors() {
        return repository.findAll();
    }

    @Override
    public Author getAuthorById(long id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public Author createAuthor(Author author) {
        return repository.save(author);
    }

    @Override
    public void deleteAuthor(long id) {
        repository.deleteById(id);
    }
}
