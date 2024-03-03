package ogr.telran.com.tasktwolibrary.repositiry;

import ogr.telran.com.tasktwolibrary.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface AuthorJpaRepository extends JpaRepository<Author, Long> {

    @Query("select a, b from Author a join Book b on b.authorId = a.id")
    List<Optional[]> getAuthorBy();

    @Query("SELECT a, COUNT(b) AS bookCount FROM Author a JOIN Book b ON a.id = b.authorId GROUP BY a.id ORDER BY bookCount DESC")
    List<Optional[]> findAuthorWithMostBooks();
}
