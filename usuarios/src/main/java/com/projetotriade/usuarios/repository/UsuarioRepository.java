package com.projetotriade.usuarios.repository;

import com.projetotriade.usuarios.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    // Métodos de CRUD já vêm do JpaRepository
}