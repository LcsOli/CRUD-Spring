package com.workshop.CRUD.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workshop.CRUD.Entities.Usuarios;
import com.workshop.CRUD.Repositories.UsuarioRepository;

@Service

public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public Usuarios create(Usuarios usuario) {
        return repository.save(usuario);
    }

}
