package ogr.telran.com.tasktwolibrary.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "author")
@Data
@NoArgsConstructor
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;

    @Column(name = "first_name_author")
    String firstNameAuthor;

    @Column(name = "last_name_author")
    String lastNameAuthor;

    public Author(String firstNameAuthor, String lastNameAuthor) {
        this.firstNameAuthor = firstNameAuthor;
        this.lastNameAuthor = lastNameAuthor;
    }
}
