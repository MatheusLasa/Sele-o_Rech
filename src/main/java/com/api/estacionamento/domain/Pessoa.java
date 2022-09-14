package com.api.estacionamento.domain;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@EqualsAndHashCode(of = "id")
@ToString(of = "id")

public class Pessoa implements Serializable  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (nullable = false)
    private String nome;

    @Column (nullable = false)
    private String cpf;

    @Column (nullable = false)
    private String apartamento;

    @Column
    private String nascimento;

    @Column (nullable = false)
    private Long telefone;

    @OneToMany(mappedBy = "pessoa")
    private List<Veiculo> veiculos = new ArrayList<>();



}
