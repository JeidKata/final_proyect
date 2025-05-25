package org.globant.java.university;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class University {
    private List<Student> studentsList;
    private List<Teacher> teachersList;
    private List<Course> coursesList;
    Scanner sc = new Scanner(System.in);

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

    public List<Student> selectStudentForCourse(int amountAdded) {
        showStudentsList();
        List<Student> selectedStudents = new ArrayList<>();
        for (int i = 0; i < amountAdded; i++) {
            System.out.print("Seleccione el estudiante " + (i + 1) + ": ");
            int studentNumber = sc.nextInt();
            selectedStudents.add(getStudentsList().get(studentNumber - 1));
        }
        return selectedStudents;
    }

    public void setStudentsList() {
      for (Course c : coursesList) {
          for (Student s : c.getStudents()) {
              if (!studentsList.contains(s)) {
                  studentsList.add(s);
              }
          }
      }
    }

    public List<Teacher> getTeachersList() {
        return teachersList;
    }

    public void showTeachersList() {
        System.out.println("-----  INFORMACIÓN PROFESOR  -----");
        for (Teacher t : teachersList) {
            t.showInfoTeacher(t);
        }
        System.out.println("-------------------------------");
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

    public void courseStudentId(String studentId) {
        for (Student student : getStudentsList()) {
            if (student.getStudentId().equals(studentId)) {
                System.out.printf("\t%s está inscrito en el(los) curso(s): \n", student.getName());
                for (Course course : getCoursesList()) {
                    if (course.getStudents().contains(student)) {
                        System.out.println("\t- " + course.getName());
                    }
                }
                break;
            }
        }
    }
}
