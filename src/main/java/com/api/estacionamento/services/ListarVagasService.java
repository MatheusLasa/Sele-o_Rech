package com.api.estacionamento.services;

import com.api.estacionamento.controllers.response.VagaResponse;
import com.api.estacionamento.mapper.VagaMapper;
import com.api.estacionamento.repositories.VagaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ListarVagasService {
    @Autowired
    private VagaRepository vagaRepository;
    public List<VagaResponse> listarVg(Long id) {

        return vagaRepository.findAllByVeiculoPessoaId(id).stream()
                .map(VagaMapper::toResponse).collect(Collectors.toList());


    }
}
