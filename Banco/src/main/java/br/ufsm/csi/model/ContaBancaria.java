package br.ufsm.csi.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class ContaBancaria {

    private Long numero;
    private Double saldo = 0.0;
    private List<Movimentacao> movimentacoes = new ArrayList<>();

    //public enum TipoConta { CONTA_CORRENTE, POUPANCA, RENDA_FIXA, RENDA_VARIAVEL}

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public ContaBancaria() {}

    public List<Movimentacao> getMovimentacoes() {
        return movimentacoes;
    }

    public void setMovimentacoes(List<Movimentacao> movimentacoes) {
        this.movimentacoes = movimentacoes;
    }

    protected void adicionaMovimentacao(Movimentacao movimentacao) {
        movimentacoes.add(movimentacao);
    }

    public ContaBancaria(Long numero) {
        this.numero = numero;
        this.saldo = 0.0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContaBancaria that = (ContaBancaria) o;
        return Objects.equals(numero, that.numero);
    }

    public abstract boolean processaMovimentacao(Movimentacao movimentacao);

    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }

    public abstract Double getIRDevido();
}
