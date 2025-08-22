package tp3_ToString;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Juan Perez", 20, "Ingenieria");
        Estudiante estudiante2 = new Estudiante("Maria Gomez", 22, "Medicina");
        Estudiante estudiante3 = new Estudiante("Carlos Ruiz", 19, "Derecho");


        Curso curso = new Curso("Matematica", "Dr. Smith");
        curso.agregarEstudiante(estudiante1);
        curso.agregarEstudiante(estudiante2);
        curso.agregarEstudiante(estudiante3);

        System.out.println(curso);

    }
}
