package org.globant.java.university;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private String code;
    private List<Student> students= new ArrayList<Student>();
    private Teacher teacher;

    public Course(String name, String code, Teacher teacher, List<Student> students) {
        this.name = name;
        this.code = code;
        this.teacher = teacher;
        this.students = students;
    }

    public showInfoCourse() {
        System.out.println("Course name: " + name);
        System.out.println("Course code: " + code);
        System.out.println("Teacher: " + teacher.getName());
        System.out.println("Students enrolled: ");
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student " + student.getName() + " added to course " + name + "\n");
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public List<Student> getStudents() {
        return students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
