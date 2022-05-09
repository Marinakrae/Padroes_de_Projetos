package br.ufsm.csi.model;

import java.util.Map;

public class TesteDesempenho {

    public static void main(String[] args) {
        Banco banco = new Banco("Banco Teste");
        long time = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            ContaCorrente conta = new ContaCorrente();
            conta.setEspecial(true);
            conta.setLimite(200.0);
            banco.criaConta(conta);
        }
        System.out.println("Tempo decorrido insercao: " + (System.currentTimeMillis() - time) + "ms");
        time = System.currentTimeMillis();
        for (Map.Entry<Long, ContaBancaria> entry : banco.getContasBancarias().entrySet()) {
            banco.saque(entry.getKey(), 30.0);
        }
        System.out.println("Tempo decorrido busca: " + (System.currentTimeMillis() - time) + "ms");
    }

}
