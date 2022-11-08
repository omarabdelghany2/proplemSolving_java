package com.company;

public class Course {
    public String courseName;
    Student [] student = new Student[50];
    private int noOfStudents=0;
    // todo construct him in the constructor of course
    Professor professor;
//todo remove professor from constructor and let it be in setter method
    public Course(String courseName, Professor professor) {
        this.courseName = courseName;
        this.professor = professor;
    }

    public  void addStudent(Student student){
        this.student[noOfStudents] = student;
        noOfStudents++;
    }
}
