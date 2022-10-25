package com.studentregistration;

public class Student {
    private static int nextIDNumber = 1234;

    public static final int MIN_AGE = 5;
    public static final int MAX_AGE = 22;

    private String firstName;
    private String lastName;
    private int studentAge = 5;
    private int studentID = nextIDNumber++;

    School school = School.DISTRICT;

    public Student(){}

    public Student(String firstName, String lastName, int studentAge, int studentID, School school) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentAge = studentAge;
        this.studentID = nextIDNumber;
        this.school = school;
    }

    public void isPresent(){
        System.out.println(firstName + " " + lastName + " is present in class.");
    }

    public void isAbsent(){
        System.out.println(firstName + " " + lastName + " is absent in class.");
    }

    public static int getNextIDNumber() {
        return nextIDNumber;
    }

    public static void setNextIDNumber(int nextIDNumber) {
        Student.nextIDNumber = nextIDNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        if(studentAge < MIN_AGE || studentAge > MAX_AGE)
        {
            System.out.println("Can not register student due to age");
        }
        else{
            this.studentAge = studentAge;
        }

    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "com.studentregistration.Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", studentAge=" + studentAge +
                ", studentID=" + studentID +
                ", school=" + school +
                '}';
    }
}
