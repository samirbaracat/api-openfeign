package com.samdevweb.apiopenfeign.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "usuario")
public class Usuario {
    
    @Id
    private String id;

    private String nome;
    private String email;

    @Column(name = "cep")
    private String cep;

    private String logradouro;
    private String bairro;
    private String cidade;
    private String estado;
    private String uf;

    @Column(name = "data_registro")
    private LocalDateTime dataRegistro;


}
