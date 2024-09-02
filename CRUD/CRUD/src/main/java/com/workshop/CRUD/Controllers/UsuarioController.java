package com.workshop.CRUD.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workshop.CRUD.Entities.Usuarios;
import com.workshop.CRUD.Services.UsuarioService;

@RestController
@RequestMapping("/users")
public class UsuarioController {

    @Autowired
    private UsuarioService service;

@PostMapping()
public ResponseEntity<Usuarios> create(@RequestBody Usuarios Usuarios){
    return new ResponseEntity<>(service.create(Usuarios), HttpStatus.CREATED);
}

}
