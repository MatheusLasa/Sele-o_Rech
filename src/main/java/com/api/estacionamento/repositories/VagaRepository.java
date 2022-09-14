package com.api.estacionamento.repositories;

import com.api.estacionamento.domain.Vaga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface VagaRepository extends JpaRepository<Vaga, Long> {
    List<Vaga> findAllByVeiculoPessoaId(Long id);

    Vaga findByVeiculoId(Long id);
}
