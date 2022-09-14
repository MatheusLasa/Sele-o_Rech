package com.api.estacionamento.services;

import com.api.estacionamento.controllers.response.VeiculoResponse;
import com.api.estacionamento.mapper.VeiculoMapper;
import com.api.estacionamento.repositories.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class ListarVeiculosService {

    @Autowired
    private VeiculoRepository veiculoRepository;
    public List<VeiculoResponse> listarV() {
        //lista todos os veiculos do banco
        return veiculoRepository.findAll().stream()
                .map(VeiculoMapper::toResponse).collect(Collectors.toList());


    }
}
