package tp1_ToString;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Maria", 22, "Ingeniería");
        Estudiante estudiante2 = new Estudiante("Ana", 25, "Medicina");
        Estudiante estudiante3 = new Estudiante("Luis", 20, "Arquitectura");

        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(estudiante);
        estudiantes.add(estudiante2);
        estudiantes.add(estudiante3);

        for (Estudiante est : estudiantes) {
            System.out.println(est);
        }
    }
}
