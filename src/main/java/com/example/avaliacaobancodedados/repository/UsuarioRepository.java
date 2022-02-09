package com.example.avaliacaobancodedados.repository;

import com.example.avaliacaobancodedados.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Cliente,Long> {
}
