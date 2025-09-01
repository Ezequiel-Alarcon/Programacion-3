package Lombock.TP4;

public class Producto {
    private String codigo;
    private String nombre;
    private double precio;
    private String proveedor;

    public Producto() {
    }

    public Producto(String codigo, String nombre, double precio, String proveedor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.proveedor = proveedor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
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

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", Proveedor='" + proveedor + '\'' +
                '}';
    }
}
