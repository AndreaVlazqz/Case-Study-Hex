import { Component, OnInit } from '@angular/core';
import { FormBuilder,FormGroup, Validators } from '@angular/forms';
import { CourseService } from '../service/course.service';

@Component({
  selector: 'app-course-register-form',
  templateUrl: './course-register-form.component.html',
  styleUrls: ['./course-register-form.component.css']
})
export class CourseRegisterFormComponent implements OnInit {

  courseRegisterForm!: FormGroup;
  constructor( private formBuilder : FormBuilder, private courseService : CourseService) { }

  ngOnInit(): void {

    this.courseRegisterForm = this.formBuilder.group({
      courseId:[`${Math.floor(Math.random() * 1000)}`],
      courseName:['',[Validators.required]],
      courseAuthorName:['',[Validators.required]],
      courseDuration:['',[Validators.required]]
    })
  }

  onSubmit(){
    this.courseService.createCourse(this.courseRegisterForm?.value).subscribe((data)=>{console.log('data saved',data)})
  }

}
