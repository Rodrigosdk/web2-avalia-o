package com.unifip.Prova.controller;

import java.util.HashMap;
import java.util.Map;

import com.unifip.Prova.model.Conta;
import com.unifip.Prova.model.Status;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/contas")
public class ContaController {
    private Map<Long, Conta> contaDB = new HashMap<>();

    @ResponseStatus(code = HttpStatus.CREATED)
    @RequestMapping(value = "", method = RequestMethod.POST)
    public void cadastrarConta(@RequestBody Conta conta) {
        conta.setStatus(Status.PENDENTE);
        this.contaDB.put(conta.getId(), conta);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public Map<Long, Conta> listarContas() {
        return contaDB;
    }

    
/** @ResponseStatus(code = HttpStatus.NO_CONTENT)
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public void cancelarConta() {
    }

    @RequestMapping(value = "", method = RequestMethod.PUT)
    public void pagarConta() {
    }

    

    @RequestMapping(value = "", method = RequestMethod.GET)
    public void buscarContaID() {
    
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public void contasStatus() {
    }
     */
   
}
