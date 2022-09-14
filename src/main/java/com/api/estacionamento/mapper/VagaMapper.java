package com.api.estacionamento.mapper;

import com.api.estacionamento.controllers.response.VagaResponse;
import com.api.estacionamento.domain.Vaga;

public class VagaMapper {


    public static VagaResponse toResponse(Vaga vaga) {
        VagaResponse vagaResponse = new VagaResponse();

        vagaResponse.setId(vaga.getId());
        vagaResponse.setNumeroVaga(vaga.getNumeroVaga());

        return vagaResponse;
    }
}