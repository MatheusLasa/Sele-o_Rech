package com.api.estacionamento.services;

import com.api.estacionamento.controllers.response.PessoaResponse;
import com.api.estacionamento.mapper.PessoaMapper;
import com.api.estacionamento.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ListarPessoasService {

    @Autowired
    private PessoaRepository pessoaRepository;
    public List<PessoaResponse> listarP() {

        return pessoaRepository.findAll().stream()
                .map(PessoaMapper::toResponse).collect(Collectors.toList());


    }
}
