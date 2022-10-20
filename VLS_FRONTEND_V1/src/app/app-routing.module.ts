import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';
import { CoursesListComponent } from './courses-list/courses-list.component';
import { CourseRegisterFormComponent } from './course-register-form/course-register-form.component';

const routes: Routes = [
  {path: '', redirectTo: '/coursesList', pathMatch: 'full' },
  {path:'coursesList', component: CoursesListComponent},
  {path:'courseRegister',component:CourseRegisterFormComponent},
]

@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    RouterModule.forRoot(routes)
  ],
  exports:[
    RouterModule
  ]

})
export class AppRoutingModule { }
