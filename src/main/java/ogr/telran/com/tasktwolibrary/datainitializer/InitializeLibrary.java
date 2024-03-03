package ogr.telran.com.tasktwolibrary.datainitializer;

import ogr.telran.com.tasktwolibrary.entity.Author;
import ogr.telran.com.tasktwolibrary.entity.Book;
import ogr.telran.com.tasktwolibrary.repositiry.AuthorJpaRepository;
import ogr.telran.com.tasktwolibrary.repositiry.BookJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class InitializeLibrary implements CommandLineRunner {

    @Autowired
    AuthorJpaRepository authorRepository;

    @Autowired
    BookJpaRepository bookJpaRepository;

    @Override
    public void run(String... args) throws Exception {
        List<Author> authors = List.of(
                new Author("Александр", "Грибоедов"),
                new Author("Лев", "Толстой"),
                new Author("Михаил", "Лермонтов"),
                new Author("Александр", "Пушкин")
        );

        List<Book> books = List.of(
                new Book("Горе от ума", 1824, 1),
                new Book("Война и мир", 1863, 2),
                new Book("Мцыри", 1838, 3),
                new Book("Евгений Онегин", 1833, 4),
                new Book("Леонель Месси", 1024, 5)
        );

        authorRepository.saveAll(authors);
        bookJpaRepository.saveAll(books);
    }
}
