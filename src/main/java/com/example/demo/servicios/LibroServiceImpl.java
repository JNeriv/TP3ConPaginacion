package com.example.demo.servicios;

import com.example.demo.entidades.Libro;
import com.example.demo.repositorios.LibroRepository;
import com.example.demo.repositorios.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroServiceImpl extends BaseServiceImpl<Libro, Long> implements LibroService{
    @Autowired
    private LibroRepository libroRepository;
    public LibroServiceImpl(BaseRepository<Libro, Long> baseRepository) {
        super(baseRepository);
    }
}