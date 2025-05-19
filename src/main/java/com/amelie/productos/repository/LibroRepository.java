package com.amelie.productos.repository;

import com.amelie.productos.model.Libro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends CrudRepository<Libro, Long> {
    // Puedes agregar métodos personalizados si los necesitas
}
