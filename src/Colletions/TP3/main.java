package Colletions.TP3;

import java.util.HashSet;
import java.util.Set;

public class main {
    public static void main(String[] args) {
        Producto producto1 = new Producto(521891445, "Arroz");
        Producto producto2 = new Producto(546454654, "Fideo");
        Producto producto3 = new Producto(458318545, "Carne");
        Producto producto4 = new Producto(454591565, "Pollo");
        Producto producto5 = new Producto(521891445, "Arroz");

        Set<Producto> productos = new HashSet<Producto>();
        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
        productos.add(producto4);
        productos.add(producto5);

        for (Producto producto : productos) {
            System.out.println("Codigo: " + producto.getCodigo() + " - Descripcion: " + producto.getDescripcion());
        }
    }
}
