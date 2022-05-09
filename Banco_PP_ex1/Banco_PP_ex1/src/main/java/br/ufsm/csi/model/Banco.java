package br.ufsm.csi.model;

import br.ufsm.csi.model.Movimentacao.TipoMovimentacao;
import br.ufsm.csi.reflexao.MinhaAnnotation;

import java.util.Map;
import java.util.TreeMap;

public class Banco {

    private Long NUM_CONTA = 0L;
    private String nome;
    private Long codigoBacen;
    private Map<Long, ContaBancaria> contasBancarias = new TreeMap<>();

    public Banco() { }

    public Banco(String nome) {
        this.nome = nome;
    }

    @MinhaAnnotation(nome = "CriarConta")
    public void criaConta(ContaBancaria contaBancaria) {
        contaBancaria.setNumero(++NUM_CONTA);
        contasBancarias.put(contaBancaria.getNumero(), contaBancaria);
    }

    @MinhaAnnotation
    public boolean removeConta(ContaBancaria contaBancaria) {
        return contasBancarias.remove(contaBancaria.getNumero()) != null;
    }

    /*private ContaBancaria findConta(Long numero) {
        for (ContaBancaria conta : contasBancarias) {
            if (conta.getNumero().equals(numero)) return conta;
        }
        return null;
    } */

    //saques - uma conta corrente só pode fazer saques desde que o valor não exceda o limite de saque -limite +saldo-
    public boolean saque(Long numero, Double valor) {
        ContaBancaria conta = contasBancarias.get(numero);
        if (conta != null) {
            Movimentacao movimentacao = new Movimentacao("saque",
                    Movimentacao.TipoMovimentacao.DEBITO,
                    -valor);
            return conta.processaMovimentacao(movimentacao);
        }
        return false;

    }

    //depósitos
    public boolean deposito(Long numero, Double valor) {
        ContaBancaria conta = contasBancarias.get(numero);
        if (conta != null) {
            Movimentacao movimentacao = new Movimentacao("saque",
                    Movimentacao.TipoMovimentacao.CREDITO,
                    valor);
            return conta.processaMovimentacao(movimentacao);
        }
        return false;
    }

    public Double getSaldo(Long numero) {
        ContaBancaria conta = contasBancarias.get(numero);
        if (conta != null) {
            return conta.getSaldo();
        }
        return null;
    }

    public Map<Long, ContaBancaria> getContasBancarias() {
        return contasBancarias;
    }
}

