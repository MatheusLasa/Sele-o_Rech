package com.api.estacionamento.controllers;



import com.api.estacionamento.controllers.request.CadastrarPessoaRequest;
import com.api.estacionamento.controllers.request.CadastrarVeiculoRequest;
import com.api.estacionamento.controllers.response.PessoaResponse;
import com.api.estacionamento.controllers.response.VagaResponse;
import com.api.estacionamento.dtos.EstacionamentoDto;
import com.api.estacionamento.domain.Veiculo;
import com.api.estacionamento.controllers.response.VeiculoResponse;
import com.api.estacionamento.services.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/estacionamento")

public class EstacionamentoController {

    final EstacionamentoService estacionamentoService;


    public EstacionamentoController(EstacionamentoService estacionamentoService) {
        this.estacionamentoService = estacionamentoService;
    }

    @Autowired
    private DeletarVeiculoService deletarVeiculoService;
    @Autowired
    private ListarVeiculosService listarVeiculosService;
    @Autowired
    private ListarVagasService listarVagasService;

    @Autowired
    private CadastrarVeiculoService cadastrarVeiculoService;

    //Listar veiculos
    @GetMapping("/listarVeiculos")
    public List<VeiculoResponse> listarVeiculos(){
        return listarVeiculosService.listarV();
    }

    //Deletar veiculo pelo id
    @DeleteMapping(value = "/{id}/deletarV")
    public void deletarVeiculo(@PathVariable Long id){ deletarVeiculoService.deletarV(id);}

    //Listar Vagas com id da pessoa
    @GetMapping("/{id}/listarVagas")
    public List<VagaResponse> listarVagas(@PathVariable Long id){
        return listarVagasService.listarVg(id);
    }

    //Cadastrar Veiculo
    @PostMapping
    public VeiculoResponse cadastrarVeiculo(@Valid @RequestBody CadastrarVeiculoRequest request){
        return cadastrarVeiculoService.cadastrar(request);
    }




}
