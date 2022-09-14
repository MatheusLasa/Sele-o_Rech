package com.api.estacionamento.controllers.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class CadastrarVeiculoRequest {

    @NotBlank
    private String placa;

    @NotBlank
    private String modelo;

    @NotBlank
    private String marca;


    private int ano;

    private Long pessoaId;
}
