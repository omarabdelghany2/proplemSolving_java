package com.company;

public class Main {

    public static void main(String[] args) {
        College myCollege = new College("hndsa");
        System.out.println(myCollege.collegeName);

        Professor El7abrouk = new Professor("el7abrouk");
        Professor hossam = new Professor("hossam");
        myCollege.addProfessor(El7abrouk);
        myCollege.addProfessor(hossam);

        Department computer = new Department("computer");
        Department commuication = new Department("communcation");
        myCollege.addDepartment(computer);
        myCollege.addDepartment(commuication);

        Course programming = new Course("programming",El7abrouk);
        Course Signals = new Course("signals",hossam);
        myCollege.departments[0].addCourse(programming);
        myCollege.departments[1].addCourse(Signals);

        System.out.println(myCollege.departments[0].getCourses()[0].courseName);
        System.out.println(myCollege.departments[1].getCourses()[0].courseName);
        System.out.println(myCollege.departments[0].getCourses()[0].professor.getName());



    }


}
