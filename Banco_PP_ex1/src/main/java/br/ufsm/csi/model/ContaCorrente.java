package br.ufsm.csi.model;

public class ContaCorrente extends ContaBancaria{

    private boolean especial;
    private Double limite;

    public ContaCorrente(Long numero, boolean especial, Double limite) {
        super(numero);
        this.especial = especial;
        this.limite = limite;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public ContaCorrente(Long numero) {
        super(numero);
    }

    @Override
    public Double getIRDevido() {
        return 0.0;
    }

    @Override
    public boolean processaMovimentacao(Movimentacao movimentacao) {
        double limiteSaque = (especial ? getSaldo() + getLimite() : getSaldo());
        if (movimentacao.getTipoMovimentacao() == Movimentacao.TipoMovimentacao.DEBITO
                && Math.abs(movimentacao.getValor()) > limiteSaque
        ) {
            return false;
        }
        adicionaMovimentacao(movimentacao);
        return true;
    }

}
