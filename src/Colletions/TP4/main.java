package Colletions.TP4;

import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Matemáticas", "Dr. Smith");
        Curso curso2 = new Curso("bioingeniería ", "John Hammond");
        Curso curso3 = new Curso("paleontólogo ", "Alan Grant");

        Map<String, Curso> cursos = new HashMap<>();
        cursos.put(curso1.getNombre(), curso1);
        cursos.put(curso2.getNombre(), curso2);
        cursos.put(curso3.getNombre(), curso3);

        for (Map.Entry<String,Curso> entry : cursos.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }
    }
}
