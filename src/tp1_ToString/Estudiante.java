package tp1_ToString;

public class Estudiante extends Persona {
    private String carrera;

    public Estudiante() {
    }

    public Estudiante(String persona, int edad, String carrera) {
        super(persona, edad);
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "carrera='" + carrera + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", edad=" + getEdad() +
                '}';
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
