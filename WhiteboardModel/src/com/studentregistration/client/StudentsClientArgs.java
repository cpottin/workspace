package com.studentregistration.client;

import com.studentregistration.School;
import com.studentregistration.Student;

import static java.lang.Integer.parseInt;
public class StudentsClientArgs {

    public static void main(String... args) {
        Student argStudent = new Student();

        if (args.length < 2) {
            System.out.println("Need more args");
            return;
        } else {
            argStudent.setFirstName(args[0]);
            argStudent.setLastName(args[1]);
            argStudent.setStudentAge(parseInt(args[2]));
            System.out.println(argStudent);
        }
    }
}
