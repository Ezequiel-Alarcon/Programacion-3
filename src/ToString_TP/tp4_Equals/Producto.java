package ToString_TP.tp4_Equals;

import java.util.Objects;

public class Producto {
    private int codigo;
    private String nombre;
    private double precio;

    public Producto() {
    }

    public Producto(int codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // mismo objeto
        if (obj == null || getClass() != obj.getClass()) return false; // distinto tipo
        Producto producto = (Producto) obj;
        return codigo == producto.codigo; // igualdad solo por código
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo); // debe coincidir con equals
    }

}
