package com.alura.jdbc.com.alura.jdbc.modelo;

public class Producto {

    private Integer id;

    private String nombre;

    private String descripcion;

    private Integer cantidad;

    public Producto(String nombre, String descripcion, Integer cantidad) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return String.format(
                "{id: %s, nombre: %s, descripcion: %s, cantidad: %d}",
                this.id,
                this.nombre,
                this.descripcion,
                this.cantidad);
    }

}