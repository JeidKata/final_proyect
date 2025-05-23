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

    public void getStudentsList() {
        for (Student student : studentsList) {
            System.out.println("\t" + student.getName());
        }
    }

    public void setStudentsList(Student student) {
        this.studentsList.add(student);
    }

    public void getTeachersList() {
        for (Teacher teacher : teachersList) {
            System.out.println("\t" + teacher.getName());
        }
    }

    public void setTeachersList(Teacher teacher) {
        this.teachersList.add(teacher);
    }

    public void getCoursesList() {
        for (Course course : coursesList) {
            System.out.println("\t" + course.getName());
        }
    }

    public void setCoursesList(Course course) {
        this.coursesList.add(course);
    }
}
