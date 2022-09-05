package com.visualbit.peliculas.controller;

import com.visualbit.peliculas.domain.Peliculas;
import com.visualbit.peliculas.service.PeliculaService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import org.springframework.ui.Model;

@Controller
public class ListadoController {

    private final PeliculaService peliculaService;

    public ListadoController(PeliculaService peliculaService) {
        this.peliculaService = peliculaService;
    }



    @RequestMapping ("/")
    public String listarPeliculas(Model model){

        List<Peliculas> destacados = peliculaService.buscarDestacados();
        model.addAttribute("peliculas", destacados);

        return "listado";
    }


}
