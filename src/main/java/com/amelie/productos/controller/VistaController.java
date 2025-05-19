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

    @GetMapping("/vista")
    public String vistaLibros(org.springframework.ui.Model model) {
        model.addAttribute("libros", libroService.obtenerTodos());
        return "libros"; // busca libros.html en src/main/resources/templates
    }

}
