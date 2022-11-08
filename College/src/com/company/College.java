package com.company;

public class College {
    //todo move college name to private attribute
    public String collegeName;

    public College(String collegeName) {
        this.collegeName = collegeName;
    }


    private int numberOfDepartment;
    private int numberOfProfessors;
    Department [] departments = new Department[50];
    Professor[] professors = new Professor[50];

    public void addDepartment(Department department){
        this.departments[numberOfDepartment] = department;
        numberOfDepartment++;
    }
    public void addProfessor(Professor professor){
        this.professors[numberOfProfessors] = professor;
        numberOfProfessors++;
    }

    public int getNumberOfDepartment() {
        return numberOfDepartment;
    }
    public int getNumberOfProfessors() {
        return numberOfProfessors;
    }
    public void report(){
        System.out.println("This is " + this.collegeName + " we have " + this.numberOfDepartment + " departments and we have " +
                this.numberOfProfessors + " professors" );
    }


}
