package com.vls.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
@Table(name="COURSE")
public class Course  implements Serializable {

    @Id
    @Column(name="COURSE_ID")
    private int courseId;

    @Column(name="COURSE_NAME")
    private String courseName;

    @Column(name="COURSE_AUTHOR_NAME")
    private String courseAuthorName;

    @Column(name="COURSE_DURATION")
    private double courseDuration;

    public Course (){

    }
    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseID) {
        this.courseId = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseAuthorName() {
        return courseAuthorName;
    }

    public void setCourseAuthorName(String courseAuthorName) {
        this.courseAuthorName = courseAuthorName;
    }

    public double getCourseDuration() {
        return courseDuration;
    }

    public void setCourseDuration(double courseDuration) {
        this.courseDuration = courseDuration;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseID=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", courseAuthorName='" + courseAuthorName + '\'' +
                ", courseDuration=" + courseDuration +
                '}';
    }
}
