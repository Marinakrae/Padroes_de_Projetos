package br.ufsm.csi.model;

public class FundoRendaVariavel extends ContaBancaria{

    public FundoRendaVariavel(Long numero) {
        super(numero);
    }

    @Override
    public Double getIRDevido() {
        double IR = 0.0;
        for (Movimentacao movimentacao : this.getMovimentacoes()) {
            if (movimentacao.getTipoMovimentacao() == Movimentacao.TipoMovimentacao.RENDIMENTO_FINANCEIRO) {
                IR += movimentacao.getValor() * 0.275;
            }
        }
        return IR;
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
