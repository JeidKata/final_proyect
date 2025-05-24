package org.globant.java.university;

import java.util.List;

public class University {
    private List<Student> studentsList;
    private List<Teacher> teachersList;
    private List<Course> coursesList;

    public University(List<Student> studentsList, List<Teacher> teachersList, List<Course> coursesList) {
        this.studentsList = studentsList;
        this.teachersList = teachersList;
        this.coursesList = coursesList;
    }

    public void showInfoUniversity() {
        System.out.println("Students enrolled: ");
        for (Student student : studentsList) {
            System.out.println("\t" + student.getName());
        }
        System.out.println("Teachers: ");
        for (Teacher teacher : teachersList) {
            System.out.println("\t" + teacher.getName());
        }
        System.out.println("Courses: ");
        for (Course course : coursesList) {
            System.out.println("\t" + course.getName());
        }
    }

    public List<Student> getStudentsList() {
        return studentsList;
    }

    public void showStudentsList() {
        System.out.println("----- LISTADO DE ESTUDIANTES -----");
        short n = 1;
        for (Student student : studentsList) {
            System.out.printf("\t%d. %s\n", n, student.getName());
            n++;
        }
    }

    public void setStudentsList() {
        for(Course c : coursesList) {
            studentsList.addAll(c.getStudents());
        }
    }

    public List<Teacher> getTeachersList() {
        return teachersList;
    }

    public void showTeachersList() {
        System.out.println("----- LISTADO DE PROFESORES -----");
        short n = 1;
        for (Teacher teacher : teachersList) {
            System.out.printf("\t%d. %s\n", n, teacher.getName());
            n++;
        }
    }

    public void setTeachersList() {
        for(Course c : coursesList) {
            teachersList.add(c.getTeacher());
        }
    }

    public List<Course> getCoursesList() {
        return coursesList;
    }

    public void showCoursesList() {
        System.out.println("----- LISTADO DE CLASES -----");
        short n = 1;
        for (Course course : coursesList) {
            System.out.printf("\t%d. %s\n", n, course.getName());
            n++;
        }
    }

    public void setCoursesList(Course course) {
        this.coursesList.add(course);
    }
}
