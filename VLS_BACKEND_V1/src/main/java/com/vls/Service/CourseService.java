package com.vls.Service;

import com.vls.Entity.Course;

public interface CourseService {

    Iterable<Course> selectAll();

    Course courseRegister(Course course);

    String courseDelete(int courseId);

}
