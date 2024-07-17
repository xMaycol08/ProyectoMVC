
package proyecto.modelo.utpl;

import java.util.Date;


public class Producto {
    private String nombre,apellido,numero_telefono,categoria,nombre_Producto;
    private int cantidad_Stock,total_Factura,iva;
    private Date fecha_Caducidad;

    public Producto() {
    }

    public Producto(String nombre, String apellido, String numero_telefono, String categoria, String nombre_Producto, int cantidad_Stock, int total_Factura, int iva, Date fecha_Caducidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numero_telefono = numero_telefono;
        this.categoria = categoria;
        this.nombre_Producto = nombre_Producto;
        this.cantidad_Stock = cantidad_Stock;
        this.total_Factura = total_Factura;
        this.iva = iva;
        this.fecha_Caducidad = fecha_Caducidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumero_telefono() {
        return numero_telefono;
    }

    public void setNumero_telefono(String numero_telefono) {
        this.numero_telefono = numero_telefono;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNombre_Producto() {
        return nombre_Producto;
    }

    public void setNombre_Producto(String nombre_Producto) {
        this.nombre_Producto = nombre_Producto;
    }

    public int getCantidad_Stock() {
        return cantidad_Stock;
    }

    public void setCantidad_Stock(int cantidad_Stock) {
        this.cantidad_Stock = cantidad_Stock;
    }

    public int getTotal_Factura() {
        return total_Factura;
    }

    public void setTotal_Factura(int total_Factura) {
        this.total_Factura = total_Factura;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public Date getFecha_Caducidad() {
        return fecha_Caducidad;
    }

    public void setFecha_Caducidad(Date fecha_Caducidad) {
        this.fecha_Caducidad = fecha_Caducidad;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", apellido=" + apellido + ", numero_telefono=" + numero_telefono + ", categoria=" + categoria + ", nombre_Producto=" + nombre_Producto + ", cantidad_Stock=" + cantidad_Stock + ", total_Factura=" + total_Factura + ", iva=" + iva + ", fecha_Caducidad=" + fecha_Caducidad + '}';
    }
    
    
}
