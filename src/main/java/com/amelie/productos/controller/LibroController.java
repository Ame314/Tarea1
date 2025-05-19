package com.amelie.productos.controller;

import com.amelie.productos.model.Libro;
import com.amelie.productos.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;  // <-- Esta línea falta
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/libros")
@CrossOrigin(origins = "*")
public class LibroController {
    @Autowired
    private LibroService libroService;

    @GetMapping
    @ResponseBody
    public List<Libro> obtenerTodos() {
        return libroService.obtenerTodos();
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Optional<Libro> obtenerPorId(@PathVariable String id) {
        return libroService.obtenerPorId(id);
    }

    @PostMapping
    @ResponseBody
    public Libro crearLibro(@RequestBody Libro libro) {
        return libroService.guardarLibro(libro);
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public void eliminarLibro(@PathVariable String id) {
        libroService.eliminarLibro(id);
    }
    
    @GetMapping("/vista")
    public String vistaLibros(Model model) {
        model.addAttribute("libros", libroService.obtenerTodos());
        return "libros"; // sin .html
    }
}
