package com.education.domain;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {

    Collection<Course> findBycourseName(String name);
}
