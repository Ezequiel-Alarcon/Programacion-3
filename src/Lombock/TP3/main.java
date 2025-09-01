package Lombock.TP3;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        // Creamos algunos Productos completos
        Producto p1 = new Producto("12345", "Libro de Java", 29.99, "Juan Perez");
        Producto p2 = new Producto("67890", "Libro de Python", 39.99, "Maria Gomez");
        Producto p3 = new Producto("11223", "Libro de C++", 49.99, "Carlos Ruiz");

        // Creamos los DTO a partir de los productos
        ProductoDTO dto1 = new ProductoDTO(p1.getCodigo(), p1.getNombre(), p1.getPrecio());
        ProductoDTO dto2 = new ProductoDTO(p2.getCodigo(), p2.getNombre(), p2.getPrecio());
        ProductoDTO dto3 = new ProductoDTO(p3.getCodigo(), p3.getNombre(), p3.getPrecio());

        // Guardamos los DTO en una lista
        List<ProductoDTO> listaDTO = new ArrayList<>();
        listaDTO.add(dto1);
        listaDTO.add(dto2);
        listaDTO.add(dto3);

        // Mostramos la lista en consola
        for (ProductoDTO dto : listaDTO) {
            System.out.println(dto);
        }
    }
}
