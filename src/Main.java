import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

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

    public static void notasAleatorias() {
        double nota = ingresarNotaAleatoria();
        System.out.println("La nota ingresada es: " + nota);
    }

    public static double ingresarNotaAleatoria() {
        Random random = new Random();
        double nota = 1.0 + (7.0 - 1.0) * random.nextDouble();
        return nota;
    }
    public class AgregarEstudiante {

        public static void main(String[] args) {
            List<Double> notas = generarNotasAleatorias(5);
            agregarEstudiante("Juan Perez", notas);
        }

        public static List<Double> generarNotasAleatorias(int cantidad) {
            Random random = new Random();
            List<Double> notas = new ArrayList<>();
            for (int i = 0; i < cantidad; i++) {
                double nota = 1.0 + (7.0 - 1.0) * random.nextDouble();
                notas.add(nota);
            }
            return notas;
        }

        public static void agregarEstudiante(String nombre, List<Double> notas) {
            System.out.println("Estudiante: " + nombre);
            System.out.println("Notas:");
            for (int i = 0; i < notas.size(); i++) {
                System.out.println("Nota " + (i+1) + ": " + notas.get(i));
            }
        }
    }

}