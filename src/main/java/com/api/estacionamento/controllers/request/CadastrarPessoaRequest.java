package com.api.estacionamento.controllers.request;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter

public class CadastrarPessoaRequest {

    @NotBlank
    private String nome;

    private String cpf;

    @NotBlank
    private String apartamento;

    @NotBlank
    private String dataNascimento;

    @NotNull
    private Long telefone;
}
