import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcion = 0;

        do {
            System.out.println("---- MENU DE OPCIONES ----");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Mostrar cantidad de estudiantes que aprueban la asignatura");
            System.out.println("3. Mostrar cantidad de estudiantes que reprueban la asignatura");
            System.out.println("4. Mostrar la cantidad de estudiantes que van a examen");
            System.out.println("5. Mostrar el estado de todos los estudiantes de la asignatura (notas y promedio)");
            System.out.println("6. Salir");

            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Seleccionó la opción 1");
                    break;
                case 2:
                    System.out.println("Seleccionó la opción 2");
                    break;
                case 3:
                    System.out.println("Seleccionó la opción 3");
                    break;
                case 4:
                    System.out.println("Seleccionó la opción 4");
                    break;
                case 5:
                    System.out.println("Seleccionó la opción 5");
                    break;
                case 6:
                    System.out.println("Adiós!");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }

        } while (opcion != 6);

        scanner.close();
    }
}
