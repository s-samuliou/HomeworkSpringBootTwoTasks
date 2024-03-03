package ogr.telran.com.taskonetutorial.datainitializer;

import ogr.telran.com.taskonetutorial.entity.Tutorial;
import ogr.telran.com.taskonetutorial.repositoty.TutorialJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class InitializeTutorials implements CommandLineRunner {

    @Autowired
    TutorialJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        List<Tutorial> tutorials = List.of(
                new Tutorial("Barca", "Some about Barca", true),
                new Tutorial("Real Madrid", "Some about Real Madrid", false),
                new Tutorial("Milan", "Some about Milan", true),
                new Tutorial("Baer", "Some about Baer", false)
        );

        repository.saveAll(tutorials);
    }
}
