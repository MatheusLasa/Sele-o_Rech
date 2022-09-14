package com.api.estacionamento.services;

import com.api.estacionamento.controllers.response.VeiculoResponse;
import com.api.estacionamento.domain.Veiculo;
import com.api.estacionamento.mapper.VeiculoMapper;
import com.api.estacionamento.repositories.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ConsultarVeiculosService {

    @Autowired
    private VeiculoRepository veiculoRepository;

    //Passando Id por
    public List<VeiculoResponse> consultar(Long id) {
        List<Veiculo> veiculos = veiculoRepository.findAllByPessoaId(id);

        return veiculos.stream()
                .map(VeiculoMapper::toResponse).collect(Collectors.toList());
    }
}
