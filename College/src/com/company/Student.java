package com.company;

public class Student {
    //todo setter for student department
    private int noOfCourses=0;
    private String name;
    private Department department;
    private Course[] course=new Course[50];
//todo remove department from student comstructor
    public void Student(String name,String departmentName) {
        this.name = name;
        this.department = new Department(departmentName);
    }

    public int getNoOfCourses() {
        return noOfCourses;
    }

    public void addCourse(Course course){
        this.course[noOfCourses]=course;
        noOfCourses++;
    }

}