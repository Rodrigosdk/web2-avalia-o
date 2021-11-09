package com.unifip.Prova.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
public class Conta {
    private Long id;
    private String descricao;
    private Long valor;
    private Status status = Status.PENDENTE;
}
