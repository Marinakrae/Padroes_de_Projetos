package br.ufsm.csi.model;

public class Movimentacao {
    private String descricao;
    private TipoMovimentacao tipoMovimentacao;
    private Double valor;

    public Movimentacao() {
    }

    public Movimentacao(String descricao, Movimentacao.TipoMovimentacao tipoMovimentacao, Double valor) {
        this.descricao = descricao;
        this.tipoMovimentacao = tipoMovimentacao;
        this.valor = valor;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public TipoMovimentacao getTipoMovimentacao() {
        return tipoMovimentacao;
    }

    public void setTipoMovimentacao(Movimentacao.TipoMovimentacao tipoMovimentacao) {
        this.tipoMovimentacao = tipoMovimentacao;
    }

    public Double getValor() {
        return this.valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public static enum TipoMovimentacao {
        CREDITO,
        DEBITO,
        RENDIMENTO_FINANCEIRO;

        private TipoMovimentacao() {
        }
    }
}
