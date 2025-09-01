package Lombock.TP4;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Producto p1 = new Producto("001", "Libro de Java", 29.99, "Juan Perez");
        Producto p2 = new Producto("002", "Libro de Python", 39.99, "Maria Gomez");
        Producto p3 = new Producto("003", "Libro de C++", 49.99, "Carlos Ruiz");

        ProductoRecord productoRecord = new ProductoRecord(p1.getCodigo(), p1.getNombre(), p1.getPrecio());
        ProductoRecord productoRecord2 = new ProductoRecord(p2.getCodigo(), p2.getNombre(), p2.getPrecio());
        ProductoRecord productoRecord3 = new ProductoRecord(p3.getCodigo(), p3.getNombre(), p3.getPrecio());

        List<ProductoRecord> listaProductoRecord = new ArrayList<>();
        listaProductoRecord.add(productoRecord);
        listaProductoRecord.add(productoRecord2);
        listaProductoRecord.add(productoRecord3);

        List<Producto> listaProducto = new ArrayList<>();
        listaProducto.add(p1);
        listaProducto.add(p2);
        listaProducto.add(p3);

        System.out.println("Lista de Productos:");
        for (Producto p : listaProducto) {
            System.out.println(p);
        }

        System.out.println("\nLista de ProductoRecords:");
        for (ProductoRecord pr : listaProductoRecord) {
            System.out.println(pr);
        }
    }
}
