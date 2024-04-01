package br.com.brunno.associacoes;

import br.com.brunno.arrays.Conta;

public class Banco {
    Poupanca[] pops;
    ContaCorrente[] cc;
    int numContas, numPoupancas;

    void iniciaBanco(){
        pops = new Poupanca[100];
        cc = new ContaCorrente[100];
        numContas = 0;
        numPoupancas = 0;
    }
    void abreConta(){
        cc[numContas] = new ContaCorrente();
        numContas++;
    }
    void abrePoupanca(){
        pops[numPoupancas] = new Poupanca();
        numPoupancas++;
    }
    void falencia(){
        for(int i=0; i<100; i++){
            pops[i] = null;
            cc[i] = null;
        }
    }

}
