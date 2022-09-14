package com.api.estacionamento.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class EstacionamentoDto {


    @NotBlank
    @Size(max = 7)
    private String placa;
    @NotBlank
    private String modelo;
    @NotBlank
    private String marca;
    @NotBlank
    private int ano;



    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
