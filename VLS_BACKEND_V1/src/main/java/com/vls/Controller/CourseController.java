package com.vls.Controller;

import com.vls.Entity.Course;
import com.vls.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:4200/")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping("/courses")
    public @ResponseBody Iterable<Course> selectAllCourses(){
        return courseService.selectAll();
    }

    @PostMapping("/courses/register")
    public Course courseRegister(@RequestBody Course course){
        System.out.println("Registration" + course);
        Course courseEntity = courseService.courseRegister(course);
        return courseEntity;
    }

    @DeleteMapping("courses/delete/{courseId}")
    public String deleteCourse(@PathVariable int courseId){
        return courseService.courseDelete(courseId);
    }
}
