package io.javabrains.springbootstarter.domain.lesson;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class LessonService {

//    @Autowired
    private LessonRepository lessonRepository;

    public List<Lesson> getAllLessons(String courseId) {
        ArrayList<Lesson> lessons = new ArrayList<>();
        lessonRepository.findByCourseId(courseId)
                .forEach(lessons::add);
        return lessons;
    }

    public Lesson getLesson(String id) {
        return lessonRepository.findOne(id);
    }

    public void addLesson(Lesson lesson) {
        lessonRepository.save(lesson);
    }

    public void updateLesson(Lesson lesson) {
        lessonRepository.save(lesson);
    }

    public void deleteLesson(String id) {
        lessonRepository.delete(id);
    }
}
