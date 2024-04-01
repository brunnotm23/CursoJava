package br.com.brunno.associacoes;

public class Poupanca {
    private float saldo;

    void saque(float valor){
        this.saldo = this.saldo - valor;
    }
    void deposita(float valor){
        this.saldo = this.saldo + valor;
    }
}
