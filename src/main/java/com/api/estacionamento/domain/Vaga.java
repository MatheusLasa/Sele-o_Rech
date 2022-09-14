package com.api.estacionamento.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@Entity
@EqualsAndHashCode(of = "id")
@ToString(of = "id")

public class Vaga {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private int numeroVaga;

    @OneToOne
    @JoinColumn(name = "veiculo_id")
    private Veiculo veiculo;
}
