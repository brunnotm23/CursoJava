package br.com.brunno.reescritametodos;

public class ContaEspecial extends ContaBancaria {

    private float limite;

    public ContaEspecial(String cliente, int numConta, float saldo, float limite){
        super(cliente, numConta, saldo);
        this.limite = limite;
    }

    void sacar(float valor){
        if((this.getSaldo() - valor) >= (this.limite*-1))
            this.setSaldo(this.getSaldo() - valor);
        else
            System.out.println("Você não pode sacar além do limite!");
    }

    public float getLimite() {
        return limite;
    }
    public void setLimite(float limite) {
        this.limite = limite;
    }
}
