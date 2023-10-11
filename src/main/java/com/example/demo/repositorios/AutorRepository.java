package com.example.demo.repositorios;

import com.example.demo.entidades.Autor;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends BaseRepository<Autor,Long> {
}
