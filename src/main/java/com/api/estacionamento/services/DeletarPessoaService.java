package com.api.estacionamento.services;

import com.api.estacionamento.domain.Pessoa;
import com.api.estacionamento.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeletarPessoaService {
    @Autowired
    private PessoaRepository pessoaRepository;
    public void deletar(Long id) {
        Pessoa pessoa = pessoaRepository.findById(id).get();
        pessoaRepository.delete(pessoa);
    }


}
