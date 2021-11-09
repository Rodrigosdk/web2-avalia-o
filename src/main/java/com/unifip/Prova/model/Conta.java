package com.unifip.Prova.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
public class Conta {
    private Long id;
    private String descricao;
    private Long valor;
    @Builder.Default
    private Status status = Status.PENDENTE;
}
