import { Component, OnInit } from '@angular/core';
import { Course } from '../model/course.model';
import { CourseService } from '../service/course.service';

@Component({
  selector: 'app-courses-list',
  templateUrl: './courses-list.component.html',
  styleUrls: ['./courses-list.component.css']
})
export class CoursesListComponent implements OnInit {

  message = 'Courses List';
  courses?: Course[];

  constructor( private courseService : CourseService) { }

  ngOnInit(): void {
    console.log("INIT courses Servce : ", "ngOnInit():")
    this.courseService.getCourses().subscribe(
      (data) => {
        this.courses = data;
        console.log(this.courses);
      }
    )
  
  }

  deleteCourse(toDeleteCourse : Course): void {
    console.log('course details sent to server..');
    console.log(toDeleteCourse)
    this.courseService.deleteCourse(toDeleteCourse.courseId);
}
}
