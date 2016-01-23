package com.education;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.education.domain.Course;
import com.education.domain.CourseRepository;
import com.education.domain.Project;
import com.education.domain.ProjectRepository;
import com.education.domain.Student;
import com.education.domain.StudentRepository;


@SpringBootApplication
public class AcademyApplication {

    public static void main(String[] args) {
        SpringApplication.run(AcademyApplication.class, args);
    }
}

@Component
class AcademyCommandLineRunner implements CommandLineRunner
{
    @Autowired 
    StudentRepository repository;
    @Autowired 
    CourseRepository courseRepository;
    @Autowired 
    ProjectRepository projectRepository;
    @Override
    public void run(String... args) throws Exception{


        System.out.println("Students found with findAll():");
        System.out.println("-------------------------------");
        int k=0;
        for (Student student : repository.findAll()) {
            System.out.println(student.toString()+" count "+k);
            k++;
        }

        System.out.println("Courses found with findAll():");
        System.out.println("-------------------------------");
        int x=0;
        for (Course course : courseRepository.findAll()) {
            System.out.println(course.toString()+" count "+x);
            x++;
        }

        System.out.println("Projects found with findAll():");
        System.out.println("-------------------------------");
        int z=0;
        for (Project project : projectRepository.findAll()) {
            System.out.println(project.toString()+" count "+z);
            z++;
        }
    }

}

