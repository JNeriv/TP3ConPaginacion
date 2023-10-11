package com.example.demo.servicios;

import com.example.demo.entidades.Domicilio;
import com.example.demo.repositorios.DomicilioRepository;
import com.example.demo.repositorios.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DomicilioServiceImpl extends BaseServiceImpl<Domicilio, Long> implements DomicilioService{
    @Autowired
    private DomicilioRepository domicilioRepository;
    public DomicilioServiceImpl(BaseRepository<Domicilio, Long> baseRepository) {
        super(baseRepository);
    }
}