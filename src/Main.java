import org.globant.java.university.Course;
import org.globant.java.university.Student;
import org.globant.java.university.Teacher;
import org.globant.java.university.University;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Course selectedCourse;
        String courseName;
        String courseCode;
        int teacherNumber;
        String studentName;
        int studentAge;
        String studentId;
        int courseNumber;
        byte option;

        System.out.println("Bienvenido a la Universidad");

        Student s1 = new Student("Juan", 20, "123456");
        Student s2 = new Student("Pedro", 22, "654321");
        Student s3 = new Student("Maria", 21, "789012");
        Student s4 = new Student("Ana", 23, "345678");
        Student s5 = new Student("Luis", 19, "901234");
        Student s6 = new Student("Laura", 24, "567890");

        Teacher t1 = new Teacher("Jeidy", 20, true, 10f);
        Teacher t2 = new Teacher("Carlos", 30, false, 5);
        Teacher t3 = new Teacher("Juan", 5, true, 20f);
        Teacher t4 = new Teacher("Karen", 10, false, 15);

        Course c1 = new Course("Matematicas",  "101", t1, new ArrayList(Arrays.asList(s1, s2, s3, s4)));
        Course c2 = new Course("Historia",  "102", t2, new ArrayList(Arrays.asList(s4, s5, s6)));

        University u = new University(new ArrayList(Arrays.asList(s1, s2, s3, s4, s5, s6)), new ArrayList(Arrays.asList(t1, t2, t3, t4)), new ArrayList(Arrays.asList(c1, c2)));

        do {
            System.out.println("¿Qué desea realizar?");
            System.out.println("\t1. Crear estudiante y agregar a un curso.\n\t2. Listar clases de un estudiante.\n" +
                    "\t3. Crear clase\n\t4. Listar clases\n\t5. Listar profesores\n\t6. Salir");
            option = read.nextByte();
            read.nextLine();
            switch (option) {
                case 1:
                    System.out.print("Ingrese el nombre del estudiante: ");
                    studentName = read.nextLine();
                    System.out.print("Ingrese la edad del estudiante: ");
                    studentAge = read.nextInt();
                    read.nextLine();
                    System.out.print("Ingrese el ID del estudiante: ");
                    studentId = read.next();
                    System.out.println("Ingrese el curso al que desea agregar un estudiante: ");
                    u.showCoursesList();
                    courseNumber = read.nextInt();
                    selectedCourse = u.getCoursesList().get(courseNumber - 1);
                    selectedCourse.addStudent(new Student(studentName, studentAge, studentId));
                    u.setStudentsList();
                    System.out.println("Estudiante agregado exitosamente.");
                    break;
                case 2:
                    System.out.print("Ingrese el ID del estudiante que desea buscar: ");
                    studentId = read.nextLine();
                    u.courseStudentId(studentId);
                    break;
                case 3:
                    System.out.print("Ingrese nombre del curso: ");
                    courseName = read.next();
                    System.out.print("Ingrese código del aula: ");
                    courseCode = read.next();
                    System.out.println("De la lista de profesores, seleccione el profesor que dictará el curso");
                    u.showTeachersList();
                    System.out.print("Ingrese el número del profesor: ");
                    teacherNumber = read.nextInt();
                    Teacher selectedTeacher = u.getTeachersList().get(teacherNumber - 1);
                    read.nextLine();
                    System.out.print("¿Cuántos estudiantes desea agregar al curso? ");
                    int numberOfStudents = read.nextInt();
                    u.setCoursesList(new Course(courseName, courseCode, selectedTeacher, u.selectStudentForCourse(numberOfStudents)));
                    System.out.println("Curso creado exitosamente.");
                    break;
                case 4:
                    u.showCoursesList();
                    System.out.print("Seleccione un curso por número: ");
                    courseNumber = read.nextInt();
                    selectedCourse = u.getCoursesList().get(courseNumber - 1);
                    selectedCourse.showInfoCourse();
                    break;
                case 5:
                    u.detailsTeacher();
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (option != 6);
    }
}