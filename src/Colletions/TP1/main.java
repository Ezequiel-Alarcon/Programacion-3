package Colletions.TP1;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("juan", 8.5);
        Alumno alumno2 = new Alumno("pedro", 7);
        Alumno alumno3 = new Alumno("maria", 9);
        Alumno alumno4 = new Alumno("ana", 5.5);
        Alumno alumno5 = new Alumno("Alice", 10);

        List<Alumno> alumnos = new ArrayList<>();
        alumnos.add(alumno1);
        alumnos.add(alumno2);
        alumnos.add(alumno3);
        alumnos.add(alumno4);
        alumnos.add(alumno5);

        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
    }
}
