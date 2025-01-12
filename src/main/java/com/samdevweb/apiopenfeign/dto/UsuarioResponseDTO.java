package com.samdevweb.apiopenfeign.dto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UsuarioResponseDTO {
    
    private String id;
    private String nome;
    private String email;

    private String cep;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String estado;

    private CovidDTO covidInfo;

    private LocalDateTime dataRegistro;

}
