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

//        u.showTeachersList();
//        u.showCoursesList();
//        u.showStudentsList();

//        Crear estudiante y agregar a un curso
        System.out.println("Ingrese el nombre del estudiante: ");
        String studentName = read.nextLine();
        read.nextLine();
        System.out.println("Ingrese la edad del estudiante: ");
        int studentAge = read.nextInt();
        System.out.println("Ingrese el ID del estudiante: ");
        String studentId = read.next();
        System.out.println("Ingrese el curso al que desea agregar un estudiante: ");
        u.showCoursesList();
        int courseNumber = read.nextInt();
        Course selectedCourse = u.getCoursesList().get(courseNumber - 1);
        selectedCourse.addStudent(new Student(studentName, studentAge, studentId));
        selectedCourse.showInfoCourse();

        u.setStudentsList();
        u.showStudentsList();

        /*byte option;
        do {
            System.out.println("¿Qué desea realizar?");
            System.out.println("\t1. Listar profesores\n\t2. Listar clases\n\t3. Crear estudiante\n\t4. Crear clase\n\t5. Listar clases de un estudiante\n\t6. Salir");
            option = read.nextByte();
            switch (option) {
                case 1:
                    // Listar profesores
                    break;
                case 2:
                    // Listar clases
                    break;
                case 3:
                    // Crear estudiante
                    break;
                case 4:
                    // Crear clase
                    break;
                case 5:
                    // Listar clases de un estudiante
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (option != 6);*/
    }
}