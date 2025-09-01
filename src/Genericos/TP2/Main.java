package Genericos.TP2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> listaInteger = new ArrayList<>();
        listaInteger.add(1);
        listaInteger.add(2);
        listaInteger.add(3);

        List<String> listaString = new ArrayList<>();
        listaString.add("Hola");
        listaString.add("Mundo");
        listaString.add("!");

        imprimirLista.imprimir(listaInteger);
        imprimirLista.imprimir(listaString);

    }
}
