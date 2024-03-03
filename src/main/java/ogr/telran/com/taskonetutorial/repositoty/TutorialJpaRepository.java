package ogr.telran.com.taskonetutorial.repositoty;

import ogr.telran.com.taskonetutorial.entity.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TutorialJpaRepository extends JpaRepository<Tutorial, Long> {

    List<Tutorial> findByPublished(boolean published);

    List<Tutorial> findByTitleContaining(String title);

}
