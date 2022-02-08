package com.example.avaliacaobancodedados.repository;

import com.example.avaliacaobancodedados.model.entity.Passagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassagemRepository extends JpaRepository<Passagem,Long> {
}
