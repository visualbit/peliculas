package com.visualbit.peliculas.domain;

import javax.persistence.*;

@Entity
public class Peliculas {

    @Id
    @GeneratedValue (strategy =GenerationType.AUTO)
    private Integer id;
    private String titulo;
    private String descripcion;
    private String imagenUrl;

    @ManyToOne
    @JoinColumn(name="generoId")
    private GeneroPelicula generopelicula;

    public GeneroPelicula getGeneropelicula() {
        return generopelicula;
    }

    public void setGeneropelicula(GeneroPelicula generopelicula) {
        this.generopelicula = generopelicula;
    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagenUrl() {
        return imagenUrl;
    }

    public void setImagenUrl(String imagenUrl) {
        this.imagenUrl = imagenUrl;
    }
}
