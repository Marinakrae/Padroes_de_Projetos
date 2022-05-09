package br.ufsm.csi.model;

public class Poupanca extends ContaBancaria{

    public Poupanca(Long numero) {
        super(numero);
    }

    @Override
    public Double getIRDevido() {
        return 0.0;
    }

    @Override
    public boolean processaMovimentacao(Movimentacao movimentacao) {
        if (movimentacao.getTipoMovimentacao() == Movimentacao.TipoMovimentacao.DEBITO
                && Math.abs(movimentacao.getValor()) > getSaldo()
        ) {
            return false;
        }
        adicionaMovimentacao(movimentacao);
        return true;
    }
}
