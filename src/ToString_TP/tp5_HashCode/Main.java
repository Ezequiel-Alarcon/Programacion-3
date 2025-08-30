package ToString_TP.tp5_HashCode;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto(101, "Arroz", 100.0);
        Producto p2 = new Producto(101, "Arroz Oferta", 95.0); // mismo código que p1
        Producto p3 = new Producto(102, "Fideo", 80.0);
        Producto p4 = new Producto(103, "Aceite", 300.0);
        Producto p5 = new Producto(101, "Arroz Premium", 120.0); // mismo código que p1

        Set<Producto> set = new HashSet<>();
        set.add(p1);
        set.add(p2); // NO se agrega porque equals/hashCode dicen que ya existe
        set.add(p3);
        set.add(p4);
        set.add(p5); // tampoco se agrega (mismo código que p1)

        System.out.println("Productos en el HashSet:");
        for (Producto p : set) {
            System.out.println(p);
        }
    }
}

