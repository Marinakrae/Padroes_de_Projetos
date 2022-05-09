package br.ufsm.csi.model;

import java.util.Objects;

public abstract class ContaBancaria {

    private Long numero;
    private Double saldo;
    private Movimentacao[] movimentacoes;

    public enum TipoConta { CONTA_CORRENTE, POUPANCA, RENDA_FIXA, RENDA_VARIAVEL}

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

    public void setMovimentacoes(Movimentacao[] movimentacoes) {
        this.movimentacoes = movimentacoes;
    }

    public ContaBancaria(Long numero) {
        this.numero = numero;
        this.saldo = 0.0;
    }

    public Movimentacao[] getMovimentacoes() {
        Movimentacao[] movCopy = new Movimentacao[movimentacoes.length];
        System.arraycopy(movimentacoes, 0, movCopy, 0, movimentacoes.length);
        return movCopy;
    }

    public void adicionaMovimentacao(Movimentacao movimentacao){
        Movimentacao[] movCopy = new Movimentacao[movimentacoes.length + 1];
        System.arraycopy(movimentacoes, 0, movCopy, 0, movimentacoes.length);
        movCopy[movCopy.length -1] = movimentacao;
        this.movimentacoes = movCopy;
        this.saldo += movimentacao.getValor();
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
