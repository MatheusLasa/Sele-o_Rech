package com.api.estacionamento.services;

import com.api.estacionamento.domain.Vaga;
import com.api.estacionamento.domain.Veiculo;
import com.api.estacionamento.repositories.VagaRepository;
import com.api.estacionamento.repositories.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class DeletarVeiculoService {

    @Autowired
    private VeiculoRepository veiculoRepository;
    @Autowired
    private VagaRepository vagaRepository;

    public void deletarV(Long id) {
        Veiculo veiculo = veiculoRepository.findById(id).get();
        Vaga vaga = vagaRepository.findByVeiculoId(veiculo.getId());
        if(Objects.nonNull(vaga)){
            vaga.setVeiculo(null);
            vagaRepository.save(vaga);
        }


        veiculoRepository.delete(veiculo);
    }


}
