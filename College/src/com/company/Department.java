package com.company;



public class Department {
    private int noOfCourses = 0;
    private int noOfStudents = 0;
    public String departmentName;
    private Course[] courses = new Course[50];
    private Student[] student = new Student[50];

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }
    public Course[] getCourses() {
        return courses;
    }

    public void addCourse(Course course){
        this.courses[noOfCourses] = course;
        noOfCourses++;
    }
    public void addStudent(Student student){
        this.student[noOfStudents] = student;
        noOfStudents++;
    }
}


