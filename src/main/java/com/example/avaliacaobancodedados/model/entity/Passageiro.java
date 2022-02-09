package com.example.avaliacaobancodedados.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Passageiro {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String cpf;
    private String nome;
    private String email;
    private String telefone;
}
