package com.api.estacionamento.controllers.response;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class VeiculoResponse {

    private Long id;

    private String placa;

    private String modelo;

    private String marca;

    private int ano;


}
