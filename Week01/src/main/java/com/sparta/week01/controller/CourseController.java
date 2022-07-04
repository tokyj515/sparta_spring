package com.sparta.week01.controller;

import com.sparta.week01.prac.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @GetMapping("/courses")
    public Course getCourse(){
        Course course = new Course();
        course.setName("웹개발의 봄, Spring");
        course.setDays(35);
        course.setTutor("남병관");
        return course;
    }
}
