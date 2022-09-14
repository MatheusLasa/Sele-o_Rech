package com.api.estacionamento.controllers.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class PessoaResponse {

    private Long id;

    private String nome;

    private String cpf;

    private String apartamento;

    private String dataNascimento;

    private Long telefone;
}
