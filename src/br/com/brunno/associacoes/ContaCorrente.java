package br.com.brunno.associacoes;

public class ContaCorrente {

    private float saldo;

    public void deposita(float valor){
        this.saldo = this.saldo + valor;
    }
    public void saque(float valor){
        this.saldo = this.saldo - valor;
    }
}
