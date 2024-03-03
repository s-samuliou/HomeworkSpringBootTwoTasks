package ogr.telran.com.taskonetutorial.service;

import ogr.telran.com.taskonetutorial.entity.Tutorial;

import java.util.List;

public interface TutorialService {

    List<Tutorial> findByPublished();

    List<Tutorial> findByTitleContaining(String title);

    List<Tutorial> getAllTutorials();

    Tutorial createTutorial(Tutorial tutorial);

    Tutorial findById(long id);

    void deleteTutorial(long id);
}
