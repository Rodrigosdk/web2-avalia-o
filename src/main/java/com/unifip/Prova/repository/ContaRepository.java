package com.unifip.Prova.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.unifip.Prova.model.Conta;
import com.unifip.Prova.model.Status;

public class ContaRepository {
    private List<String> statusConta = new ArrayList<>();
    private Map<Long, Conta> contaDB = new HashMap<>();
    
    public void cadastrarConta(Conta conta) {
        conta.setStatus(Status.PENDENTE);
        this.contaDB.put(conta.getId(), conta);
    }

    public void cancelarConta(Long id) {
        Conta conta = this.contaDB.get(id);
        conta.setStatus(Status.CANCELADO);
    }

    public void pagarConta(Long id) {
        Conta conta = this.contaDB.get(id);
        conta.setStatus(Status.PAGO);
        this.contaDB.put(id, conta);
    }

    public Map<Long, Conta> listarContas() {
        return contaDB;
    }

    public Conta buscarContaID(Long id) {
        return this.contaDB.get(id);
    }

    public List<String> contasStatus() {
        for (int i = 0; i < this.contaDB.size(); i++) {
            Conta conta = this.contaDB.get(Long.valueOf(i));  
            this.statusConta.add(conta.getStatus().getStatus());
        }
        return this.statusConta;
    }
}
