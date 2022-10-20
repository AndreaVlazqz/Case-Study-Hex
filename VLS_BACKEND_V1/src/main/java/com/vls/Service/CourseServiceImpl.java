package com.vls.Service;

import com.vls.Entity.Course;
import com.vls.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService{
    @Autowired
    private CourseRepository courseRepository;

    @Override
    public Iterable<Course> selectAll() {
        return courseRepository.findAll();
    }

    @Override
    public Course courseRegister(Course course) {
        Course savedCourseEntity = courseRepository.save(course);
        return savedCourseEntity;
    }

    @Override
    public String courseDelete(int courseId) {
        Optional<Course> course = courseRepository.findById(courseId);
        if (course.isPresent()){
            courseRepository.delete(course.get());
            return "Product with id: " + courseId + "was deleted.";
        }else {
            throw new RuntimeException("Product not found");
        }
    }
}
