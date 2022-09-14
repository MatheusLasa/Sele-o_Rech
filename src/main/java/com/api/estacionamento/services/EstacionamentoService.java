package com.api.estacionamento.services;

import com.api.estacionamento.domain.Veiculo;
import com.api.estacionamento.repositories.VeiculoRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class EstacionamentoService {

    final VeiculoRepository veiculoRepository;

    public EstacionamentoService(VeiculoRepository veiculoRepository){

        this.veiculoRepository = veiculoRepository;
    }

    @Transactional
    public Veiculo save(Veiculo veiculo) {
        return veiculoRepository.save(veiculo);
    }
}
