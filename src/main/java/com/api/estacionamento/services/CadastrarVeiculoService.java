package com.api.estacionamento.services;

import com.api.estacionamento.controllers.request.CadastrarVeiculoRequest;
import com.api.estacionamento.controllers.response.VeiculoResponse;
import com.api.estacionamento.domain.Pessoa;
import com.api.estacionamento.domain.Veiculo;
import com.api.estacionamento.mapper.VeiculoMapper;
import com.api.estacionamento.repositories.PessoaRepository;
import com.api.estacionamento.repositories.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastrarVeiculoService {

    @Autowired
    private VeiculoRepository veiculoRepository;

    @Autowired
    private PessoaRepository pessoaRepository;
    public VeiculoResponse cadastrar(CadastrarVeiculoRequest request) {
        Pessoa pessoa = pessoaRepository.findById(request.getPessoaId()).get();
        Veiculo veiculo = new Veiculo();

        veiculo.setPlaca(request.getPlaca());
        veiculo.setModelo(request.getModelo());
        veiculo.setMarca(request.getMarca());
        veiculo.setAno(request.getAno());
        veiculo.setPessoa(pessoa);


        veiculoRepository.save(veiculo);
        return VeiculoMapper.toResponse(veiculo);
    }
}
