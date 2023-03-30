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


    public static Estudiante agregarEstudiante() {
        System.out.println("Agregar Estudiante");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();
        double nota1 = ingresarNota("Ingrese la nota 1: ");
        double nota2 = ingresarNota("Ingrese la nota 2: ");
        double nota3 = ingresarNota("Ingrese la nota 3: ");
        double nota4 = ingresarNota("Ingrese la nota 4: ");
        double nota5 = ingresarNota("Ingrese la nota 5: ");
        return new Estudiante(nombre, nota1, nota2, nota3, nota4, nota5);
    }

    public static double ingresarNota(String text) {
        Scanner scanner = new Scanner(System.in);
        double nota;
        do {
            System.out.print(text);
            nota = scanner.nextInt();
            if (nota < 0 || nota > 70) {
                System.out.println("La nota debe estar entre 0 y 70");
            }
            if (nota > 10 && nota < 70) {
                nota = nota / 10;
                System.out.println("La nota es: " + nota);
            }
        } while (nota < 0 || nota > 70);
        return nota;
    }

    ;

    public static void terminarPrograma() {
        System.out.println("Gracias por usar el programa");
        System.exit(0);
    }


    public static int selececcionarOpcion(int maximo) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.print("Ingrese una opcion: ");
            opcion = scanner.nextInt();
        } while (opcion < 1 || opcion > maximo);
        return opcion;
    }

    ;
}

class Estudiante {
    public String nombre;
    public double nota1;
    public double nota2;
    public double nota3;
    public double nota4;
    public double nota5;
    public double notafinal;
    public String estado;

    public Estudiante(String nombre, double nota1, double nota2, double nota3, double nota4, double nota5) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
        this.nota5 = nota5;
        this.notafinal = ((nota1 * 0.25) + (nota2 * 0.25) + (nota3 * 0.25) + (nota4 * 0.15) + (nota5 * 0.1));
        this.estado = Estado();
    }

    public String Estado() {
        if (this.notafinal >= 4.0) {
            return "Aprobado";
        } else if (this.notafinal >= 3.5) {
            return "Examen";
        } else {
            return "Reprobado";
        }
    }
}
