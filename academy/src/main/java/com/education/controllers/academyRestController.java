package com.education.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.education.domain.Course;
import com.education.domain.CourseRepository;
import com.education.domain.Project;
import com.education.domain.ProjectRepository;
import com.education.domain.Student;
import com.education.domain.StudentRepository;

@RestController
public class academyRestController {
    
    @Autowired
    public CourseRepository repositoryC;
    @Autowired
    public StudentRepository repositoryS;
    @Autowired
    public ProjectRepository repositoryP;
    
    @RequestMapping("/courses")
   Collection<Course> courses(){
        
        return repositoryC.findBycourseName("Physics");
    }
    @RequestMapping  ("students") 
 Collection<Student> students(){
        
        return repositoryS.findAll();
    }
    @RequestMapping("projects")
 Collection<Project> projects(){
     
     return repositoryP.findAll();
 }

}
