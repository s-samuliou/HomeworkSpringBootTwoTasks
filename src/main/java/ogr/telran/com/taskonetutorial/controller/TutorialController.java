package ogr.telran.com.taskonetutorial.controller;

import ogr.telran.com.taskonetutorial.entity.Tutorial;
import ogr.telran.com.taskonetutorial.service.TutorialServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tutorials")
public class TutorialController {

    @Autowired
    TutorialServiceImpl service;

    @GetMapping ("/published")
    List<Tutorial> getTutorialsByPublished() {
        return service.findByPublished();
    }

    @GetMapping("/title")
    public List<Tutorial> getTutorialsByTitleContaining(@RequestParam(name = "Title") String title) {
        return service.findByTitleContaining(title);
    }

    @GetMapping
    public List<Tutorial> getAllTutorials() {
        return service.getAllTutorials();
    }

    @PostMapping
    public Tutorial createTutorial(@RequestBody Tutorial tutorial) {
        return service.createTutorial(tutorial);
    }

    @GetMapping("/{id}")
    public Tutorial getTutorialById(@PathVariable("id") long id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteTutorial(@PathVariable("id") long id) {
        service.deleteTutorial(id);
    }
}
