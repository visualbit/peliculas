package com.visualbit.peliculas.service;

import com.visualbit.peliculas.domain.Peliculas;
import com.visualbit.peliculas.repository.PeliculasRepository;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class PeliculaService {

    private final PeliculasRepository peliculasRepository;

    //Se crea el repositorio que va a interactuar con las base de datos
    public PeliculaService(PeliculasRepository peliculasRepository) {
        this.peliculasRepository = peliculasRepository;
    }

    public List<Peliculas> buscarDestacados()
    {
        return peliculasRepository.findAll();


/*
        Pelicula pelicula = new Pelicula();
        pelicula.setTitulo("Crónicas de Narnia");
        pelicula.setDescripcion("Las Crónicas de Narnia es una heptalogía de libros juveniles escrita por el escritor y profesor anglo-irlandés C. S. Lewis entre 1950 y 1956, e ilustrado, en su versión original, por Pauline Baynes");
        pelicula.setImagenUrl("https://i.blogs.es/03b94d/chronicles-narnia-02/450_1000.jpg");
        destacados.add(pelicula);

        pelicula = new Pelicula();
        pelicula.setTitulo("Patines de plata");
        pelicula.setDescripcion("En los ríos y canales helados de San Petersburgo, un ladrón en patines intenta conquistar el corazón de la hija de un aristócrata, pero gente muy poderosa trata de separarlos.");
        pelicula.setImagenUrl("https://finde.latercera.com/wp-content/uploads/2021/06/Patines-de-plata-1-700x450.jpg");
        destacados.add(pelicula);

        pelicula = new Pelicula();
        pelicula.setTitulo("Crónicas de Narnia");
        pelicula.setDescripcion("Las Crónicas de Narnia es una heptalogía de libros juveniles escrita por el escritor y profesor anglo-irlandés C. S. Lewis entre 1950 y 1956, e ilustrado, en su versión original, por Pauline Baynes");
        pelicula.setImagenUrl("https://i.blogs.es/03b94d/chronicles-narnia-02/450_1000.jpg");
        destacados.add(pelicula);

        pelicula = new Pelicula();
        pelicula.setTitulo("Patines de plata");
        pelicula.setDescripcion("En los ríos y canales helados de San Petersburgo, un ladrón en patines intenta conquistar el corazón de la hija de un aristócrata, pero gente muy poderosa trata de separarlos.");
        pelicula.setImagenUrl("https://finde.latercera.com/wp-content/uploads/2021/06/Patines-de-plata-1-700x450.jpg");
        destacados.add(pelicula);

        return destacados;*/

    }
}
