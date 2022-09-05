package com.visualbit.peliculas.repository;

import com.visualbit.peliculas.domain.Peliculas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeliculasRepository extends JpaRepository<Peliculas, Integer> {
}
