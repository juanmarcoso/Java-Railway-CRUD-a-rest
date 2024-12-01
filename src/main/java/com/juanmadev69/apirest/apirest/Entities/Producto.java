package com.juanmadev69.apirest.apirest.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity //Ya Java va a intepretar que Producto va a ser de tipo "Entidad"
public class Producto {

    /*
     * El primer atributo que vamos a hacer de clase que vamos a hacer va a ser el 'Id'
     * el cual va a ser el identificador unico de cada producto que hagamos
     * y va a ser la 'clave primaria' de nuestra base de datos.
     * Se va a autogenerar y autoincrementar de forma ascendente
    */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private double precio;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
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
    
}
