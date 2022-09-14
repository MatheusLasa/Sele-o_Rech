package com.api.estacionamento.mapper;

import com.api.estacionamento.controllers.response.PessoaResponse;
import com.api.estacionamento.domain.Pessoa;

public class PessoaMapper {



        public static PessoaResponse toResponse(Pessoa pessoa) {
            PessoaResponse pessoaResponse = new PessoaResponse();

            pessoaResponse.setId(pessoa.getId());
            pessoaResponse.setNome(pessoa.getNome());
            pessoaResponse.setCpf(pessoa.getCpf());
            pessoaResponse.setApartamento(pessoa.getApartamento());
            pessoaResponse.setDataNascimento(pessoa.getNascimento());
            pessoaResponse.setTelefone(pessoa.getTelefone());


            return pessoaResponse;

        }
    }

