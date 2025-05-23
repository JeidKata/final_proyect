import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Bienvenido a la Universidad");
        byte option;
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
        } while (option != 6);
    }
}