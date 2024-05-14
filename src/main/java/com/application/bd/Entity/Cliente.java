package com.application.bd.Entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "clave_c")
    private Integer id; // Cambiado a Integer

    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;

    @Column(name = "direccion", nullable = false, length = 50)
    private String direccion;

    @Column(name = "correo", nullable = false, length = 50)
    private String correo;

    @Column(name = "telefono", nullable = false, length = 15)
    private int telefono;

    public Cliente() {

    }

    public Cliente(String nombre, String direccion, String correo, int telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
    }

    public Integer getId() { // Cambiado a Integer
        return id;
    }

    public void setId(Integer id) { // Cambiado a Integer
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente [id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", correo=" + correo
                + ", telefono=" + telefono + "]";
    }
}
