package com.unifip.Prova.controller;

import java.util.List;
import java.util.Map;

import com.unifip.Prova.model.Conta;
import com.unifip.Prova.services.ContaServices;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/contas")
public class ContaController {
    private ContaServices contaServices = new ContaServices();

    @ResponseStatus(code = HttpStatus.CREATED)
    @RequestMapping(value = "", method = RequestMethod.POST)
    public void cadastrarConta(@RequestBody Conta conta) {
        contaServices.cadastrarConta(conta);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public Map<Long, Conta> listarContas() {
        return contaServices.listarContas();
    }

    @RequestMapping(value = "/pagar", method = RequestMethod.PUT)
    public void pagarConta(@RequestParam Long id) {
        contaServices.pagarConta(id);
    }

    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public void cancelarConta(@RequestParam Long id) {
        contaServices.cancelarConta(id);
    }

    @RequestMapping(value = "/buscar", method = RequestMethod.GET)
    public Conta buscarContaID(@RequestParam Long id) {
       return contaServices.buscarContaID(id);
    }

    @RequestMapping(value = "/contasStatus", method = RequestMethod.GET)
    public List<String>  contasStatus() {
        return contaServices.contasStatus();
    }
}
