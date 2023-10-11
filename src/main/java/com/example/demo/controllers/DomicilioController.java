package com.example.demo.controllers;

import com.example.demo.entidades.Domicilio;
import com.example.demo.servicios.DomicilioServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Pageable;

@RestController
//CrossOrigin nos permite dar acceso a nuestra api desde distintos origenes (clientes)
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/domicilios")
public class DomicilioController extends BaseControllerImpl<Domicilio, DomicilioServiceImpl>{


    @Override
    public ResponseEntity<?> getAll(Pageable pageable) {
        return null;
    }
}
