import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        do {
            menu();
        } while (true);
    }

    static ArrayList<Estudiante> estudiantes = new ArrayList<>();
    public static void menu() {
        System.out.println("-------- Menu --------");
        System.out.println("1) Agregar Estudiante");
        System.out.println("2) Estudiantes Aprobados");
        System.out.println("3) Estudiantes Reprobados");
        System.out.println("4) Estudiantes Examen ");
        System.out.println("5) Todos los Estudiantes");
        System.out.println("6) Salir");
        switch (selececcionarOpcion(6)) {
            case 1 -> estudiantes.add(agregarEstudiante());
            case 2 -> verEstudiantes(estudiantes, "Aprobado");
            case 3 -> verEstudiantes(estudiantes, "Reprobado");
            case 4 -> verEstudiantes(estudiantes, "Examen");
            case 5 -> verEstudiantes(estudiantes);
            case 6 -> terminarPrograma();
        }
    }


    public static void verEstudiantes(ArrayList<Estudiante> estudiantes, String estado) {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes");
            return;
        }
        switch (estado) {
            case "Aprobado" -> {
                System.out.println("Estudiantes Aprobados");
                for (int i = 0; i < estudiantes.size(); i++) {
                    if ("Aprobado".equals(estudiantes.get(i).estado)) {
                        imprimir(estudiantes.get(i));
                    }
                }
            }
            case "Examen" -> {
                System.out.println("Estudiantes para Examen");
                for (int i = 0; i < estudiantes.size(); i++) {
                    if ("Examen".equals(estudiantes.get(i).estado)) {
                        imprimir(estudiantes.get(i));
                    }
                }
            }
            case "Reprobado" -> {
                System.out.println("Estudiantes Reprobados");
                for (int i = 0; i < estudiantes.size(); i++) {
                    if ("Reprobado".equals(estudiantes.get(i).estado)) {
                        imprimir(estudiantes.get(i));
                    }
                }
            }
        }

    }

    public static void verEstudiantes(ArrayList<Estudiante> estudiantes) {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes");
            return;
        }
        System.out.println("Todos los Estudiantes");
        for (Estudiante estudiante : estudiantes) {
            imprimir(estudiante);
        }
    }


    public static void imprimir(Estudiante estudiante) {
        System.out.println("-------- Estudiante --------");
        System.out.println("Nombre: " + estudiante.nombre);
        System.out.println("Nota 1: " + estudiante.nota1);
        System.out.println("Nota 2: " + estudiante.nota2);
        System.out.println("Nota 3: " + estudiante.nota3);
        System.out.println("Nota 4: " + estudiante.nota4);
        System.out.println("Nota 5: " + estudiante.nota5);
        System.out.println("Nota Final: " + estudiante.notafinal);
        System.out.println("Estado: " + estudiante.estado);
        System.out.println();
    }

}