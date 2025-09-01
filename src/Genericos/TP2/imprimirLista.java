package Genericos.TP2;

import java.util.List;

public class imprimirLista <T> {

    public static <T> void imprimir(List<T> lista) {
        for (T elemento : lista) {
            System.out.println(elemento);
        }
    }
}
