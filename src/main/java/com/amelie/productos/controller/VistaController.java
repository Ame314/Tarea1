package com.amelie.productos.controller;

import com.amelie.productos.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class VistaController {

    @Autowired
    private LibroService libroService;

    @GetMapping("/libros/vista")
    public String vistaLibros(Model model) {
        model.addAttribute("libros", libroService.obtenerTodos());
        return "libros"; // Va a buscar libros.html en templates
    }
}
