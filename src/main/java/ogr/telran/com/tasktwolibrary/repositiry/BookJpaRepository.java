package ogr.telran.com.tasktwolibrary.repositiry;

import ogr.telran.com.tasktwolibrary.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookJpaRepository extends JpaRepository<Book, Long> {

    Book getTopByOrderByYearCreateAsc();

    List<Book> findBooksByYearCreateBetween(int startYear, int endYear);
}
