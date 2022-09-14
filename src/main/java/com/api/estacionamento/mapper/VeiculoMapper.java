package com.api.estacionamento.mapper;

import com.api.estacionamento.controllers.response.VeiculoResponse;
import com.api.estacionamento.domain.Veiculo;

public class VeiculoMapper {
    public static VeiculoResponse toResponse(Veiculo veiculo) {
        VeiculoResponse veiculoResponse = new VeiculoResponse();

        veiculoResponse.setId(veiculo.getId());
        veiculoResponse.setPlaca(veiculo.getPlaca());
        veiculoResponse.setModelo(veiculo.getModelo());
        veiculoResponse.setMarca(veiculo.getMarca());
        veiculoResponse.setAno(veiculo.getAno());


        return veiculoResponse;

    }
}
