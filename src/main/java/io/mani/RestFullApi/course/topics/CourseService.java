package io.mani.RestFullApi.course.topics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    private CourseRepository topicRepository;


    public List<Course> getAllCourses() {
        List<Course> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public Optional<Course> getCourse(String id) {
        return topicRepository.findById(id);

    }

    public void addCourse(Course course) {
        topicRepository.save(course);
    }

    public void updateCourse(String id, Course course) {
        topicRepository.save(course);


    }

    public void deleteTopics(String id) {
        topicRepository.deleteById(id);


    }
}
