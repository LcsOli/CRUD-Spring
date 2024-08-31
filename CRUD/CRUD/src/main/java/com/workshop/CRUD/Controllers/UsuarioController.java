package com.workshop.CRUD.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workshop.CRUD.Services.UsuarioService;

@RestController
@RequestMapping("/users")
public class UsuarioController {

    @Autowired
    private UsuarioService service;

}
