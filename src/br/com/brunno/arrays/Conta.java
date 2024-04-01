package br.com.brunno.arrays;

public class Conta {
    private String numero;
    private float saldo;

    public Conta(String numeroDaConta, float saldoInicial){
        numero = numeroDaConta;
        saldo = saldoInicial;
    }

    public float getSaldo(){
        return this.saldo;
    }

    public String getNumero(){
        return this.numero;
    }

    public void debitar(float valor){
        this.saldo = this.saldo - valor;
        System.out.println("Saldo atual: " + this.saldo);
    }
    public void creditar(float valor){
       this.saldo = this.saldo + valor;
       System.out.println("Saldo atual: " + this.saldo);
    }

}
