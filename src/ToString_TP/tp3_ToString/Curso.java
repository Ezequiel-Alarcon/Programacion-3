package ToString_TP.tp3_ToString;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nombre;
    private String profesor;
    private List<Estudiante> listaDeEstudiantes ;

    public Curso() {
    }

    public Curso(String nombre, String profesor) {
        this.nombre = nombre;
        this.profesor = profesor;
        this.listaDeEstudiantes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public List<Estudiante> getListaDeEstudiantes() {
        return listaDeEstudiantes;
    }

    public void setListaDeEstudiantes(List<Estudiante> listaDeEstudiantes) {
        this.listaDeEstudiantes = listaDeEstudiantes;
    }

    public void agregarEstudiante(Estudiante estudiante){
        this.listaDeEstudiantes.add(estudiante);
    }

    @Override
    public String toString() {
        return "Curso: " + nombre + "\n"
                + "Profesor: " + profesor + "\n"
                + "Cantidad de alumnos: " + listaDeEstudiantes.size() + "\n";
    }

}
