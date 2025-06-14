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

    public void showInfoCourse() {
        int n = 1;
        System.out.println("-----  INFORMACIÓN CURSO  -----");
        System.out.println("Nombre: " + name);
        System.out.println("Aula: " + code);
        System.out.println("Profesor: " + teacher.getName());
        System.out.println("Estudiantes registrados: ");
        for (Student student : students) {
            System.out.printf("\t%d. %s\n",n, student.getName());
            n++;
        }
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Estudiante " + student.getName() + " ha sido agregado al curso " + name + "\n");
    }

    public void removeStudent(Student student) {
        students.remove(student);
        System.out.println("Estudiante " + student.getName() + " ha sido eliminado del curso " + name + "\n");
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
