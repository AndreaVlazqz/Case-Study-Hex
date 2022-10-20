import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Course } from '../model/course.model';

@Injectable({
  providedIn: 'root'
})
export class CourseService {

  baseUrl: string = "http://localhost:9099/courses"

  constructor( private http : HttpClient) { }

  createCourse(course: Course){
    return this.http.post(this.baseUrl + "/register",course)
  }

  getCourses(){
    return this.http.get<Course[]>(this.baseUrl);
  }

  deleteCourse(courseId: number){
    return this.http.delete<Course>(this.baseUrl + "/delete/" + courseId)

  }
  
}
