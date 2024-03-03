package ogr.telran.com.taskonetutorial.service;

import ogr.telran.com.taskonetutorial.entity.Tutorial;
import ogr.telran.com.taskonetutorial.repositoty.TutorialJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TutorialServiceImpl implements TutorialService {

    @Autowired
    TutorialJpaRepository repository;

    @Override
    public List<Tutorial> findByPublished() {
       return repository.findByPublished(true);
    }

    @Override
    public List<Tutorial> findByTitleContaining(String title) {
        return repository.findByTitleContaining(title);
    }

    @Override
    public List<Tutorial> getAllTutorials() {
        return repository.findAll();
    }

    @Override
    public Tutorial createTutorial(Tutorial tutorial) {
        return repository.save(tutorial);
    }

    @Override
    public Tutorial findById(long id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public void deleteTutorial(long id) {
        repository.deleteById(id);
    }
}
