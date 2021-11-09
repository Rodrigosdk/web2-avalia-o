package com.unifip.Prova.model;

public enum Status {
    PENDENTE("PENDENTE"), PAGO("PAGO"), CANCELADO("CANCELADO");

    private String status;

    Status(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }
}