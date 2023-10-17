package model.entidades;

import model.excecoes.ExcecoesDeDominio;

public class Conta {
    private Integer numero;
    private String titular;
    private double saldo;
    private double limiteSaque;

    public Conta(Integer numero, String titular, double saldo, double limiteSaque) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

    public void deposito(double quantia) {
        saldo += quantia;
    }

    public void saque(double quantia) {
        validaSaque(quantia);
        saldo -= quantia;
    }

    private void validaSaque(double quantia) {
        if (quantia > getLimiteSaque()) {
            throw new ExcecoesDeDominio("Erro de saque: Quantia excede o limite de saque");
        }
        if (quantia > getSaldo()) {
            throw new ExcecoesDeDominio("Erro de saque: Saldo insuficiente ");
        }
    }
}


