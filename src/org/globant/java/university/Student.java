package org.globant.java.university;

public class Student extends Person {
    private String studentId;

    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    public void showInfoStudent() {
        System.out.println("Student name: " + super.getName());
        System.out.println("Student ID: " + studentId);
        System.out.println("Student age: " + super.getAge());
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}
