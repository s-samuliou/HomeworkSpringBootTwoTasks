package ogr.telran.com.tasktwolibrary.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "book")
@Data
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name_book")
    String nameBook;

    @Column(name = "year_create")
    Integer yearCreate;

    @Column(name = "author_id")
    Integer authorId;

    public Book(String nameBook, Integer yearCreate, Integer authorId) {
        this.nameBook = nameBook;
        this.yearCreate = yearCreate;
        this.authorId = authorId;
    }
}
