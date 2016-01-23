package com.education.domain;

import javax.persistence.*;


/**
 * The persistent class for the COURSE database table.
 * 
 */
@Entity
public class Course{

	@Id @GeneratedValue
	private Long courseId;

	@Override
    public String toString() {
        return "Course [courseId=" + courseId + ", cost=" + cost + ", courseName=" + courseName + ", internet=" + internet + "]";
    }

    private double cost;

	private String courseName;

	private String internet;

	public Course() {
	}

	public Course(String courseName) {
	    this.courseName = courseName;
        }
	public Long getCourseId() {
		return this.courseId;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

	public double getCost() {
		return this.cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getCourseName() {
		return this.courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getInternet() {
		return this.internet;
	}

	public void setInternet(String internet) {
		this.internet = internet;
	}

}