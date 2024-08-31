package com.workshop.CRUD.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.workshop.CRUD.Entities.Usuarios;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuarios, Integer> {

}
