package com.unifip.Prova.services;

import java.util.List;
import java.util.Map;

import com.unifip.Prova.model.Conta;
import com.unifip.Prova.repository.ContaRepository;

public class ContaServices {
    
    private ContaRepository contaRepository = new ContaRepository();
    
    public void cadastrarConta(Conta conta) {
        contaRepository.cadastrarConta(conta);
    }

    public void cancelarConta(Long id) {
        contaRepository.cancelarConta(id);
    }

    public void pagarConta(Long id) {
        contaRepository.pagarConta(id);
    }

    public Map<Long, Conta> listarContas() {
        return contaRepository.listarContas();
    }

    public Conta buscarContaID(Long id) {
        return contaRepository.buscarContaID(id);
    }

    public List<String> contasStatus() {
        return contaRepository.contasStatus();
    }

}
