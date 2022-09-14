package com.api.estacionamento.services;

import com.api.estacionamento.controllers.request.CadastrarPessoaRequest;
import com.api.estacionamento.controllers.response.PessoaResponse;
import com.api.estacionamento.domain.Pessoa;
import com.api.estacionamento.mapper.PessoaMapper;
import com.api.estacionamento.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CadastrarPessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;


    public PessoaResponse cadastrar(CadastrarPessoaRequest request) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(request.getNome());
        pessoa.setCpf(request.getCpf());
        pessoa.setApartamento(request.getApartamento());
        pessoa.setNascimento(request.getDataNascimento());
        pessoa.setTelefone(request.getTelefone());


        pessoaRepository.save(pessoa);

        return PessoaMapper.toResponse(pessoa);
    }
}
