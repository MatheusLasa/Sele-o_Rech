package com.api.estacionamento.domain;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@EqualsAndHashCode(of = "id")
@ToString(of = "id")

public class Veiculo implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (nullable = false, unique = true )
    private String placa;

    @Column (nullable = false)
    private String modelo;

    @Column (nullable = false)
    private String marca;

    @Column (nullable = false)
    private int ano;

    @ManyToOne
    @JoinColumn(name = "pessoa_id")
    private Pessoa pessoa;




}
