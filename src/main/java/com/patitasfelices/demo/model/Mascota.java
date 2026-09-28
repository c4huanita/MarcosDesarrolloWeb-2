package com.patitasfelices.demo.model;

public class Mascota {
    private Long id;
    private String nombre;
    private String raza;
    private String edad;
    private String sexo;
    private String tamano;
    private String personalidad;
    private String descripcion;
    private String imagen;

    public Mascota(Long id, String nombre, String raza, String edad, String sexo, String tamano, String personalidad, String descripcion, String imagen) {
        this.id = id;
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.sexo = sexo;
        this.tamano = tamano;
        this.personalidad = personalidad;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getRaza() { return raza; }
    public void setRaza(String raza) { this.raza = raza; }

    public String getEdad() { return edad; }
    public void setEdad(String edad) { this.edad = edad; }

    public String getSexo() { return sexo; }
    public void setSexo(String sexo) { this.sexo = sexo; }

    public String getTamano() { return tamano; }
    public void setTamano(String tamano) { this.tamano = tamano; }

    public String getPersonalidad() { return personalidad; }
    public void setPersonalidad(String personalidad) { this.personalidad = personalidad; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public String getImagen() { return imagen; }
    public void setImagen(String imagen) { this.imagen = imagen; }
}

