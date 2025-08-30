package ToString_TP.tp4_Equals;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto(123,"Arroz", 100.0);
        Producto p2 = new Producto(123,"Arroz", 100.0);
        Producto p3 = new Producto(12345,"Fideo", 80.0);

        List<Producto> lista = new ArrayList<>();
        if (!lista.contains(p1)) lista.add(p1);
        if (!lista.contains(p2)) lista.add(p2); // NO lo agrega porque tiene mismo código
        if (!lista.contains(p3)) lista.add(p3);

        System.out.println("Lista de productos:");
        for (Producto p : lista) {
            System.out.println(p);
        }
    }
}
