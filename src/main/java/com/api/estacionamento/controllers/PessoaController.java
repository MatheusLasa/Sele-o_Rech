package com.api.estacionamento.controllers;

import com.api.estacionamento.controllers.request.CadastrarPessoaRequest;
import com.api.estacionamento.controllers.response.PessoaResponse;
import com.api.estacionamento.controllers.response.VeiculoResponse;
import com.api.estacionamento.services.CadastrarPessoaService;
import com.api.estacionamento.services.ConsultarVeiculosService;
import com.api.estacionamento.services.DeletarPessoaService;
import com.api.estacionamento.services.ListarPessoasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
@RestController
@RequestMapping("/pessoas")

public class PessoaController {
    @Autowired
    private DeletarPessoaService deletarPessoaService;
    @Autowired
    private ListarPessoasService listarPessoasService;
    @Autowired
    private CadastrarPessoaService cadastrarPessoaService;
    @Autowired
    private ConsultarVeiculosService consularVeiculosService;

    @GetMapping("/listarPessoas") public List<PessoaResponse> listarPessoas(){
        return listarPessoasService.listarP();
    }

    //Delete pessoa
    @DeleteMapping(value = "/{id}/deletar")
    public void deletarPessoa(@PathVariable Long id){
        deletarPessoaService.deletar(id);
    }

    //Cadastrar pessoa
    @PostMapping
    public PessoaResponse cadastrarPessoa(@Valid @RequestBody CadastrarPessoaRequest request){
        return cadastrarPessoaService.cadastrar(request);
    }

    @GetMapping(value = "/{id}/consultarVeiculos")
    public List<VeiculoResponse> consultaVeiculos(@PathVariable Long id){
        return consularVeiculosService.consultar(id);
    }



}
