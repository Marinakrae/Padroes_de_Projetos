package br.ufsm.csi.model;

import br.ufsm.csi.model.Movimentacao.TipoMovimentacao;

public class Banco {

    private Long NUM_CONTA = 0L;
    private String nome;
    private Long codigoBacen;
    private ContaBancaria[] contasBancarias = new ContaBancaria[0];

    public Banco() {

    }

    //criação de contas
    public void CriarConta(ContaBancaria contaBancaria) {

        contaBancaria.setNumero(++NUM_CONTA);

        for(int i = 0; i < this.contasBancarias.length; ++i) {
            if (contasBancarias[i] == null) {
                contasBancarias[i] = contaBancaria;
                return;
            }
        }

        ContaBancaria[] arrNovo = new ContaBancaria[this.contasBancarias.length + 1];
        System.arraycopy(contasBancarias, 0, arrNovo, 0, this.contasBancarias.length);
        arrNovo[this.contasBancarias.length] = contaBancaria;
        this.contasBancarias = arrNovo;
    }

    //exclusão de contas
    public boolean ExcluirConta(ContaBancaria contaBancaria){
        for(int i = 0; i < this.contasBancarias.length; ++i) {
            if (contasBancarias[i].getNumero().equals(contaBancaria.getNumero())) {
                contasBancarias[i] = null;
                return true;
            }
        }

        return false;
    }

    private ContaBancaria findConta(Long numero) {
        for (ContaBancaria conta : contasBancarias) {
            if (conta.getNumero().equals(numero)) return conta;
        }
        return null;
    }

    //saques - uma conta corrente só pode fazer saques desde que o valor não exceda o limite de saque -limite +saldo-
    public boolean saque(Long numero, Double valor) {
        ContaBancaria conta = this.findConta(numero);
        if (conta != null) {
            Movimentacao movimentacao = new Movimentacao("saque", TipoMovimentacao.DEBITO, -valor);
            return conta.processaMovimentacao(movimentacao);
        }
        return false;

    }

    //depósitos
    public boolean deposito(Long numero, Double valor) {
        ContaBancaria conta = this.findConta(numero);
        if (conta != null) {
            Movimentacao movimentacao = new Movimentacao("saque", TipoMovimentacao.CREDITO, valor);
            return conta.processaMovimentacao(movimentacao);
        } else {
            return false;
        }
    }

    public Double getSaldo(Long numero) {
        ContaBancaria conta = this.findConta(numero);
        return conta != null ? conta.getSaldo() : null;
    }
}

