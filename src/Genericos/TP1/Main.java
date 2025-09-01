package Genericos.TP1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Usando Caja con generics
        Caja<String> stringCaja = new Caja<>("Hola Mundo");
        System.out.println(stringCaja);

        Caja<Integer> intCaja = new Caja<>(123);
        System.out.println(intCaja);

        // Comparación: colecciones sin generics
        List lista = new ArrayList(); // SIN generics
        lista.add("Texto");
        lista.add(42);

        System.out.println("Lista sin generics: " + lista);
    }
}
