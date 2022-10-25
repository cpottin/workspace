package com.studentregistration.client;
import com.studentregistration.School;
import com.studentregistration.Student;

public class StudentsValidation {

    public static void main(String[] args) {

        Student studentTest = new Student("Cindy", "Pottin", 23,
              1237, School.DISTRICT);
        studentTest.setStudentAge(23);
        System.out.println(studentTest);

    }
    }
