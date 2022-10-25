package com.studentregistration.client;

import com.studentregistration.School;
import com.studentregistration.Student;

public class StudentsClient {
    public static void main(String[] args) {
       Student students1 = new Student("Sherry", "Knight", 21, 0, School.HIGH );
        System.out.println(students1);
        students1.isPresent();

        Student student2 = new Student("Andrea", "Win", 15, 1, School.ELEMENTARY);
        System.out.println(student2);
        student2.isAbsent();


   }
}
